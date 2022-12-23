import java.io.FileInputStream;
class Count{	
	public static void main(String[] args) {
		int charact=0,word=0,line=0;
		try{
		FileInputStream fis =new FileInputStream("temp.txt");
		int a=fis.read();
		while(a!=-1){
			charact++;
			if(a==10)
				line++;
			if (a==32)
				word++;
			a=fis.read();
		}
		charact-=(word+(2*line));
		word++;
		line++;
		}catch(Exception e){
			e.printStackTrace();
		}
		System.out.println("Character = "+charact+"\nword = "+word+"\nLine = "+line);
	}
}