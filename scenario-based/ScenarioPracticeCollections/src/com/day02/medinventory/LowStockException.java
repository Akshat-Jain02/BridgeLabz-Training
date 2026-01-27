package com.day02.medinventory;

public class LowStockException extends Exception {
	private static final long serialVersionUID = 1L;

	public LowStockException(String message) {
		super(message);
	}
}
