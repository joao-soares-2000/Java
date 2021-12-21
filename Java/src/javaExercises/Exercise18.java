package javaExercises;
//show the predecessor and the successor of a integer number
public class Exercise18 {
	public static void main(String[] args) {
		int number = 395;
		System.out.println("The predecessor of " + number + " is " + (--number) + " and the successor is " + (number += 2));
	}
}
