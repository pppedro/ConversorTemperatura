package com.conversor;

import java.util.Scanner;

public class TemperatureConverter{
	public double celsiusToFahrenheit( double cel){
		double fah;

		fah = (1.8 * cel) + 32;

		return fah;
	}
	public static void main( String[] args){
		TemperatureConverter tc;
		Scanner sc;
		double temperature, result;

		sc = new Scanner( System.in);
		tc = new TemperatureConverter();
		while( true){
			temperature = sc.nextDouble();
			result = tc.celsiusToFahrenheit( temperature);
			System.out.println( result+" f");
		}
	}
}