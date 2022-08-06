package week1.day1;

public class TwoWheeler {
	int noOfWheels = 2;
	short noOfMirrors = 2;
	long chassisNumber = 67687776;
	boolean isPunctured = false;
	String bikeName = "YAMAHA";
	double runningKM = 45312.12;
	public static void main(String[] args) {
		TwoWheeler tw= new TwoWheeler();
		System.out.println("No Of Wheels = "+ tw.noOfWheels+" \nNo Of Mirrors = "+ tw.noOfMirrors+" \nChassis Number = "+ tw.chassisNumber+" \nDid Wheel Punctured? "+ tw.isPunctured+" \nBike Name = "+ tw.bikeName+" \nRunning KM = "+ tw.runningKM);
	}

}
