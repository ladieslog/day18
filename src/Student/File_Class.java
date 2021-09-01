package Student;

import java.io.BufferedOutputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileOutputStream;

public class File_Class {
	public void text() throws Exception {
		File filePath =new File("D:\\00파일\\sw_micro_kgitbank\\Spring_class\\java\\workFile\\b01.txt");		
		FileOutputStream fos =new FileOutputStream (filePath);
		BufferedOutputStream bos=new BufferedOutputStream(fos);
		DataOutputStream dos=new DataOutputStream(bos);
	}
}
