package com.xworks.associationproject;

public class HasARealationship1 {

	public static void main(String[] args)
	{
		Heart1 my =new Heart1();
	    my.color="red";
	    my.size=46;
	    my.numberofvalves=4;
	    System.out.println("My heart color->"+my.color);
        System.out.println("My heart no of valves->"+my.numberofvalves);
        System.out.println("My heart size->"+ my.size);
		Human1 man =new Human1();
		man.name="sharath";
		man.age=26;
		man.area="mysore";
        man.gender="male";
        man.iampointing=new Heart1();
        System.out.println("My name->"+ man.name);
        System.out.println("My gender->"+ man.gender);
        System.out.println("My age->"+ man.age);
        System.out.println("My area->"+ man.area);
       
        
	}

}
