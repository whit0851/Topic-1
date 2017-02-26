import java.util.Scanner;
public class Chapter2_Question5 {
	public static void main(String[] args){
	double Subtotal;
	double rate;
	double total;
	double gratuity;
	
	Scanner input = new Scanner(System.in);
	
	System.out.print("Enter the subtotal and a gratuity rate: \n");
	
	Subtotal = input.nextDouble();
	rate = input.nextDouble();
	
	gratuity = (rate/100)*Subtotal;
	total = gratuity + Subtotal;
	
	System.out.print("The gratuity is $" + gratuity + " and total is $" + total + ".\n");
	}
}
