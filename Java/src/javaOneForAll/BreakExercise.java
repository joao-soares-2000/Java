package javaOneForAll;

public class BreakExercise {
	public static void main(String[] args) {
		//Given a car's total price, for example 20000
		//I want to find how much and for how long i'll have to pay monthly
		//Condition: The monthly payment cannot be lower than 1000
	/*double carPrice = 200000;
	int months = 0;
	double MonthlyPayment = 2000;
	for (double howMuchForMonth = MonthlyPayment;howMuchForMonth <= carPrice; howMuchForMonth += MonthlyPayment) {
		months++;
		}
		System.out.println("The car can be payed in "+ months + " months. With the wage of " + MonthlyPayment);
	*/
		double carPrice = 20000;
		for (int months = 1; months <=2000; months++) {
			double monthlyPayment = carPrice / months;
			if(monthlyPayment >= 1000) {
				System.out.println("In " + months + " months you will have to pay " + monthlyPayment);
			}else {
				break;
			}
			
		}
	}	
}
