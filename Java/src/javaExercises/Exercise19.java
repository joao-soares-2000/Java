package javaExercises;

import java.util.Scanner;

//A) R = U/I
public class Exercise19 {
	public static void main(String[] args) {
		System.out.println("Selecione uma opção");
		System.out.println("1 = R = U/I");
		System.out.println("2 = U = R * I");
		System.out.println("3 = I = U/R");
		System.out.println("4 = P = U * I");
		Scanner scanner0 = new Scanner(System.in);
		int option = scanner0.nextInt();
		// scanner0.close();
		switch (option) {
		case (1):
			Scanner scanner1 = new Scanner(System.in);
			System.out.println("Volts ");
			float volts = scanner1.nextFloat();
			System.out.println("Ampers ");
			float ampers = scanner1.nextFloat();
			float resistence = volts / ampers;
			scanner1.close();
			System.out.println("The resistence will be " + resistence + " Ohms ");
			break;

//B) U = R * I
		case (2):
			Scanner scanner2 = new Scanner(System.in);
			System.out.println("Ohms ");
			float ohms = scanner2.nextFloat();
			System.out.println("Ampers ");
			ampers = scanner2.nextFloat();
			float voltage = ohms * ampers;
			// scanner1.close();
			System.out.println("The tension will be " + voltage + " volts ");
			break;
//C) I = U/R
		case (3):
			Scanner scanner3 = new Scanner(System.in);
			System.out.println("Volts ");
			voltage = scanner3.nextFloat();
			System.out.println("Ohms ");
			ohms = scanner3.nextFloat();
			ohms = voltage / ohms;
			// scanner1.close();
			System.out.println("The amperage will be " + ohms + " ampers ");
			break;
//D) P = U * I
		case (4):
			Scanner scanner4 = new Scanner(System.in);
			System.out.println("Volts ");
			voltage = scanner4.nextFloat();
			System.out.println("Ampers ");
			ohms = scanner4.nextFloat();
			float power = voltage * ohms;
			// scanner1.close();
			System.out.println("The power will be " + power + " watts ");
			break;
		default:
			System.out.println("Error");
		}
	}
}
