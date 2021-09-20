
package com.liambass.junitexercises;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.BeforeClass;
import org.junit.Test;

public class TemperatureConverterTest {

	static TemperatureConverter c;

	@BeforeClass
	public static void setup() {
		c = new TemperatureConverter();
	}

	@Test
	public void convertFahrenheitToCelsiusTest() {

		assertEquals(5.56, c.convertFahrenheitToCelsius(42), 0.01);
	}

	@Test
	public void convertCelsiusToFahrenheitTest() {

		assertEquals(107.60, c.convertCelsiusToFahrenheit(42), 0.01);

	}

	@Test
	public void convertKelvinToCelsiusTest() {

		assertTrue(-231 == c.convertKelvinToCelsius(42));

	}

	
	@Test
	public void convertCelsiusToKelvinTest() {

		assertTrue(315 == c.convertCelsiusToKelvin(42));

	}
	
	
	@Test
	public void convertKelvinToFahrenheitTest() {

		assertEquals(-383.80, c.convertKelvinToFahrenheit(42), 0.01);
	
	}
	
		@Test
		public void convertFahrenheitToKelvinTest() {

			assertEquals(278.56, c.convertFahrenheitToKelvin(42), 0.01);
	
	
	}
	
	
}