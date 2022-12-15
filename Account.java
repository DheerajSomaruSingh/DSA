package com.OptionMenu;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Account {
	Scanner input = new Scanner(System.in);
	DecimalFormat moneyFormat = new DecimalFormat("'$'###,##0.00");
	
	public int setCustomerNumber(int customerNumber) {
		this.customerNumber = customerNumber;
		return customerNumber;
	}
	
	public int getCustomerNumber() {
		return customerNumber;
	}
	
	public int setPinNumber(int PinNumber) {
		this.PinNumber = PinNumber;
		return PinNumber;
	}
	
	public int getPinNumber() {
		return PinNumber;
	}
	
	public double getCheckingBalance() {
		return checkingBalance;
	}
	
	public double getSavingBalance() {
		return savingBalance;
	}
	
	public double calcCheckingWithdraw(double amount) {
		checkingBalance = (checkingBalance - amount);
		return checkingBalance;
	}
	
	public double calcSavingWithdraw(double amount) {
		savingBalance = (savingBalance - amount);
		return savingBalance;
	}
	
	public double calcCheckingDeposit(double amount) {
		checkingBalance = (checkingBalance + amount);
		return checkingBalance;
	}
	
	public double calcSavingDeposit(double amount) {
		savingBalance = (savingBalance + amount);
		return savingBalance;
	}
	
	public void getCheckingWithdrawInput() {
		System.out.println("checking account balance" + moneyFormat.format(checkingBalance));
		System.out.println("amount you want to withdraw from checking amount:");
		double amount = input.nextDouble();
		
		if((checkingBalance - amount) >= 0) {
			calcCheckingWithdraw(amount);
			System.out.println("new checking account balance:" + moneyFormat.format(checkingBalance));
		}
		else {
			System.out.println("balance cannot be negetive" + "\n");
		}
	}
	
	public void getSavingWithdrawInput() {
		System.out.println("Saving account balance" + moneyFormat.format(savingBalance));
		System.out.println("amount you want to withdraw from checking amount:");
		double amount = input.nextDouble();
		
		if((savingBalance - amount) >= 0) {
			calcSavingWithdraw(amount);
			System.out.println("new Saving account balance:" + moneyFormat.format(savingBalance));
		}
		else {
			System.out.println("balance cannot be negetive" + "\n");
		}
	}
	
	public void getCheckingDepositInput() {
		System.out.println("checking account balance" + moneyFormat.format(checkingBalance));
		System.out.println("amount you want to deposit from checking amount:");
		double amount = input.nextDouble();
		
		if((checkingBalance + amount) >= 0) {
			calcCheckingDeposit(amount);
			System.out.println("new checking account balance:" + moneyFormat.format(checkingBalance));
		}
		else {
			System.out.println("balance cannot be negetive" + "\n");
		}
	}
	
	public void getSavingDepositInput() {
		System.out.println("Saving account balance" + moneyFormat.format(savingBalance));
		System.out.println("amount you want to deposit from saving amount:");
		double amount = input.nextDouble();
		
		if((savingBalance + amount) >= 0) {
			calcSavingDeposit(amount);
			System.out.println("new Saving account balance:" + moneyFormat.format(savingBalance));
		}
		else {
			System.out.println("balance cannot be negetive" + "\n");
		}
	}
	
	private int customerNumber;
	private int PinNumber;
	private double checkingBalance = 0;
	private double savingBalance = 0;

}
