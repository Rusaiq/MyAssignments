package week1.day2;

import java.util.Arrays;

public class Task1 {
	public static void main(String[] args) {
		int a[] = {22,67,98,1,34,58,99};
		int length= a.length;
		Arrays.sort(a);
		System.out.println("The Second Largest Number is " + a[length - 2]);
		}
	}


