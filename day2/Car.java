package week1.day2;

public class Car {
	public void printCarBrand()
	{
		System.out.println("The Car Brand is Audi");
	}
	public String carColor()
	{
		return "The Car Color is Red";
	}
	public int carEngineNumber()
	{
		int a = 4121;
		return a;
	}
	public int sumOfNumbers(int a,int b)
	{
		int c = a+b;
		return c;
	}
	public int multipleOfNumbers(int a, int b)
	{
		int c = a * b;
		return c;
	}
	public double divisionOfNumbers(double a,double b)
	{
		double c = a / b;
		return c;
	}
	public static void main(String[] args) {
		Car obj=new Car();
		obj.printCarBrand();
		String result=obj.carColor();
		System.out.println(result);
		int result1=obj.carEngineNumber();
		System.out.println("The Car Engine Number is " +result1);
		int result2=obj.sumOfNumbers(12, 24);
		System.out.println("Sum of 2 Numbers= " +result2);
		int result3=obj.multipleOfNumbers(23, 34);
		System.out.println("Multiple of 2 Numbers= " +result3);
		double result4=obj.divisionOfNumbers(90,100);
		System.out.println("Division of 2 Numbers= " +result4);
				
	} 
}
