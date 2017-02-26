import java.util.Scanner;
public class Chapter2_Question20 {
	public static void main(String[] args){
		double balance;
		double api;
		double interest;
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter balance and interest rate (e.g., 3 for 3%): \n");
		balance = input.nextDouble();
		api = input.nextDouble();
		interest = balance * (api/1200);
		
		System.out.print("The interest is " + interest + ".\n");
	}
}
