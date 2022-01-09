package javaExercises;

import java.util.Scanner;

public class MultiplicationTable {
	public static void main(String[] args) {
		/*Scanner input = new Scanner(System.in); 
		System.out.println("Type the number to the multiplication table ");
		double keyboard = input.nextDouble();
		for(int i = 1;i <= 10;i++){
			 System.out.println(keyboard + " * " + i + " = " + keyboard*i);
		 }
		input.close();*/
		/*int left = 1;
		for (int i = 1;i <= 10 ; i++) {
			if (left <= 10) {
				System.out.println(left + " * " + i + " = " + left * i);
				if (i == 10) {
					i = 0;
					left++;
					System.out.println("------------------------------------------------");
				}
			}
			
		}*/
		
		for (int i = 1; i <= 10; i++) {
			for (int j = 0; j <= 10; j++) {
				System.out.println(i + " * " + j + " = " + i*j);
			}
			
		}
	}
}
