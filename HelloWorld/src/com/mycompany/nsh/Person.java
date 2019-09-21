package com.mycompany.nsh;

public class Person {
 private String name;
 private int age;
 private double height;
 private double weight;
// double height;
// double weight;
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}

public int getAge() {
	return age;
}
public void setAge(int age) {
	if(age < 0) {
		age = 0;
		System.out.println("-를 입력하셨습니다.");
	}
	this.age = age;
}

public double getHeight() {
	return height;
}
public void setHeight(double height) {
	if(height < 0) {
		height = 0;
		System.out.println("-를 입력하셨습니다.");
	}
	this.height = height;
}

public double getWeight() {
	return weight;
}
public void setWeight(double weight) {
	if(weight <0) {
		weight = 0;
		System.out.println("-를 입력하셨습니다.");
	}
	this.weight = weight;
}
 
}
