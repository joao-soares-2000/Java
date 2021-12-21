package javaExercises;
/*print the net salary and the base salary
SB = HT * VH
TD = (PD / 100) * SB
SL = SB  - TD
*/
public class Exercise02 {
	public static void main (String[]args) {
		float workedHours = 10;
		float hourValue = 100.0F;
		float baseSalary = workedHours * hourValue;
		float percentualDiscounts = 30;
		float salaryDiscounts = percentualDiscounts/100 * baseSalary;
		float netSalary = baseSalary - salaryDiscounts;
		
		System.out.println("The base salary is "+ baseSalary+" and the net salary is " + netSalary);
		
	}

}
