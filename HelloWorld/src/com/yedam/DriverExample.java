package com.yedam;
class Driver {
	void drive(Vehicle vehicle) {
		vehicle.run();
	}
}
public class DriverExample {
	public static void main(String[] args) {
		Driver driver = new Driver();
		Vehicle vehicle = new Vehicle();
		vehicle = new Bus();//Bus스 매개변수에는 버스가달립니다.가 들어있다.
		vehicle = new Taxi();//Taxi 매개변수에는 택스기달립니다.가 들어있다.
		//vehicle 매개변수에는 첫번재는 버스가 들어 있었는데
		//두번째 택시값이 덮어 써버림(override함)

		driver.drive(vehicle);
	}  //       메소드 (매개 변수)
}
