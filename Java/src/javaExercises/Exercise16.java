package javaExercises;
//sphere volume
//V = (4/3) pi (R³)
public class Exercise16 {
	public static void main(String[] args) {
		double pi = 3.141592654;
		double radius = 5;
		double sphereVolume = (4.0/3.0)*pi*(Math.pow(radius, 3));
		System.out.println(sphereVolume);
	}
}
