package com.heidichen.abstractdemo;

public class PaymentTest {

	public static void main(String[] args) {
//		Payment burger = new Payment(5);
		CashPayment burger = new CashPayment(5);
		burger.pay();
		
		CreditCardPayment boba = new CreditCardPayment(4.99, "4242424242424242", "Heidi", "08/25");
		boba.pay();

	}

}
