package fileHandlingConcepts;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Iterator;
import java.util.List;

public class ReadFile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String path = "C:\\Users\\Swati\\Desktop\\Automation\\cucumber.txt";
	//	readFileUsingFileInputStream(path);
		System.out.println("--------------------------------------------------------");
	//	readFileUsingBufferedReader(path);
		System.out.println("--------------------------------------------------------");
	//	readFileUsingFileReader(path);
		System.out.println("--------------------------------------------------------");
		readFileUsingNioPackage(path);


	}


	public static void readFileUsingFileInputStream(String Filepath) {

		FileInputStream fileInputStream = null;

		try {
			File file = new File(Filepath);
			fileInputStream = new FileInputStream(file);
			
			System.out.println("Reading content using fileinput stream");

			int c=0;
			while((c = fileInputStream.read()) != -1) {
				System.out.print((char)c);
			}

		}catch (Exception e) {
			e.printStackTrace();
		}
		finally {
			try {
				fileInputStream.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	public static void readFileUsingBufferedReader(String Filepath) {

		BufferedReader br = null;

		try {
			File file = new File(Filepath);
			br = new BufferedReader(new FileReader(file));
			
			System.out.println("Reading content using buffered reader");

			int c=0;
			while((c = br.read()) != -1) {
				System.out.print((char)c);
			}

		}catch (Exception e) {
			e.printStackTrace();
		}
		finally {
			try {
				br.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	public static void readFileUsingFileReader(String Filepath) {

		FileReader fr = null;

		try {
			File file = new File(Filepath);
			fr = new FileReader(file);
			
			System.out.println("Reading content using file reader");

			int c=0;
			while((c = fr.read()) != -1) {
				System.out.print((char)c);
			}

		}catch (Exception e) {
			e.printStackTrace();
		}
		finally {
			try {
				fr.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	public static void readFileUsingNioPackage(String Filepath) {
		
		System.out.println("Reading content using nio package");

		try {
			List <String> list = Files.readAllLines(Paths.get(Filepath), StandardCharsets.UTF_8);
			
			Iterator<String> it = list.iterator();
			
			while (it.hasNext()) {
				
				System.out.println(it.next());
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		
	}

}
