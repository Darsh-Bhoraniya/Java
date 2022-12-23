public class Exceptiondemo2{
		public static void main(String args[])
			{
				try {
						System.out.println("hi");
						System.out.println("hello");
						int a=Integer.parseInt(args[0]);
						int b=Integer.parseInt(args[1]);

				if( b <0) {
					throw new Exception("tame nagative vlaue nakhi che ");

				}
				else if(b==10){
					throw new Exception("10 thi  thase nai");
				}
				else if (a>1000 && a<2000){
					throw new Exception("tame value 100 thi 200 vache ni nakhi che ");
				}
				else if (a>7000){
					throw new Exception("tame value 700 thi moti nakhi che ");
						
				}
				else {
					int c = a+b;
					System.out.println(c);
				}
				}catch(Exception e){
								System.out.println(e);
			}
						System.out.println("h r u ?");
						System.out.println("fine thank u..!!");
			}
}



