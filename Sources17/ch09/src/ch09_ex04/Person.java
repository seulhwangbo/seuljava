package ch09_ex04;
// HW01
public class Person {
	int id;
	String name;

	
	public Person(int id, String name) {
		this.id = id;
		this.name = name;
	}
	
//	@Override
//   public boolean equals(Object obj) {
//	   if (obj instanceof Person) {
//		   Person id = (Person) obj;
//		   if(this.id == id.id)return true;
//		   else return false;
//	   }
//		return false;
//	}
	
	@Override
	public boolean equals(Object obj) {
		//TODO Auto-generated method stub
		//return super.equals(obj);
		boolean b = false;
		Person p = null;
		if(obj instanceof Person) p = (Person) obj ;
		if(obj != null && this.id == p.id) b = true;
		
		return b;
	}

	
	
}