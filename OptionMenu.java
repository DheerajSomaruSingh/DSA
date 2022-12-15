package com.OptionMenu;

import java.io.IOException;
import java.nio.channels.SelectionKey;
import java.security.KeyStore.Entry;
import java.text.DecimalFormat;
import java.util.*;

public class OptionMenu extends Account{
	Scanner menuInput = new Scanner(System.in);
	DecimalFormat moneyFormat = new DecimalFormat("'$'###,##0.00");
	HashMap<Integer, Integer> data = new HashMap<Integer, Integer>();
	
	public void getlogin() throws IOException{
		int x = 1;
		do {
			try {
				data.put(9876543, 9876);
				data.put(8989898 , 1890);
				System.out.println("wel. to the ATM Project");
				
				System.out.println("enter your customer no.");
				setCustomerNumber(menuInput.nextInt());
				
				System.out.println("enter your pin no.");
				setPinNumber(menuInput.nextInt());
			}
			catch (Exception e) {
				System.out.println("n" + "invalid character(s).onlyno." + "\n");
				x = 2;
			}
			for(java.util.Map.Entry<Integer, Integer> entry : data.entrySet()) {
				if(entry.getKey()==getCustomerNumber() && entry.getValue()==getPinNumber()) {
					getAccountType();
				}
			}
			System.out.println("\n" + "wrong cust number or pin no" + "\n");
		}
		while(x==1);
	}
	public void getAccountType() {
		System.out.println("select the account you want to access");
		System.out.println("Type1 - checking Account");
		System.out.println("Type2 - saving Account");
		System.out.println("Type3 - Exit");
		
		selection = menuInput.nextInt();
		
		switch(selection) {
		case 1:
			getChecking();
			break;
			
		case 2:
			getSaving();
			break;
			
		case 3:
			System.out.println("thank you for using ATM bye");
			break;
			
		default:
			System.out.println("\n" + "Invalid choice" + "\n");
			getAccountType();
		}
	}
	public void getChecking() {
		System.out.println("checking Account:");
		System.out.println("Type1 - view balance");
		System.out.println("Type2 - withdraw funds");
		System.out.println("Type3 - Desposit funds");
		System.out.println("choice : ");
		
		selection = menuInput.nextInt();
		
		switch(selection) {
		case 1:
			System.out.println(" checking account balance" + moneyFormat.format(getCheckingBalance()));
			getAccountType();
			break;
			
		case 2:
			getCheckingWithdrawInput();
			getAccountType();
			break;
			
		case 3:
			getCheckingDepositInput();
			getAccountType();
			break;
			
		case 4:
			System.out.println("thanks for using the ATM, bye");
			break;
			
		default:
			System.out.println("\n" + "invalid syntax" + "\n");
			getChecking();
		}
	}
	
	public void getSaving() {
		System.out.println("saving account ;");
		System.out.println("Type 1 - view balance");
		System.out.println("Type 2 - withdraw funds");
		System.out.println(" Type 3 - deposit funds");
		System.out.println("Type 4 - exit");
		System.out.println("choice:");
		
		selection = menuInput.nextInt();
		
		switch(selection) {
		case 1:
			System.out.println("saving account balance" + moneyFormat.format(getSavingBalance()));
			getAccountType();
			break;
			
		case 2:
			getSavingWithdrawInput();
			getAccountType();
			break;
			
		case 3:
			getSavingDepositInput();
			getAccountType();
			break;
			
		case 4:
			System.out.println("thank use for using the ATM, bye");
			break;
			
		default :
		    System.out.println("\n" + "invalid choice" + "\n");
		    getSaving();
		}
	}
	int selection;
}
