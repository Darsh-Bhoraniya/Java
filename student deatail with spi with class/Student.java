package studentclass;
import java.util.Scanner;

public class Student{
	String id_no;
	int	no_of_subjects_registered;
	String subject_code[];
	int	subject_credits[];
	String	grade_obtained[];
	double	spi;

	public Student(){
		Scanner sc = new Scanner(System.in);
		Scanner sc2 = new Scanner(System.in);
		System.out.print("enter student ID number::");
		this.id_no=sc2.nextLine();
		System.out.print("enter no of subject registered:");
		this.no_of_subjects_registered=sc.nextInt();
		subject_credits=new int[this.no_of_subjects_registered];
		subject_code=new String[this.no_of_subjects_registered];
		grade_obtained=new String[this.no_of_subjects_registered];
		for(int i=0;i<no_of_subjects_registered;i++){
			System.out.print("enter your subject["+(i+1)+"] credits:");
			this.subject_credits[i]=sc.nextInt();
			System.out.print("enter your subject["+(i+1)+"] code:");
			this.subject_code[i]=sc2.nextLine();
			System.out.print("enter your subject grade:");
			this.grade_obtained[i]=sc2.nextLine();

		}

	}
	// public double getSpi(){
	// 	return 0 //equation of calculate spi;
	// }
	public void displaydata(){
		System.out.println("=================STUDENT DETAIL=================");
		System.out.println("student ID :: "+id_no);
		System.out.println("student selact no_of_subjects :: "+no_of_subjects_registered);
		for(int i=0;i<no_of_subjects_registered;i++){
			System.out.print(" subject["+(i+1)+"] credits: "+subject_credits[i]);
			
			System.out.print(" subject["+(i+1)+"] code: "+subject_code[i]);
			
			System.out.print(" subject["+(i+1)+"] grade:" +grade_obtained[i]);
			
			System.out.print("\n");
		}
	}

}