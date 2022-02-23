package com.ejercicios.parte3;

public class SimpleCalculator {

	double firstNumber;
	double secondNumber;
		
	public double getFirstNumber() {
		return firstNumber;
	}
	
	public void setFirstNumber(double firstNumber) {
		this.firstNumber = firstNumber;
	}
	
	public double getSecondNumber() {
		return secondNumber;
	}
	
	public void setSecondNumber(double secondNumber) {
		this.secondNumber = secondNumber;
	}
	
	public double getAdditionResult() {
		double add = getFirstNumber()+getSecondNumber(); 
		return add;
	}
	
	public double getSubtractionResult() {
		double subt = getFirstNumber()-getSecondNumber();
		return subt;
	}
	
	public double getMultiplicationResult() {
		double mult = getFirstNumber()*getSecondNumber();
		return mult;
	}
	
	public double getDivisionResult() {
		if(getSecondNumber()==0) {
			return getSecondNumber();
		} else {
			double div = getFirstNumber()/getSecondNumber();
			return div;
		}
	}
}