package io;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class Test1 {
	
	public static void main(String[] args) throws IOException {
		
		//makeFile("src/io/idfile1.txt","s");
		getFile("src/io/idfile1.txt","src/io/idfile2.txt");
	}

	public static void makeFile(String fileName , String content) throws IOException{
		OutputStream fos = new FileOutputStream(fileName);
		
		BufferedOutputStream bos = new BufferedOutputStream(fos);
		
		bos.write(content.getBytes());
		
		bos.flush();
		bos.close();
	}
	
	/**
	 * 复制粘贴
	 * */
	public static void getFile(String fileNameI , String fileNameO) throws IOException{
		
		FileInputStream fis = new FileInputStream(fileNameI);
		
		BufferedInputStream br = new BufferedInputStream(fis);
		
		OutputStream fos = new FileOutputStream(fileNameO);
		
		BufferedOutputStream bos = new BufferedOutputStream(fos);
		
		int tem = 0;
		
		while((tem=br.read())>0){
			bos.write(tem);
			bos.flush();
		}
		
		br.close();
		
	}
	
	/**
	 * 复制粘贴2
	 * */
	public static void getFile2(String fileNameI , String fileNameO) throws IOException{
		
		FileInputStream fis = new FileInputStream(fileNameI);
		
		BufferedInputStream br = new BufferedInputStream(fis);
		
		OutputStream fos = new FileOutputStream(fileNameO);
		
		BufferedOutputStream bos = new BufferedOutputStream(fos);
		
		int tem = 0;
		
		byte[] b = new byte[1024];
		
		while((tem=br.read(b))>0){
			bos.write(tem);
			bos.flush();
		}
		
		br.close();
		
	}
}
