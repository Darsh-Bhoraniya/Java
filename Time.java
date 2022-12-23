import java.util.Scanner;
class Time{
	public static void main(String[] args) {
		int n,objno;
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter no.of Time you want to enter");
		objno=scan.nextInt();
		System.out.println("Enter no.of input 3,2,1,0 for 3 inputs (hours,min,sec),2 inputs, 1 input,0 input\n Input Format hours,min,sec");
		n=scan.nextInt();
		int time[] =new int[n];
		TimeIni timeObj[]= new TimeIni[objno];
		for (int i=0;i<objno && n<4 && n>0 && objno>0;i++ ) {
			for (int k=0;k<n;k++ )
				time[k]=scan.nextInt();
			switch (n) {
				case 0:	timeObj[i]= new TimeIni();
						System.out.printf("Entered time is %d : %d : %d\n",timeObj[i].h,timeObj[i].m,timeObj[i].s);
						break;
				case 1: timeObj[i]= new TimeIni(time[0]);
						System.out.printf("Entered time is %d : %d : %d\n",timeObj[i].h,timeObj[i].m,timeObj[i].s);
						break;
				case 2: timeObj[i]= new TimeIni(time[0],time[1]);
						System.out.printf("Entered time is %d : %d : %d\n",timeObj[i].h,timeObj[i].m,timeObj[i].s);
						break;
				case 3: timeObj[i]= new TimeIni(time[0],time[1],time[2]);
						System.out.printf("Entered time is %d : %d : %d\n",timeObj[i].h,timeObj[i].m,timeObj[i].s);
						break;
			}
		}
		System.out.println("Do You want to Add all time?\nType yes/no");
		String ans= scan.next();
		if(ans=="YES" || ans == "yes"){
			TimeIni sumOfTime =new TimeIni();
			sumOfTime=timeObj[0];
			for (int i =1;i<n ;i++) {
				sumOfTime.addition(sumOfTime,timeObj[i]);
			}
			System.out.printf("Sum of time is %d : %d : %d",sumOfTime.h,sumOfTime.m,sumOfTime.s);
		}
	}
}