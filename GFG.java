 class Student 
{ 
	public int roll_no; 
	public String name; 
	Student(int roll_no, String name) 
	{ 
		this.roll_no = roll_no; 
		this.name = name; 
	} 
} 


public class GFG 
{ 
	public static void main (String[] args) 
	{ 
		Student[] arr; 

		arr = new Student[5]; 

		 
		arr[0] = new Student(1,"snoopy"); 

		
		arr[1] = new Student(2,"cuty"); 

		
		arr[2] = new Student(3,"tweety"); 
		arr[3] = new Student(4,"tommy"); 
		arr[4] = new Student(5,"twinkle"); 

		for (int i = 0; i < arr.length; i++) 
			System.out.println("Element at " + i + " : " + 
						arr[i]); 
	} 
} 
