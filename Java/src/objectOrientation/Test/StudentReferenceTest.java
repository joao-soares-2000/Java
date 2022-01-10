package objectOrientation.Test;

import objectOrientation.Domain.StudentPrinter;
import objectOrientation.Domain.StudentReference;

public class StudentReferenceTest {
	public static void main(String[] args) {

		StudentReference student1 = new StudentReference();
		StudentReference student2 = new StudentReference();
		
		student1.name = "john";
		student1.age = 21;
		student1.sex = 'M';

		student2.name = "Mary";
		student2.age = 21;
		student2.sex = 'F';
		
		StudentPrinter Printer = new StudentPrinter();

		Printer.print(student1);
		Printer.print(student2);

	}
}
