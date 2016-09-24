import java.util.Scanner;

public class Problem1 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		// Enter a number for the starting tuition rate in double format e.g.12,342
		
		System.out.print("Please Enter the Starting Tuition Rate for Current School Year: $ ");
		double startTuition = input.nextDouble();

		// Enter a number for the variable increase in the tuition in decimal format e.g .05
		
		System.out.print("Plase Enter the variable increase rate for increasing costs: ");
		double perInc = input.nextDouble();

		double total = 0.0;

		for (int x = 0; x < 4; x++) {

			double totalCost = (startTuition * Math.pow((1 + perInc), x));

			total += totalCost;
		}
		
		System.out.println();
		
		System.out.printf("The total cost for a four year degree is $%5.2f", total);

		input.close();

	}
}