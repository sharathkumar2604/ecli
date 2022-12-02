package com.xworkz.collection1_excercise;

public class StudentCollection {
	
  public String name;
  public String college_name;
  public String id;
  public int age;
  
  public StudentCollection(String name,String college_name,String id, int age) {

	  this.name=name;
	  this.college_name=college_name;
	  this.id=id;
	  this.age=age;
	  
	  
  }

@Override
public String toString() {
	return "StudentCollection [name=" + name + ", college_name=" + college_name + ", id=" + id + ", age=" + age + "]";
}

}
