package org.bank;

public class AxisBank extends BankInfo {
	public void deposit() {
		System.out.println("Deposit");
	}
	
	private void invest() {
		System.out.println("Invest");

	}
	
	private void cheque() {
		System.out.println("Cheque Book");

	}
	public static void main(String[] args) {
		AxisBank A=new AxisBank();
		A.saving();
		A.fixed();
		A.deposit();
		A.invest();
		A.cheque();
	}
}
