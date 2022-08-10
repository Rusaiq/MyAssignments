package week1.day2;

class Calculator {
	public int add(int a, int b, int c)
	{
		int d=a+b+c;
		return d;
	}
	public int sub(int a, int b)
	{
		int c=a-b;
		return c;
	}
	public long mul(int a, int b)
	{
		long c=a*b;
		return c;
	}
	public double div(double a, double b)
	{
		double c=a / b;
		return c;
	}
	
}

public class MyCalculator {
	public static void main(String[] args) {
		Calculator obj=new Calculator();
		int result=obj.add(12, 12, 56);
		System.out.println("Adding 3 Numbers " +result);
		int result1=obj.sub(20, 10);
		System.out.println("Subtracting 2 Numbers " +result1);
		long result2=obj.mul(123, 34);
		System.out.println("Multiple 2 Numbers " +result2);
		double result3=obj.div(200, 10);
		System.out.println("Divide 2 Numbers " +result3);
		}
	
}


