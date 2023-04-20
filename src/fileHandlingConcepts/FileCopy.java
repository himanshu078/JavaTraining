package fileHandlingConcepts;

import java.io.*;

public class FileCopy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		String inputFilepath = "C:\\Users\\Swati\\Desktop\\Automation\\Samplefile.pdf";
		String outputFilepath = "C:\\Users\\Swati\\Desktop\\Samplefile111.pdf";
		fileCopy( inputFilepath , outputFilepath);
		
		System.out.println("File copied successfully");
		
	}
	
	
	public static void fileCopy(String inputFilepath , String outputFilepath) {
		
		File inputFile = new File(inputFilepath);
		File copyFile = new File(outputFilepath);
		
		FileInputStream fileInputStream = null;
		FileOutputStream fileOutputStream = null;
		
		try {
			fileInputStream = new FileInputStream(inputFile);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		try {
			fileOutputStream = new FileOutputStream(copyFile);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
		
		try {
			System.out.println(fileInputStream.available());
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		int i=0;
		try {
			while((i = fileInputStream.read()) != -1) {
				fileOutputStream.write(i);
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally {
			if (fileInputStream != null) {
				try {
					fileInputStream.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			if (fileOutputStream != null) {
				try {
					fileOutputStream.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		
		
	}

}
