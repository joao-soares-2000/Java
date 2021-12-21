package javaExercises;

import java.util.Scanner;

//A) R = U/I
public class Exercise19 {
	public static void main(String[] args) {
		/*Scanner scanner1 = new Scanner(System.in);
		System.out.println("Volts ");
		float volts = scanner1.nextFloat();
		System.out.println("Ampers ");
		float ampers = scanner1.nextFloat();
		float resistence = volts/ampers;
		scanner1.close();
		System.out.println("The resistence will be " + resistence + " Ohms ");*/
		
//B) U = R * I
		/*Scanner scanner1 = new Scanner(System.in);
		System.out.println("Ohms ");
		float ohms = scanner1.nextFloat();
		System.out.println("Ampers ");
		float ampers = scanner1.nextFloat();
		float voltage = ohms/ampers;
		scanner1.close();
		System.out.println("The tension will be " + voltage + " volts ");*/
		
//C) I = U/R
		/*Scanner scanner1 = new Scanner(System.in);
		System.out.println("Volts ");
		float voltage = scanner1.nextFloat();
		System.out.println("Ampers ");
		float ohms = scanner1.nextFloat();
		float ampers = voltage/ohms;
		scanner1.close();
		System.out.println("The amperage will be " + ampers + " ampers ");*/
		
//D) P = U * I
		Scanner scanner1 = new Scanner(System.in);
		System.out.println("Volts ");
		float voltage = scanner1.nextFloat();
		System.out.println("Ampers ");
		float ohms = scanner1.nextFloat();
		float power = voltage*ohms;
		scanner1.close();
		System.out.println("The amperage will be " + power + " watts ");
		
	}
}
