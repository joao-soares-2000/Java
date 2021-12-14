
public class Class06 {
	public static void main(String[] args) {
		/* age < 15 category junior
		 age >= 15 && age < 18 category senior
		 age >= 18 category masters*/
		int age = 22;
		String category;
		
		if (age<15 && age>0) {
			category = "Junior";
		}else if (age >=15 && age < 18) {
			category = "Senior";
		}else if (age >= 18) {
			category = "Master";
		}else {
			category = "Invalid input";
		}
		System.out.println(category);
		
		
	}

}
