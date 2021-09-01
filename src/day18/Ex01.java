package day18;

import java.io.File;
import java.io.FileOutputStream;

public class Ex01 {
	public static void main(String[] args) throws Exception {
		File filePath =new File("D:/00파일/sw_micro_kgitbank/Spring_class/java/workFile/aaa.txt");
		FileOutputStream fos =new FileOutputStream (filePath, true);
		
		fos.write(97);
		fos.write('A');
		
		String name= " haski";
		fos.write( name.getBytes() );
		
	}
}
