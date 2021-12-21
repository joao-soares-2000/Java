package javaExercises;
//convert Celsius to Fahrenheit
//F = (9xc)/5 + 32
public class Exercise03 {
	public static void main (String[]args) {
		float celsiusDegree = 30.0F;
		float celsiusToFahrenheitDegree = (((celsiusDegree*9)/5)+32);
		System.out.println(celsiusDegree + " Celcius degree in fahrenheit is " + celsiusToFahrenheitDegree);
	}
}
