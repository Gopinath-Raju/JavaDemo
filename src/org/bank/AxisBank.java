package org.bank;

public class AxisBank extends BankInfo {
	public void deposit() {
		System.out.println("Deposit");
	}
	
	private void invest() {
		System.out.println("Invest");

	}
	
	private void withdr() {
		System.out.println("Withdraw");

	}
	public static void main(String[] args) {
		AxisBank A=new AxisBank();
		A.saving();
		A.fixed();
		A.deposit();
		A.invest();
		A.withdr();
	}
}
