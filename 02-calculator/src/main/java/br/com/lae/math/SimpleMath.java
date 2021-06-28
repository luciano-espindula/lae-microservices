package br.com.lae.math;

public class SimpleMath {
	
	public Double sum(Double numberOne, Double numberTwo) {
		return numberOne + numberTwo;
	}
	
	public Double subtraction(Double numberOne, Double numberTwo) {
		return numberOne - numberTwo;
	}
	
	public Double multiplication(Double numberOne, Double numberTwo) {
		return numberOne * numberTwo;
	}
	
	public Double division(Double numberOne, Double numberTwo) {
		return (numberOne / numberTwo);
	}
	
	public Double average(Double numberOne, Double numberTwo) {
		return (numberOne + numberTwo) / 2D;
	}
	
	public Double sqrt(Double number) {
		return (Double) Math.sqrt(number);
	}
	
}
