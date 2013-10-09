package picture;
import java.awt.Canvas;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;

import com.sun.image.codec.jpeg.JPEGCodec;
import com.sun.image.codec.jpeg.JPEGEncodeParam;
import com.sun.image.codec.jpeg.JPEGImageEncoder;

@SuppressWarnings({ "serial", "restriction" })
public class CreatePic extends Canvas
{
	public static void gg()
	{
		try {
		    BufferedImage bufImg = new BufferedImage(100,100,BufferedImage.TYPE_INT_RGB);
		    Graphics2D g2d = (Graphics2D) bufImg.getGraphics();
		    g2d.drawString("Test123",10,10); 
		    g2d.drawString("aaaaaaaaa",10,20);
		    g2d.drawString("bbbbbbbbb",10,30); 

		    ByteArrayOutputStream boutstream = new ByteArrayOutputStream();
		    JPEGImageEncoder enc = JPEGCodec.createJPEGEncoder(boutstream);
		    JPEGEncodeParam params = JPEGCodec.getDefaultJPEGEncodeParam(bufImg);
		    params.setQuality(100, true);
		    enc.encode(bufImg, params);

		    File f = new File("src/picture/test.jpg");      
		    FileOutputStream fimage = new FileOutputStream(f);
		    boutstream.writeTo(fimage);
		    fimage.close();
		} catch (Exception e) {
		    System.out.println(e);
		} 
	}
	
	public static void main(String args[])
	{
		System.out.println("*******");
		gg();
	}
}
