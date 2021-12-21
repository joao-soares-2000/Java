package javaExercises;
//calculate and print the cylinder volume
//V = pi x R² x A
//V in cm³
public class Exercise05 {
	public static void main(String[] args) {
		double pi = 3.141592654;
		double radius = 5;
		double height = 10;
		double volume = Math.pow(radius,2) * height * pi;
		System.out.println("The cilinder volume is "+ volume + " cm³");
	}
}
