import java.io.FileInputStream;
import java.io.FileOutputStream;

public class filecopy{

	public static void main(String[] args) {
		try{

		FileOutputStream fo = new FileOutputStream("t2.txt");
		FileInputStream fp = new FileInputStream("t1.txt");
		int b = fp.read();

		while(b!=-1){
			fo.write(b);
			b= fp.read();
		}
		fo.close();
		fp.close();
		}
		catch(Exception e){
			e.printStackTrace();
		}

	}
}