import java.util.Scanner;
public class Chapter2_Question4 {
	public static void main(String[] args){
		double pounds;
		double kilos;
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a number in pounds: ");
		pounds = input.nextDouble();
		kilos = pounds * .454;
		System.out.print(pounds + " pounds is " + kilos + " kilosgrams. \n");
	}
}
