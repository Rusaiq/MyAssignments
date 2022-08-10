package week1.day2;

public class PrintDuplicatesInArray {
	public static void main(String[] args) {
	int[] a= {14,12,13,11,15,14,18,16,17,19,18,17,20};
	for(int i=0; i<a.length;i++)
	{
		for(int j=i+1; j<a.length; j++)
		{
			if(a[i]==a[j])
			{
				System.out.println("Duplicate Array Value " +a[j]);
			} 	
		}
	}
	

}
}