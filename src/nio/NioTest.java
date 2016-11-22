package nio;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
/**
 * NIO测试
 * @author Administrator
 *
 */
public class NioTest {

	public static void main(String[] args) throws IOException {
//		new NioTest().read();
		new NioTest().write();
//		new NioTest().writeNoChannel();
	}
	
	public void read() throws IOException{
		System.out.println(new File("d:/temp/writesomebytes.txt").exists());
		FileInputStream fout = new FileInputStream( "d:/temp/writesomebytes.txt" );
		FileChannel fc = fout.getChannel();
		ByteBuffer buffer = ByteBuffer.allocate( 1024 );
		fc.read( buffer );
		byte[] bs = buffer.array();
		System.out.println(String.valueOf(bs));
	}
	
	public void write() throws IOException{
		FileOutputStream fout = new FileOutputStream( "d:/temp/writesomebytes.txt" );
		FileChannel fc = fout.getChannel();
		long l = System.currentTimeMillis();
		for (int j = 0;j < 10000; j++) {
			byte[]  message="XXXXXXXXXXXXXXXOOOOOOOOOOOOO\n".getBytes();
			ByteBuffer buffer = ByteBuffer.allocate( 102400 );
			     buffer.put( message );
			buffer.flip();
			fc.write( buffer );
		}
		System.out.println(System.currentTimeMillis() - l);
	}
	
	public void writeNoChannel() throws IOException{
		FileOutputStream fout = new FileOutputStream( "d:/temp/writesomebytes.txt" );
		long l = System.currentTimeMillis();
		for (int i = 0; i < 10000; i++) {
			byte[]  message="XXXXXXXXXXXXXXXOOOOOOOOOOOOO\n".getBytes();
			fout.write(message);
		}
		System.out.println(System.currentTimeMillis() - l);
	}
	
	
	
}
