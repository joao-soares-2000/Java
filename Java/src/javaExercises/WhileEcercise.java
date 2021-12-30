package javaExercises;

import java.util.Scanner;

public class WhileEcercise {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int selector = 0;
		while (selector != 3) {
			System.out.println("1 - Calcular imposto ");
			System.out.println("2 - Depostar Salário");
			System.out.println("3 - Sair");
			selector = input.nextInt();
		}
	}
}
