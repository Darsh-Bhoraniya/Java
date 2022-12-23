import java.util.Scanner;
class Complex{
	int real,img;
		void setmethod(){
			System.out.println("Enter real no then img no");
			Scanner scan =new Scanner(System.in);
			real=scan.nextInt();
			img=scan.nextInt();
		}
	public static void main(String[] args) {
		int no,no2;
		Scanner s =new Scanner(System.in);
		System.out.println("No of complex no you want to make");
		no=s.nextInt();
		ComplexNo complexNo[]= new ComplexNo[no];
		for (int i=0;i<no ;i++ ) {
			setmethod();
			complexNo[i]=new ComplexNo(real,img);
		}
		System.out.println("Which Complex No do you want to add ?");
		no=s.nextInt();
		no2=s.nextInt();
		complexNo sum =new ComplexNo();
		sum = sum.addNo(complexNo[no-1],complexNo[no2-1]);
	}
}