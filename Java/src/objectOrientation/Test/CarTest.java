package objectOrientation.Test;
import objectOrientation.Domain.Car;

public class CarTest {
	public static void main(String[] args) {
		Car car = new Car();
		Car car2 = new Car();
		
		car.name = "corsa";
		car.model = "sedan";
		car.year = 2003;
		
		car2.name = "palio";
		car2.model = "economy";
		car2.year = 2010;
		
		System.out.println(car.name);
		System.out.println(car.model);
		System.out.println(car.year);
		System.out.println("-----------------------");
		System.out.println(car2.name);
		System.out.println(car2.model);
		System.out.println(car2.year);
	}
}
