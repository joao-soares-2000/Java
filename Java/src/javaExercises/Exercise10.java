package javaExercises;
//print a number in exponential of 2, 3 and 10;
public class Exercise10 {
	public static void main(String[] args) {
		double baseNumber = 2;
		double baseNumberBy2 = Math.pow(baseNumber, 2);
		double baseNumberBy3 = Math.pow(baseNumber, 3);
		double baseNumberBy10 = Math.pow(baseNumber, 10);
		System.out.println("By 2 " + baseNumberBy2 +" By 3 " + baseNumberBy3 + " By 10 " + baseNumberBy10);
	}
}
