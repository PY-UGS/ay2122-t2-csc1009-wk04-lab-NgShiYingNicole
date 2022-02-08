package bmi;

import java.util.Scanner;

public class BMIMain {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter weight in pound: ");
		double weightPound = input.nextDouble();
		System.out.print("Enter height in inches: ");
		double heightInches = input.nextDouble();
		input.close();
						
		BMI bmi1 = new BMI(poundsToKilos(weightPound),inchesToMeters(heightInches));
		bmi1.setBmi(poundsToKilos(weightPound),inchesToMeters(heightInches));
		bmi1.setInterpretation(bmi1.getBmi());
		
		System.out.println("BMI is "+bmi1.getBmi());
		System.out.println(bmi1.getInterpretation());
	}
	private static double poundsToKilos(double weightPound) {
		return weightPound*0.45359237;
	}
	private static double inchesToMeters(double heightInches) {
		return heightInches*0.0254;
	}
}
