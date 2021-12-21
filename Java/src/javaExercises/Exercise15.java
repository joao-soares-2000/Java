package javaExercises;
//calculate the speed off a bullet in meters per second
//V = (Dx1000)/(Tx60)
public class Exercise15 {
	public static void main(String[] args) {
		double distance = 1.2;
		double time = 1.2;
		double speedMetersPerSecond = (distance*1000) / (time*60);
		System.out.println(speedMetersPerSecond + " Meters per second");
	}
}
