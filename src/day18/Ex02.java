package day18;

import java.io.File;
import java.io.FileInputStream;

public class Ex02 {
	public static void main(String[] args) throws Exception{
		File filePath =new File("D:/00파일/sw_micro_kgitbank/Spring_class/java/workFile/aaa.txt");
		FileInputStream fos =new FileInputStream (filePath);
		
		while(true) {
			int res=fos.read();
			if(res<0) {
				break;
			}
			System.out.println((char)res);
		}
	}
}
