package com.day02.medinventory;

import java.io.*;
import java.time.LocalDate;
import java.util.*;
import java.util.regex.*;

public class MedInventoryManager {

	private Map<String, List<Item>> itemsByCategory;
	
	private Set<Item> uniqueItems;

	public MedInventoryManager() {
		itemsByCategory = new HashMap<>();
		uniqueItems = new HashSet<>();
	}

	public void loadInventory(String filePath) throws IOException, LowStockException {

		Pattern valid = Pattern.compile("^[^,]+,[^,]+,\\d+,\\d{2}-\\d{2}-\\d{4}$");

		try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
			String line;
			int lineNum = 0;

			while ((line = br.readLine()) != null) {
				line = line.trim();
				lineNum++;

				if (line.isEmpty() || line.startsWith("ItemID"))
					continue;

				Matcher m = valid.matcher(line);
				if (!m.matches()) {
					System.out.println("Invalid line " + lineNum + ": " + line);
					continue;
				}

				String[] parts = line.split(",");
				String id = parts[0].trim();
				String name = parts[1].trim();
				int qty = Integer.parseInt(parts[2].trim());
				String exp = parts[3].trim();

				Item item = new Item(id, name, qty, exp);

				if (!uniqueItems.add(item)) {
					System.out.println("Duplicate ID skipped: " + id);
					continue;
				}

				itemsByCategory.computeIfAbsent(name, k -> new ArrayList<>()).add(item);

				if (item.isLowStock()) {
					throw new LowStockException("Low stock: " + name + " (ID: " + id + ", Qty: " + qty + ")");
				}
			}
		}
	}

	public void showExpiredItems() {
		LocalDate today = LocalDate.of(2026, 1, 26);

		System.out.println("Expired Items (as of " + today + "):");
		boolean found = false;

		for (List<Item> list : itemsByCategory.values()) {
			for (Item item : list) {
				if (item.isExpired(today)) {
					System.out.println(item);
					found = true;
				}
			}
		}

		if (!found)
			System.out.println("No expired items.");
	}

	public void showSummary() {
		System.out.println("\nInventory Summary:");
		System.out.println("--------------------------------------------------------------");

		for (Map.Entry<String, List<Item>> entry : itemsByCategory.entrySet()) {
			System.out.println(entry.getKey() + ": " + entry.getValue().size() + " items");
		}

		System.out.println("--------------------------------------------------------------");
		System.out.println("Total unique items: " + uniqueItems.size());
	}
}
