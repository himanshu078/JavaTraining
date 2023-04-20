package fileHandlingConcepts;

import java.awt.image.BufferedImage;
import java.io.*;
import java.net.*;

import javax.imageio.ImageIO;

public class ImageHandling {

	public static void main(String[] args) {
		
		try {
		//	URL url = new URL("https://images-na.ssl-images-amazon.com/images/G/01/AmazonExports/Fuji/2021/June/Fuji_Quad_Keyboard_2x._SY232_CB667159063_.jpg");
		//	BufferedImage image1 = ImageIO.read(url);
			File file = new File("C:\\Users\\Swati\\Desktop\\Automation\\Images\\test.jpg");
			BufferedImage image = ImageIO.read(file);
			
			
			ImageIO.write(image, "jpg", new File("C:\\Users\\Swati\\Desktop\\Automation\\Images\\testing.jpg"));
			ImageIO.write(image, "gif", new File("C:\\Users\\Swati\\Desktop\\Automation\\Images\\testing1.gif"));
			ImageIO.write(image, "png", new File("C:\\Users\\Swati\\Desktop\\Automation\\Images\\testing2.png"));
			ImageIO.write(image, "bmp", new File("C:\\Users\\Swati\\Desktop\\Automation\\Images\\testing3.bmp"));
			} catch (IOException e) {
				e.printStackTrace();
			}

	}

}
