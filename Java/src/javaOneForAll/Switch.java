package javaOneForAll;

public class Switch {
	public static void main(String[] args) {
		byte day = -1;
		switch (day) {
		case 1 : 
			System.out.println("Sunday");
			break;
		case 2 : 
			System.out.println("Monday");
			break;
		case 3 : 
			System.out.println("tuesday");
			break;
		case 4 : 
			System.out.println("wednesday");
			break;
		case 5 : 
			System.out.println("Thursday");
			break;
		case 6 : 
			System.out.println("Friday");
			break;
		case 7 : 
			System.out.println("Saturday");
			break;
		default : 
			System.out.println("Error - Invalid input");
		}
			
				
	}

}
