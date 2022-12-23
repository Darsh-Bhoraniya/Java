/*3. Create a class named 'Member' having the following members:
1-Name
2-Age
3-Phone number
5-Salary
It also has a method named 'printSalary' which prints the salary of the members.
Two classes 'Employee' and Manager' inherits the 'Member' class. The 'Employee' and 'Manager' 
classes have data members 'specialization' and 'department' respectively. Now assign name, age, 
phone number address and salary to an employee and a manager by making an
object of both of these classes and print the same along with specialization and department respectively.*/
import java .util.Scanner;
class member {
	String name;
	int age ;
	String phonenumber;
	String slary;
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter your name");
	name= sc.nextLine();
	System.out.println("Enter your age");
	age= sc.nextInt();
	System.out.println("Enter your phinenumber");
	phonenumber= sc.nextLine();
	System.out.println("Enter your salry");
	slary= sc.nextLine();
	
	void printsalry(){
			System.out.println("Salry="+slary);
	}
}
class employ extends member{
	String specialization;
	System.out.println("Enetr your Specialization");
	specialization=sc.nextLine();
	System.out.println("name"+name);
	System.out.println("age"+age);
	System.out.println("phinenumber"+phonenumber);
	System.out.println("salr`"+slary);
	System.out.println("specialization"+specialization);
}
class manager extends member{
	String department;
	System.out.println("Ente your specialization");
	department= sc.nextLine();
	System.out.println("name"+name);
	System.out.println("age"+age);
	System.out.println("phinenumber"+phonenumber);
	System.out.println("salry"+slary);
	System.out.println("department"+department);
	
}



public class Bankactdemo{
	public static void main(String[] args) {
		manager m= new manager();
		employ e = new employ();
	}
}