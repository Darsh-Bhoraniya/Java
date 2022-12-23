import studentclass.Student;
import java.util.Scanner;
public class studentdemo{
	public static void main(String[] args) {
		// System.out.print("enter how many student you enterd?:: ");
		// Scanner sc = new Scanner(System.in);

		int count=args[0]parseInteger();
		count = sc.nextInt();
		Student st[] =new Student[count];
		for (int i=0;i<count ;i++ ) {
			st[i] = new Student();

		}
		for (int j=0;j<count ;j++ ) {
			st[j].displaydata();
		}
	}
}