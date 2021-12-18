package javaOneForAll;

public class WhileDoWhileFor {
	public static void main(String[] args) {
	//While, do While, For
		int counter = 0;
		while(counter < 5 ) {
			System.out.println(++counter);
		}
		do {
			System.out.println("Inside do While " + counter++);
		}
		while (counter < 10);
		
		for (counter = 0; counter<=20; counter+=5) {
			System.out.println("inside for " + counter);
		}
	}

}
