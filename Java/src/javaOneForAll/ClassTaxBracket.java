package javaOneForAll;

public class ClassTaxBracket {
	public static void main(String[] args) {
		double annualSalary = 30000;
		double firstBracket = (9.7/100);
		double secondBracket = (37.35/100);
		double thirdyBracket = (49.50/100);
		String taxBracket;
		double taxToPay;
		if (annualSalary < 34713) {
			taxBracket = " 9.7% in taxes";
			taxToPay = annualSalary * firstBracket;
		}else if (annualSalary >= 34713 && annualSalary <68508) {
			taxBracket = " 37.35% in taxes";
			taxToPay = annualSalary * secondBracket;
		}else if (annualSalary >= 68508) {
			taxBracket = " 49.50% in taxes";
			taxToPay = annualSalary * thirdyBracket;
		}else {
			taxBracket = "Invalid input";
			taxToPay = 0;
		}
		System.out.println("On Netherlands you should pay" + taxBracket + " that is " + taxToPay + " Euros");
		
	}

}
