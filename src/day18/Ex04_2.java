package day18;

import java.io.BufferedOutputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.Scanner;

public class Ex04_2 {
	public static void main(String[] args) throws Exception{
		File filePath =new File("D:/00파일/sw_micro_kgitbank/Spring_class/java/workFile/a03.txt");
		FileOutputStream fos =new FileOutputStream (filePath);
		BufferedOutputStream bos=new BufferedOutputStream(fos);
		DataOutputStream dos=new DataOutputStream(bos);
		
		ObjectOutputStream oos=new ObjectOutputStream(bos);
		Scanner pulls =new Scanner(System.in);
		
		System.out.println("이름 입력");
		String name =pulls.next();
		Ex04 t =new Ex04();
		t.setName(name);
		oos.writeObject(t);
		oos.close();
	}
}
