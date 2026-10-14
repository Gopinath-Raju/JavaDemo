package org.bank;

public class AxisBank extends BankInfo {
	public void deposit() {
		System.out.println("Deposit");
	}
	public static void main(String[] args) {
		AxisBank A=new AxisBank();
		A.saving();
		A.fixed();
		A.deposit();
	}
}
