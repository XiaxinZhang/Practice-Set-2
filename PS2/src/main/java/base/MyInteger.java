package base;

import java.lang.Math;

public class MyInteger {
	
	private int iValue;
	
	public MyInteger(int value) {
		this.iValue = value;
	}
	
	public int getiValue() {
		return iValue;

	}
	
	public boolean isEven() {
		
		if ((iValue % 2) == 0)
			return true;

		return false;
	
	}
	
	public boolean isOdd() {
		
		if ((iValue % 2) != 0)
			return true;

		return false;
		
	}
	
	public boolean isPrime() {
		
		for (double i = 2; i <= Math.sqrt(iValue); i++) {
			
			if (iValue % i == 0) {
				return false;
			}
		}
		return true;
	}
	
	public static boolean isEven(int value) {
	
		if ((value % 2) == 0)
			return true;
		
		return false;
	}
	
	public static boolean isOdd(int value) {
		
		if ((value % 2) != 0)
			return true;

		return false;
	}
	
	public static boolean isPrime(int value){
		
		for (double i = 2; i <= Math.sqrt(value); i++){
			
			if(value % i == 0)
				return false;
			}
			return true;
		}
	
	public static boolean isEven(MyInteger value) {
		return value.isEven();
	}
	
	public static boolean isOdd(MyInteger value) {
		return value.isOdd();
	}
	
	public static boolean isPrime(MyInteger value) {
		return value.isPrime();
	}
	
	public boolean equals(int value){
		
		if (iValue == value)
			return true;
		return false;
	}
	
	public boolean equals(MyInteger value){
		return value.equals(iValue);
	}

}