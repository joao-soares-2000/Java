package javaExercises;

import java.util.Scanner;

public class Exercise19 {
	public static void main(String[] args) {
	Scanner scanner0 = new Scanner(System.in);		
	System.out.println("Select what operation you want");
	System.out.println("1 for Resistance - 2 for Tension - 3 for amperage - 4 for powerage");
	int seletor = scanner0.nextInt();
	switch (seletor) {
		
//A) R = U/I
	case 1:
		Scanner scanner1 = new Scanner(System.in);
		System.out.println("Volts ");
		float volts = scanner1.nextFloat();
		System.out.println("Ampers ");
		float ampers = scanner1.nextFloat();
		float resistence = volts/ampers;
		scanner1.close();
		scanner0.close();
		System.out.println("The resistence will be " + resistence + " Ohms ");
		break;
		
//B) U = R * I
	case 2:
		Scanner scanner2 = new Scanner(System.in);
		System.out.println("Ohms ");
		float ohms = scanner2.nextFloat();
		System.out.println("Ampers ");
		ampers = scanner2.nextFloat();
		float voltage = ohms/ampers;
		scanner2.close();
		scanner0.close();
		System.out.println("The tension will be " + voltage + " volts ");
		break;
		
//C) I = U/R
	case 3: 
		Scanner scanner3 = new Scanner(System.in);
		System.out.println("Volts ");
		voltage = scanner3.nextFloat();
		System.out.println("Ampers ");
		ohms = scanner3.nextFloat();
		ampers = voltage/ohms;
		scanner3.close();
		scanner0.close();
		System.out.println("The amperage will be " + ampers + " ampers ");
		break;
		
//D) P = U * I
	case 4:
		Scanner scanner4 = new Scanner(System.in);
		System.out.println("Volts ");
		voltage = scanner4.nextFloat();
		System.out.println("Ampers ");
		ohms = scanner4.nextFloat();
		float power = voltage*ohms;
		scanner4.close();
		scanner0.close();
		System.out.println("The power will be " +  power + " watts");
		break;
		
		}
	}
}
