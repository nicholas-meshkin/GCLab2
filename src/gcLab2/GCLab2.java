package gcLab2;

import java.util.Scanner;

public class GCLab2 {


	public static void main(String[] args) {
		double width = 0;
		double length = 0;
		double height = 0;
		double area = 0;
		double perimeter = 0;
		double volume = 0;
		String continueStatus = "y";
		
		Scanner scnr = new Scanner(System.in);
		
		System.out.println("Welcome to Room Calculator!");
		
		do {
		System.out.println("Please enter the length of the classroom in feet");
		length = scnr.nextDouble();
		System.out.println("Next, please enter the width of the classroom in feet");
		width = scnr.nextDouble();
		System.out.println("Next, please enter the height of the classroom in feet");
		height = scnr.nextDouble();
		area = length * width;
		perimeter = (width*2) + (length*2);
		volume = width * height * length;
		System.out.println("Area: " + area);
		System.out.println("Perimeter: " + perimeter);
		System.out.println("Volume: " + volume);
		System.out.println("Would you like to continue? (y/n)");
		scnr.nextLine();
		continueStatus = scnr.nextLine();
		} while (!(continueStatus.equals("n")));
		scnr.close();
		System.out.println("Thank you for using Room Calculator!");
	}
	

}
