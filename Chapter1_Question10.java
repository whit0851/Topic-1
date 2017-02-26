
public class Chapter1_Question10 {
	public static void main(String[] args) {
		double miles;
		double kilometers;
		double minutes;
		double hours;
		double seconds;
		double mins;
		double MilesperHour;
		
		seconds=30;
		minutes=45;
		kilometers=14;
		miles = kilometers * 1.0/1.6;
		mins = seconds / 60;
		hours = (minutes + mins) / 60;
		MilesperHour = miles / hours; 
			System.out.print("The average speed in Miles/Hour is " + MilesperHour + ".\n");
		
		
	}
}
