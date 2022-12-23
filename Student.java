import java.util.Scanner;
class Student{
	int rollno;
	String name;
	int age;
	void setdata(){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Roll no");
		rollno=sc.nextInt();
		System.out.println("Enter Name");
		name=sc.nextLine();
		System.out.println("Enter age");
		rollno=sc.nextInt();
	} 
	void displaydata(){
		System.out.println("rollno="+rollno);
		System.out.println("name="+name);
		System.out.println("age="+age);
	}
}


class Studentdemo{
	public static void main(String[] args) {
		Student s1 = new Student();




		Student s2 = new Student();
		s1.setdata();
		s2.setdata();

		s1.displaydata();
		s2.displaydata();

	}
}