import java.util.Scanner;

public class Chapter2_Question23 {
	public static void main(String[] args) {
		double distance;
		double eff;
		double price;
		double cost;
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the driving distance: ");
		distance = input.nextDouble();
		System.out.print("Enter miles per gallon: ");
		eff = input.nextDouble();
		System.out.print("Enter price per gallon: ");
		price = input.nextDouble();
		
		cost = (distance*price)/eff;
		
		System.out.print("The cost of driving is $" + cost);
		
	}
}
