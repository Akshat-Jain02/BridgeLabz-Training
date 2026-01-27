package com.day02.dealtracker;

import java.io.*;
import java.time.LocalDate;
import java.util.*;
import java.util.regex.*;

public class DealTracker<T extends Deal> {

	private Map<String, T> dealsByCode;
	public DealTracker() {
		dealsByCode = new HashMap<>();
	}

	public void loadDeals(String filePath) throws IOException, InvalidDealException {

		Pattern codePattern = Pattern.compile("DealCode:\\s*(.+)");
		Pattern datePattern = Pattern.compile("ValidTill:\\s*(\\d{2}-\\d{2}-\\d{4})");
		Pattern discountPattern = Pattern.compile("Discount:\\s*(\\d+)%");
		Pattern minPattern = Pattern.compile("MinimumPurchase:\\s*(\\d+)");

		try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
			String line;
			String code = null, date = null, discount = null, minPurchase = null;

			while ((line = br.readLine()) != null) {
				line = line.trim();

				if (line.isEmpty()) {
		
					if (code != null && date != null && discount != null && minPurchase != null) {

						T deal = (T) new Deal(code, date, discount, minPurchase);
					
						if (dealsByCode.containsKey(code)) {
							System.out.println("Duplicate deal code skipped: " + code);

						} else {
							dealsByCode.put(code, deal);
						}
					}
			
					code = date = discount = minPurchase = null;
					continue;
				}

				Matcher m;
				if ((m = codePattern.matcher(line)).matches()) {
					code = m.group(1);
				} else if ((m = datePattern.matcher(line)).matches()) {
					date = m.group(1);
				} else if ((m = discountPattern.matcher(line)).matches()) {
					discount = m.group(1);
				} else if ((m = minPattern.matcher(line)).matches()) {
					minPurchase = m.group(1);
				}
			}

			if (code != null && date != null && discount != null && minPurchase != null) {
				T deal = (T) new Deal(code, date, discount, minPurchase);

				if (!dealsByCode.containsKey(code)) {
					dealsByCode.put(code, deal);
				}
			}
		}
	}

	public void showActiveDeals() {
		LocalDate today = LocalDate.of(2026, 1, 26);

		System.out.println("Active Deals (sorted by discount % descending):");
		System.out.println("---------------------------------------------------------------");

		dealsByCode.values().stream().filter(deal -> !deal.isExpired(today))
				.sorted((a, b) -> Integer.compare(b.getDiscountPercent(), a.getDiscountPercent()))
				.forEach(System.out::println);

		System.out.println("---------------------------------------------------------------");
		System.out.println(
				"Total active deals: " + dealsByCode.values().stream().filter(d -> !d.isExpired(today)).count());
	}

	public void showDealCodes() {
		System.out.println("\nAll Deal Codes (unique):");
		dealsByCode.keySet().stream().sorted().forEach(System.out::println);
		System.out.println("Total unique codes: " + dealsByCode.size());
	}
}
