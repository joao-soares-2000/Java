package javaOneForAll;

public class SwitchExercise {
	//Using switch, print if the day is business day or weekend
	//Giving the numbers 1 to 7, 1 being Sunday
	public static void main(String[] args) {
		byte day = -1;
		switch (day) {
		case 1 :
		case 7 :
			System.out.println("Weekend");
			break;
		case 3 :
		case 4 :
		case 5 :
		case 6 :
			System.out.println("Business day");
			break;
		default :
			System.out.println("Error");
		}
	}
}
