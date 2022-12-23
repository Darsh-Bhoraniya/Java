import java.util.Scanner;
class Member{
	String name,address;
	int age,phoneNO;
	private float salary;
	void printSalary(){
		System.out.println("Salary is "+salary);
	}
	void setSalary(float salary){
		this.salary=salary;
	}
	Member(){
		float salary;
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter Name,Address,age,phone number and salary");
		name=scan.nextLine();
		address=scan.nextLine();
		age=scan.nextInt();
		phoneNO=scan.nextInt();
		salary=scan.nextFloat();
		setSalary(salary);
		scan.close();
	}
	void display(){
		printSalary();
		System.out.println("name is "+name+"age is "+age+"phoneNO is "+phoneNO);
	}
}
class Employee extends Member{
	String specialization;
	Employee(){
		Scanner s=new Scanner(System.in);
		System.out.println("Enter specialization");
		specialization=s.nextLine();
		s.close();
	}
	void display(){
		super.display();
		System.out.println("specialization is "+specialization);
	}
}
class Manager extends Member{
	String department;
	Manager(){
		Scanner s1=new Scanner(System.in);
		System.out.println("Enter department");
		department=s1.nextLine();
		s1.close();
	}
	void display(){
		super.display();
		System.out.println("department is "+department);
	}
}