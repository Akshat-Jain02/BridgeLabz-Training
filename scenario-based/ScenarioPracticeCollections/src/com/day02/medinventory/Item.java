package com.day02.medinventory;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Item {
	private String id;
	private String name;
	private int quantity;
	private LocalDate expiryDate;

	public Item(String id, String name, int quantity, String expiryStr) {
		this.id = id.trim();
		this.name = name.trim();
		this.quantity = quantity;
		DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd-MM-yyyy");
		this.expiryDate = LocalDate.parse(expiryStr.trim(), fmt);
	}

	public boolean isExpired(LocalDate today) {
		return expiryDate.isBefore(today);
	}

	public boolean isLowStock() {
		return quantity < 10;
	}

	public String getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o)
			return true;
		if (o == null || getClass() != o.getClass())
			return false;
		Item item = (Item) o;
		return id.equals(item.id);
	}

	@Override
	public int hashCode() {
		return id.hashCode();
	}

	@Override
	public String toString() {
		return id + " | " + name + " | Qty: " + quantity + " | Expiry: " + expiryDate;
	}
}
