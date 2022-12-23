import java.io.File;
class File1{
	public static void main(String[] args) {
		try{
			File f = new File(args[0]);
			if(f.isFile()){
				System.out.println("File exist and Size is " + f.length());
			}
			if(f.isDirectory()){
				System.out.println(f.getAbsolutePath());
			}
		}catch(Exception e){
			e.printStackTrace();
		}
	}
}