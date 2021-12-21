package javaExercises;
//calculate a quote overdue
public class Exercise08 {
	public static void main(String[] args) {
		float originalQuote = 2500.0F;
		float overdueFee = 3.5F;
		float time = 17;
		float overdueQuote = originalQuote + ((originalQuote*(overdueFee/100))*time);
		System.out.println("The value of the quote you have to pay is " + overdueQuote);
	}
}
