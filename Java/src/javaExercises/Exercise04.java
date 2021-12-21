package javaExercises;
//convert Fahrenheit to Celcius
//(((F-32)*5)/9)
public class Exercise04 {
	public static void main (String[]args) {
	float fahrenheitDegree = 86.0F;
	float fahrenheitToCelsiusDegree = ((fahrenheitDegree - 32)*5)/9;
	System.out.println(fahrenheitDegree + " fahrenheits in Celsius is " + fahrenheitToCelsiusDegree);
	}
}
