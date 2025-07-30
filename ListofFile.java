package exception;
import java.io.File;
import java.util.Date;

public class ListofFile {

	public static void main(String[] args) {
		File file=new File("C:\\");
		String[] fileList=file.list();
		for(String name:fileList) {
			System.out.println(name);
		}
		

	}

}
