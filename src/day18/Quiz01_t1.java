package day18;

import java.io.File;
import java.io.FileOutputStream;
import java.util.Scanner;

public class Quiz01_t1 {
	public static void main(String[] args) throws Exception{	
		File filePath =new File("D:/00파일/sw_micro_kgitbank/Spring_class/java/workFile/a01.txt");
		FileOutputStream fos =new FileOutputStream (filePath);
		 
		String name,addr,age;
		Scanner pulls =new Scanner(System.in);
		System.out.print("이름 입력:");
		name=pulls.next(); name+="\n";
		System.out.print("이름 나이:");
		age=pulls.next();	age+="\n";
		System.out.print("주소 입력:");
		addr=pulls.next();	addr+="\n";
		fos.write( name.getBytes() );
		fos.write( age.getBytes());
		fos.write(addr.getBytes());
		fos.close();
		
	}
}










