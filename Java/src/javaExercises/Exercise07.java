package javaExercises;
//print the value of x and y inverted
public class Exercise07 {
	public static void main(String[] args) {
		int x = 10;
		int y = 25;
		int intermediate = 0;
		System.out.println("At he begin x= " + x +" and y= " + y);
		intermediate = y;
		y = x;
		x = intermediate;
		System.out.println("And now x= " + x +" and y= " + y);
	}
}
