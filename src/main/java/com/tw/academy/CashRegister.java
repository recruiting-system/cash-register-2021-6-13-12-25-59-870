package com.tw.academy;

public class CashRegister {
	private final Printer printer;

	public CashRegister() {
		this.printer = new Printer();
	}

	void process(Purchase purchase) throws IllegalArgumentException {
		if (purchase.asString() == null || purchase.asString().isEmpty())
			throw new IllegalArgumentException("Purchase is empty");
		printer.print(purchase.asString());
	}
}
