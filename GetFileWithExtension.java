package exception;
import java.io.File;
import java.io.FilenameFilter;
public class GetFileWithExtension {

	public static void main(String[] args) {
		File file=new File("C:\\Users\\DELL\\Desktop\\pkgs");
		String[] list=file.list(new FilenameFilter(){
			public boolean accept(File dir,String name) {
				if(name.toLowerCase().endsWith(".dist-info")) {
					return true;
				}else {
					return false;
				}
			}
		});
		for(String f:list) {
			System.out.println(f);
		}
	}

}
