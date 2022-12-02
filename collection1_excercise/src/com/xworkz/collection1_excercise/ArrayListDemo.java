package com.xworkz.collection1_excercise;

import java.util.ArrayList;

public class ArrayListDemo {
	
	
	public static void main(String[] args) {
		
		ArrayList<TrainerCollection> Trainer = new ArrayList<TrainerCollection>();
        
		TrainerCollection ashamam=new TrainerCollection("Ashamam","001",30);
         
         TrainerCollection omkar=new TrainerCollection("omkar","002",30);
         
         TrainerCollection deva=new TrainerCollection("Deva","003",30);
         
         TrainerCollection ashamam1=new TrainerCollection("Ashamam","001",30);
         
         TrainerCollection ashamam2=new TrainerCollection("Ashamam","001",30);
         
	
         ArrayList<StudentCollection> Student = new ArrayList<StudentCollection>(); 
         StudentCollection Sharath = new StudentCollection("Sharath","Atme","111",25);
         StudentCollection Chidhu = new StudentCollection("Chidhu","Vkvk","222",25);
         StudentCollection Suraj= new StudentCollection("Suraj","Rkvk","333",25);
         StudentCollection Sirisha = new StudentCollection("Sirisha","Rit","444",25);
         StudentCollection Sujji = new StudentCollection("Sujji","Sjce","555",25);
         
         
         Trainer.add(ashamam);
         Trainer.add(omkar);
         Trainer.add(deva);
         Trainer.add(ashamam1);
         Trainer.add(ashamam2);
	     Student.add(Sharath);
	     Student.add(Chidhu);
	     Student.add(Suraj);
	     Student.add(Sirisha);
	     Student.add(Sujji);
	   
 for(TrainerCollection a:Trainer) {
	 if(a.trainer_name.equals("ashamam"))
	 {
		 System.out.println(a);
	 }
 }
	     }

}
