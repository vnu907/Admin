package com.vaz.flight.enums;

public enum SeatClass {
	FIRST("FIRST"), BUSINESS("BUSINESS"), PREMIUM_ECONOMY("PREMIUM_ECONOMY"), BASIC_ECONOMY("BASIC_ECONOMY"),
	ECONOMY("ECONOMY");

	public final String label;

	SeatClass(String label) {
		this.label = label;
	}
}