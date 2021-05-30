package com.conversor;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestCelsiusToFahrenheitFail{

	private TemperatureConverter tc;
	private double result;

	@BeforeEach
	public void setup(){
		this.tc = new TemperatureConverter();
		this.result = this.tc.celsiusToFahrenheit( 10);
	}
	@Test
	public void testeCelsiusToFahrenheitFail1(){
		assertEquals( this.result, 50.1);
	}
}
