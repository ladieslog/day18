package day18;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class Ex05 {
	public static void main(String[] args) throws Exception{
		File filePath =new File("D:/00파일/sw_micro_kgitbank/Spring_class/java/workFile/a04.txt");		
		FileInputStream fis =new FileInputStream(filePath);
		BufferedInputStream bis =new BufferedInputStream(fis);
		ObjectInputStream ois=new ObjectInputStream(bis);
		
		Ex04 t=(Ex04)ois.readObject();
		t.print();
		
	}
}
