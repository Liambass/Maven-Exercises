package com.qa.calcscanner;

import java.util.Scanner;

public class Input {

	Scanner scan = new Scanner(System.in);

	public String getString() {
		// TODO Auto-generated method stub#
		return scan.nextLine();

	}

	public int getInt() {
		String input = null;
		Integer integerInput = null;
		boolean flag = true;

		while (flag) {
			try {
				input = getString();
				integerInput = Integer.parseInt(input);
				flag = false;
			} catch (NumberFormatException nfe) {
				System.out.println("Error - please enter a number");

			} 
		}
		return integerInput;

	}
	
	public double getDouble() {
		String input;
		Double doubleInput = null;
		boolean flag = true;
		while(flag) {
			try {
				input = getString();
				doubleInput = Double.parseDouble(input);
				flag = false;
			} catch (NumberFormatException nfe) {
				System.out.println("Error. Please try again and enter a number");
				
			}
		}
		return doubleInput;
	}

}
