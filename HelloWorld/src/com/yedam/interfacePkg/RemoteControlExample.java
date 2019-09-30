package com.yedam.interfacePkg;

public class RemoteControlExample {
	public static void main(String[] args) {
		RemoteControl rc = null; //RemoteControl의 어떤거라도 담을 수 있는 rc를 선언
		rc = new Television();//인스턴스
		rc.turnOn();
		rc.setVolume(12);
		rc.turnOff();
		System.out.println("=============================");
		rc= new Audio();
		rc.turnOn();
		rc.setVolume(12);
		rc.turnOff();
		
		RemoteControl rc1 = new RemoteControl() {//RemoteControl에 인스턴스를 만드는게 아니라
			//익명의 인스턴스를 만든다는 선언
			int volume;
			@Override
			public void turnOn() {
				System.out.println("익명구현객체를 켭니다.");
			}

			@Override
			public void turnOff() {
				System.out.println("익명구현객체를 끕니다.");				
			}

			@Override
			public void setVolume(int volume) {
				this.volume = volume;
			}
		};
		rc1.turnOn();
		rc1.turnOff();
	}
}
			
		
	
			
	

