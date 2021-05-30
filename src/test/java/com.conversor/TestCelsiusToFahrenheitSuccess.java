package com.conversor;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestCelsiusToFahrenheitSuccess{

	private TemperatureConverter tc;
	private double result;

	@BeforeEach
	public void setup(){
		this.tc = new TemperatureConverter();
		this.result = this.tc.celsiusToFahrenheit( -273.15);
	}
	@Test
	public void testeCelsiusToFahrenheitSucess1(){
		assertEquals( this.result, -459.67);
	}
}
