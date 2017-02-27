import java.util.Scanner;
public class Chapter4_Questions22 {
public static void main(String[] args){
	String s1;
	String s2;
	
	Scanner input = new Scanner(System.in);
	System.out.print("Enter string s1: \n");
	s1 = input.nextLine();
	System.out.print("Enter string s2: \n");
	s2 = input.nextLine();
	if(s1.contains(s2))
		System.out.print(s2 +" is a substring of " + s1 +".\n");
	else
		System.out.print(s2 +" is not a substring of " + s1 +".\n");
	}
}
