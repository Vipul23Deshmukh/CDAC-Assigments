package com.demo.test;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

// it is not related to employee it is individual file
public class TestDataStream {
	public static void main(String[] args) {
		
		try(DataOutputStream dos=new DataOutputStream( new FileOutputStream("data.txt"));
				DataInputStream dis=new DataInputStream(new FileInputStream("data.txt"));)
		{
			dos.writeDouble(777.87);
			dos.writeInt(777);
			dos.writeUTF("Rajani");
			System.out.println("read data");
			
			double num=dis.readDouble();
			int i=dis.readInt();
			String nm=dis.readUTF();
			
			System.out.println(num+" "+i+" "+nm);
			
		}catch (IOException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}

}
