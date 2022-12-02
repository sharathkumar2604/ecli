package com.xworkz.collection1_excercise;

public class TrainerCollection {

	
	String trainer_name;
	String id;
	int age;
	
	
	TrainerCollection(String trainer_name, String id, int age){
		this.trainer_name=trainer_name;
		this.id=id;
		this.age=age;
	}


	@Override
	public String toString() {
		return "TrainerCollection [trainer_name=" + trainer_name + ", id=" + id + ", age=" + age + "]";
	}
}
