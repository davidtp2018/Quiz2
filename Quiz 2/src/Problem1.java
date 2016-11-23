import java.util.Scanner;
//Thomas Pennington 1.0

public class Problem1 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		// Enter a number for the starting tuition rate in double format e.g.12,342

		System.out.print("Please Enter the Starting Tuition Rate for Current School Year: $ ");
		double startTuition = input.nextDouble();

		// Enter a number for the variable increase in the tuition in decimal format e.g .05 for year 2

		System.out.print("Plase enter the variable increase rate for tuition increase year 2: ");
		double perInc = input.nextDouble();

		// Enter a number for the variable increase in the tuition in decimal format e.g .02 for year 3
		
		System.out.print("Plase Enter the variable increase rate for tuition increase year 3: ");
		double perInc2 = input.nextDouble();

		// Enter a number for the variable increase in the tuition in decimal format e.g. .03 for year 4
		
		System.out.print("Plase Enter the variable increase rate for tuition increase year 4: ");
		double perInc3 = input.nextDouble();

		// Sets the initial cost of tuition to 0 as a place holder for the loop
		
		double total = 0.0;

		for (int x = 0; x < 4; x++) {

			double year1 = (startTuition);
			double year2 = (year1 * Math.pow((1 + perInc), x = 1)); 
			double year3 = (year2 * Math.pow((1 + perInc2), x = 2)); 
			double year4 = (year3 * Math.pow((1 + perInc3), x = 3));

			total = (year1 + year2 + year3 + year4);
		}

		System.out.println();

		System.out.printf("The total cost for a four year degree is $%5.2f", total);

		input.close();

	}
}