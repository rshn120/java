package com.yedam.interfacePkg;

public interface RemoteControl {//추상 메소드를 자동 인식한다(따로 선언 안해도 된다)
	//상수필드- 값이 변하지 않는다.
	public static final int MAX_VALUE = 10;
	int MIN_VALUE=0;
	//추상메소드
	public abstract void turnOn();//abstract는 생각 가능하다 단 인터페이스에서만 가능
	public void turnOff();
	public void setVolume(int volume);
	
	

}
