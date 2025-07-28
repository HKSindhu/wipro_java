package day1;

public class Calculator {
	static int powerInt(int num1,int num2) {
		return (int) Math.pow(num1, num2);
	}
	static double powerDouble(double num1,double num2) {
		return Math.pow(num1, num2);
	}

	public static void main(String[] args) {
		int result1=Calculator.powerInt(2,3);
		double result2=Calculator.powerDouble(2.5,3);
		System.out.println("2^3(int)="+result1);
		System.out.println("2.5^3(double)="+result2);
		

	}

}
