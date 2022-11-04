package encapsulation;

public class Student {
private String name;
private String usn;
private String college_name;
private int age;


public Student()
{
	
}
public String getName()
{
		return name;
}
public void setName(String name)
{
	this.name=name;
	
}
public String getUsn() {
	return usn;
}
public void setUsn(String usn) {
	this.usn = usn;
}
public String getCollege_name() {
	return college_name;
}
public void setCollege_name(String college_name) {
	this.college_name = college_name;
}
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}

}
