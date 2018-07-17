import java.util.Scanner;

public class Lab2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		PerimeterAreaCalc();
		// Ask user if they would like to continue program
		System.out.println("Do you want to continue? (y/n)");
		String yesNo = scan.next();

		if (yesNo.equalsIgnoreCase("y")) {
			PerimeterAreaCalc();
			System.out.println("Do you want to continue? (y/n)");
			yesNo = scan.next();
		} else {

		}
		scan.close();
	}

	public static void PerimeterAreaCalc() {
		Scanner scan = new Scanner(System.in);

		// Area and perimeter application
		System.out.println("This program will calculate the perimeter and area of classrooms at Grand Circus");
		// User is prompted to enter first value - length
		System.out.println(
				"First, please enter the length of the room (e.g. 12.4, where 12 is in feet and 0.4 is in inches): ");
		double length = scan.nextDouble();
		// User is prompted to enter second value - width
		System.out.println(
				"Second, please enter the width of the room (e.g. 30.2, where 30 is in feet and 0.2 is in inches): ");
		double width = scan.nextDouble();

		// print out and calculate perimeter and area
		double perimeterOfRoom = (length * 2) + (width * 2);
		double areaOfRoom = length * width;
		System.out.println("The perimeter of the room is: " + perimeterOfRoom);
		System.out.println("The area of the room is: " + areaOfRoom);

	}

}
