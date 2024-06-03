package ch09_ex04;
// HW01
public class Person {
	int id;
	String name;

	
	public Person(int id, String name) {
		this.id = id;
		this.name = name;
	}
   public boolean equals(Object obj) {
	   if (obj instanceof Person) {
		   Person id = (Person) obj;
		   if(this.id == id.id)return true;
		   else return false;
	   }
		return false;
	}
	

	
}
