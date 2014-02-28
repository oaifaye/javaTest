package io;

import java.io.FileNotFoundException;
import java.io.RandomAccessFile;

public class RandomAccessFileTest {
	public static void main(String[] args) {
		try {
			RandomAccessFile raf = new RandomAccessFile("src/io/Random1","rwd");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
}
