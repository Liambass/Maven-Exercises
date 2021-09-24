package com.qa.calc;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class CalculatorUnitTestMockito {
	
	@Mock
	private Adder adder;
	
	@Mock
	private Subtractor subtractor;
	
	@Mock
	private Multiplier multipler;
	
	@Mock
	private Divider divider;
	
	@InjectMocks
	private Calculator calculator;
	
	@Test
	public void addTest() {
		Mockito.when(adder.add(5, 5)).thenReturn(10);
		
		assertEquals(10, calculator.add(5, 5));
		
		verify(adder, times(1)).add(Mockito.anyInt(), Mockito.anyInt());
	}
	
	@Test
	public void subTest() { // Complete this code
		Mockito.when(subtractor.sub(10, 5)).thenReturn(5);
		
		assertEquals(5, calculator.sub(10, 5));
		
	}
	
	@Test
	public void mulTest() { // Complete this code
		Mockito.when(multipler.mul(10, 5)).thenReturn(50);
		
		assertEquals(50, calculator.mul(10, 5));
	}
	
	@Test
	public void divTest() { // Complete this code
		Mockito.when(divider.div(10, 5)).thenReturn(2.0);
		
		assertEquals(2.0, calculator.div(10, 5), 0);
	}
	
}
