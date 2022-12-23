class MultMain{
	public static void main(String[] args) {
		try{
			Mult obj =new Mult(Integer.parseInt(args[0]),Integer.parseInt(args[1]));
			System.out.println(obj.x+"x"+obj.y+"="+obj.multiply());
		}catch(Exception e){
			System.out.println("Enter Valid input");
		}
	}
}