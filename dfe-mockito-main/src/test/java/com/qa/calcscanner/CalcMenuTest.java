package com.qa.calcscanner;

import static org.mockito.Mockito.never;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;


@RunWith(MockitoJUnitRunner.class)
public class CalcMenuTest {
	// Write a suite of tests that tests different paths through the menu() method
	// Consider the different possibilities in the 'switch/case'
	// Control output from the input class with Mockito

	// First mock dependency
	@Mock
	private Input input;

	// Second mock dependency
	@Mock
	private CalculatorScanner calc;
	
	// Inject mocks
	@InjectMocks
	private CalcMenu menu;
	
	// Write tests here
	@Test
	public void testMenu1() {
		Mockito.when(input.getString()).thenReturn("1", "0");
		Mockito.when(input.getInt()).thenReturn(1, 5);
		menu.menu();
		verify(calc, times(1)).add(1, 5);
	}
	
	@Test
	public void testMenu2() {
		Mockito.when(input.getString()).thenReturn("2", "0");
		Mockito.when(input.getInt()).thenReturn(1, 5);
		menu.menu();
		verify(calc, times(1)).sub(1, 5);
	}
	
	@Test
	public void testMenu3() {
		Mockito.when(input.getString()).thenReturn("3", "0");
		Mockito.when(input.getInt()).thenReturn(1, 5);
		menu.menu();
		verify(calc, times(1)).mul(1, 5);
	}
	
	@Test
	public void testMenu4() {
		Mockito.when(input.getString()).thenReturn("4", "0");
		Mockito.when(input.getInt()).thenReturn(10, 2);
		menu.menu();
		verify(calc, times(1)).div(10, 2);
	}
	
	@Test
	public void testMenuX() {
		Mockito.when(input.getString()).thenReturn("X", "0");
		menu.menu();
		verify(input, never()).getInt();
	}
	
	
	
}
