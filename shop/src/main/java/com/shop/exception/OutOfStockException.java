package com.shop.exception;

public class OutOfStockException extends RuntimeException {
	private static final long serialVersionUID = 9122118052034504407L;

	public OutOfStockException(String message) {
		super(message);
	}
}
