package classes;

public class CarExample {
	public static void main(String[] args) {
		Car car = new Car();
		car.model="그랜저";
		car.color="red";
		car.price=1000;
		car.maxSpeed=200;
		
//		System.out.println(car.model);
//		System.out.println(car.color);
//		System.out.println(car.price);
//		System.out.println(car.maxSpeed);
		car.drive();
		
		Car car2 = new Car();
		int[] intAry = new int[5];
		Car[] carAry = null;
		String[] strAry = null;
		
		car2.model="소나타";
		car2.color="Black";
		car2.price=1500;
		car2.maxSpeed=250;
		car2.drive();
		
		carAry[0] = car;
		carAry[1] = car2;
		for (Car c : carAry) {
			System.out.println(c.model + ", "+c.color);
		}
		
//		System.out.println(car);
//		System.out.println(car2);
		
	}

}
