package javaExercises;

import java.util.Scanner;

//Read 2 integer numbers and calculate the 4 basic operations
public class Exercise14 {
	public static void main(String[] args) {
		Scanner scanner1 = new Scanner(System.in);
		Scanner scanner2 = new Scanner(System.in);
		int x1 = scanner1.nextInt();
		int x2 = scanner2.nextInt();
		scanner1.close();
		scanner2.close();	
		
		
		System.out.println("Adiction = " + (x1 + x2) + " Subtraction = " + (x1 - x2) + " Multiplication = " + (x1 * x2) + " Division = " + (x1 / x2));
	}
}
