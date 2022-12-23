public class Exeption2program{
	public static void main(String[] args) {
		try{
			int a=Integer.parseInt(args[0]);
			int b=Integer.parseInt(args[1]);
			int c= a/b;
			System.out.println(c);	
		}catch(ArrayIndexOutOfBoundsException e){
			System.out.println(e);
		}catch(ArithmeticException e){
			System.out.println(e);
		}catch(NumberFormatException e){
			System.out.println(e);
		}
	}
} 