import java.util.*;
public class Chapter4_Question17 {
	public static void main(String[] args){
		int year;
		int a;
		int b = 15;
		String sj ="jan";
		String sf ="feb";
		String sm ="mar";
		String sa ="apr";
		String sma ="may";
		String sjun = "jun";
		String sjul ="jul";
		String sau ="aug";
		String ss ="sep";
		String so ="oct";
		String sn ="nov";
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter a year: \n");
		year = input.nextInt();
		input.nextLine();
		System.out.print("Enter a month: \n");
		String s1 = input.nextLine();
		String s2 = s1;
		s1 = s1.toLowerCase();
		input.close();
		
		if(s1.contains(sj))
				a = 0;
		else if(s1.contains(sf))
				a = 1;
		else if(s1.contains(sm))
				a = 2;
		else if(s1.contains(sa))
				a = 3;
		else if(s1.contains(sma))
				a = 4;
		else if(s1.contains(sjun))
				a = 5;
		else if(s1.contains(sjul))
				a = 6;
		else if(s1.contains(sau))
				a = 7;
		else if(s1.contains(ss))
				a = 8;
		else if(s1.contains(so))
				a = 9;
		else if(s1.contains(sn))
				a = 10;
		else 
				a = 11;
			Calendar calender1 = new GregorianCalendar(year,a, b);
			
			System.out.println(s2 + " "+ year + " has " + calender1.getActualMaximum(Calendar.DAY_OF_MONTH) + " days");
		}
	}

