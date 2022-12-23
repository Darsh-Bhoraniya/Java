class IntNum{
	public static void main(String[] args) {
		int sum=0;
		boolean flag=false;
		for(int i=0;i<args.length;i++){
			String str="";
			try{
				if(Integer.parseInt(args[i])<0){
					str+=args[i]+" is a Negative no. ";
					flag=true;
				}
				if(Integer.parseInt(args[i])%10==0){
					str+=args[i]+" is a Divisible by 10 ";
					flag=true;
				}
				if(Integer.parseInt(args[i])>1000 && Integer.parseInt(args[i])<2000){
					str+=args[i]+" is a between 1000 & 2000 ";
					flag=true;
				}
				if(Integer.parseInt(args[i])>7000){
					str+=args[i]+" is a greater than 7000 ";
					flag=true;
				}
				if(flag){
					flag=false;
					throw new Exception(str);
				}
				sum+=Integer.parseInt(args[i]);
			}
			catch(Exception ex){
				System.out.println("Exception is "+ex.toString());
			}
		}
		System.out.println(sum);
	}
}