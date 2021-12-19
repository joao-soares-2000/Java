package javaOneForAll;

public class ForExercise {
	//print all even number from 0 to 1000000
	public static void main(String[] args) {
		for (int even = 0;even <=1000000 ;even++) {
			if (even%2 == 0) {
				System.out.println(even);
			}
		}
	}
}

