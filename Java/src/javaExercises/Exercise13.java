package javaExercises;
// print a salary after a readjustments percentage of a salary
public class Exercise13 {
	public static void main(String[] args) {
		float baseSalary = 100.0F;
		float readjustmentsPercentage = 10.0F;
		float newSalary = baseSalary + (baseSalary*(readjustmentsPercentage/100));
		System.out.println("The new salary will be " + newSalary);
	}
}
