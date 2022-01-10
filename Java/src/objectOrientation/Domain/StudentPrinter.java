package objectOrientation.Domain;

public class StudentPrinter {
	public void print(StudentReference studentReference){
		System.out.println(studentReference.name);
		System.out.println(studentReference.age);
		System.out.println(studentReference.sex);
	}
	
}
