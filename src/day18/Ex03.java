package day18;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class Ex03 {
	public static void main(String[] args) throws Exception{
		File filePath =new File("D:/00파일/sw_micro_kgitbank/Spring_class/java/workFile/a03.txt");
		FileOutputStream fos =new FileOutputStream (filePath);
		BufferedOutputStream bos=new BufferedOutputStream(fos);
		DataOutputStream dos=new DataOutputStream(bos);
		
		for(char i='1';i<'9';i++) {
			//Thread.sleep(1000);
			//fos.write(i);
			bos.write(i);
		}
		
		
		
		dos.flush();
		dos.writeUTF("바우스");
		dos.writeInt(100);
		dos.close();
		
		FileInputStream fis =new FileInputStream(filePath);
		BufferedInputStream bis =new BufferedInputStream(fis);
		DataInputStream dis=new DataInputStream(bis);
		String name=dis.readUTF();
		int num =dis.readInt();
		System.out.println("name : "+name);
		System.out.println("num : "+num);
		
		
	}
}
