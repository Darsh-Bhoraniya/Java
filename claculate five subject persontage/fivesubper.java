import java.util.Scanner;

public class fivesubper{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter how many subject you enter??");
		int choise=sc.nextInt();
		int smark[]=new int[choise];
		int aevrage=0,sum=0;

		// int len = smark[].length;
		// System.out.println("Length:"+len);
		for(int i=0;i<smark.length;i++)
		{
			System.out.println("enter subject "+(i+1)+"'  mark out of (100)= ");
			smark[i]=sc.nextInt();
			sum=sum+smark[i];
		}
		int totalmark=choise*100;
		aevrage=sum/choise;
		double persontage=(sum*100)/totalmark;
		System.out.println("Your persontage= "+persontage+" %");

		if(persontage<35){
			System.out.println("class = FAILE"+"\n  plese try again........");
		}
		else if (persontage>=35 && persontage<60) {
			System.out.println("class = THRID"+"\n may be beter.......... ");				
		}
		else if (persontage>=60 && persontage<70) {
			System.out.println("class = SECOND"+"\n good but be beter........... ");			
		}
		else if (persontage>=70 &&  persontage<90) {
			System.out.println("class = FRIST"+"\n  very good work.......");
			
		}
		else if (persontage>=90 && persontage<=100) {
			System.out.println("class =DISTRICTION"+"\n  EXILLENT ");			
		}
		else{
			System.out.println(" NOTE:YOUR persontage IS <100 WHICH IS INVAILED \n ENTER RIGHT MARK");
		}


	}
}