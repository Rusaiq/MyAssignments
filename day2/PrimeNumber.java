package week1.day2;

public class PrimeNumber {
	public static void main(String[] args) {
			int N = 10;
			int j = 2;

			for (int i = 2; i <= N; i++) {
				int c=0;

				for (j = 2; j < i; j++)  {

					if (i % j == 0) {
						c++;
						break;
					}
				}
				if (c == 0) {
					System.out.println(i + " is a Prime ");

				} else {
					System.out.println(i + " is not a Prime ");
				}

			}

		}
	
}


