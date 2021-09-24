package com.qa.calcscanner;

public class Runner {
	
	public static void main(String[] args) {
		Input input = new Input();
		CalculatorScanner calc = new CalculatorScanner();
		CalcMenu start = new CalcMenu(input, calc); 
		
		start.menu();	
	}
	
}
