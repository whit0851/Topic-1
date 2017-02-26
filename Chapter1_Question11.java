import java.text.DecimalFormat;
public class Chapter1_Question11 {
	public static void main(String[] args) {
		double population;
		double count;
		double SpY;
		int year;
		double pop;
		population = 312032486;
		SpY = 31536000;  //seconds per year
		count = 0;
		year = 1;
		DecimalFormat df = new DecimalFormat("###,###.00");
		System.out.print("Initial Population is ");
		System.out.println(df.format(population));
				while (count < 5) {
					pop = population + SpY / 7 - SpY / 13 + SpY / 45;
					System.out.print("Year " + year + " Population is ");
				    System.out.println(df.format(pop));
					count++;
					year++;
					population = pop;
		}
	}
}
