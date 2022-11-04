package encapsulation;

public class Student_encapsulation {

	public static void main(String[] args) {
    
		Student student = new Student();
		System.out.println(student.getName());//this is will compile and the compiler will assign the default value to the 
		//particular data type where this will get defaukt value "NULL" if that run with out intialized"
		student.setName("Sharath");
		student.setUsn("4ad14cs058");
		student.setCollege_name("ATME COLLEGE");
		student.setAge(25);
        	
	
    System.out.println("Student Name:"+ student.getName());
    System.out.println("Student Usn:"+ student.getUsn());
    System.out.println("Student College_name:"+ student.getCollege_name());
    System.out.println("Student age:"+ student.getAge());
	}
}
