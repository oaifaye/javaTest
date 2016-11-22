package file_size;

import java.io.File;

import javax.swing.filechooser.FileSystemView;

public class FileSize {

	public static void main(String[] args) {
		getAllDirSize();
	}
	
	public static void getAllDirSize(){
		File f = new File("Z:\\");
		File[] list = f.listFiles();
		for (File file : list) {
			System.out.println(file.getPath());
		}
		
		FileSystemView sys = FileSystemView.getFileSystemView();
		 //循环盘符
	    File[] files = File.listRoots(); 
	    for(File file:files){
	      //得到系统中存在的C:\,D:\,E:\,F:\,H:\
	      System.out.println("系统中存在的"+file.getPath());
	    }
	    System.out.println(System.currentTimeMillis());
	}
	
	public static long getOneDirSize(File dir,long size){
		File[] children = dir.listFiles();
		for (File file : children) {
			if(file.isFile()){
				size = size + file.length();
			}else{
				getOneDirSize(file, size);
			}
		}
		
		return size;
	}
}
