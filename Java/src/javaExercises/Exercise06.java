package javaExercises;
//calculate how many liters a car will use
//autonomy 12km/l
public class Exercise06 {
	public static void main(String[] args) {
		float speed = 122.0F;
		float timeInHours = 3;
		float distance = speed * timeInHours;
		float carAutonomy = 12;
		System.out.println("The car will use " + (distance / carAutonomy) + " liters of fuel");
	}
}
