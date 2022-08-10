package week1.day2;

public class FibonacciSeries {
	public static void main(String[] args) {
		int firstnum=1,secondnum=0,sum=0;
		System.out.println("The Fibonacci Series are \n"+sum);
		int num = 1;
		while(num < 11)
		{
			sum=firstnum+secondnum;
			System.out.println(sum+ "");
			firstnum=secondnum;
			secondnum=sum;
			num++;
		}
	}

}
