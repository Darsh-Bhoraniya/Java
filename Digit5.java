import java.io.FileInputStream;
class Digit5{	
	public static void main(String[] args) {
		int digit5=0;
		try{
		FileInputStream fis =new FileInputStream(args[0]);
		int a=fis.read();
		while(a!=-1){
			if(a==53)
				digit5++;
			a=fis.read();
		}
		}catch(Exception e){
			e.printStackTrace();
		}
		System.out.println("Digit count of 5 is = "+digit5);
	}
}