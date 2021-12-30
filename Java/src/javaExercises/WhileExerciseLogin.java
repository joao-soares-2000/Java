package javaExercises;

import java.util.Scanner;

public class WhileExerciseLogin {
	public static void main(String[] args) {
		final String login = "joao";
		final String password = "senha";
		Scanner input = new Scanner(System.in);
		while (true) {
			System.out.println("Type the login ");
			String loginDigitado = input.next();
			System.out.println("Type the password ");
			String passwordDigitado = input.next();
			if (login.equals(loginDigitado) && password.equals(passwordDigitado)) {
				System.out.println("Succesful login");
				break;
			}
			input.close();
			System.out.println("Denied");
			
		}
		
	}
}
