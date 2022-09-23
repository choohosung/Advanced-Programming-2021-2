package Week_14th;
import java.io.*;

public class Ex_FileStreams {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			FileInputStream  fis = new FileInputStream(args[0]);
			FileOutputStream fos = new FileOutputStream(args[1]);

			int data =0;
			
			while((data=fis.read())!=-1) {
				fos.write(data);
			}

			fis.close();
			fos.close();
		} catch (IOException e) {
			e.printStackTrace();		
		}
	}

}
