
package fileHandlingConcepts;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;

public class CreateFile {

	public static void main(String[] args) {

		String path = "C:\\Users\\Swati\\Desktop\\Automation\\Samplefile12.txt";
		// CreateFileUsingFile(path);

		String pathNio = "C:\\Users\\Swati\\Desktop\\Automation\\Samplefile01.txt";
		// CreateFileUsingNioPackage(pathNio);

		CreateFileUsingScanner();

	}

	public static void CreateFileUsingNioPackage(String path) {

		Path location = Paths.get(path);
		try {
			Path newpath = Files.createFile(location);
			System.out.println("File is created at path  " + newpath);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void CreateFileUsingFile(String path) {

		File file = new File(path);
		try {
			boolean flag = file.createNewFile();

			if (flag) {
				System.out.println("File is created");
			} else
				System.out.println("File already exists");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static void CreateFileUsingScanner() {

		FileOutputStream fos = null;
		try {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter file path and location");
			String fileName = sc.nextLine();

			fos = new FileOutputStream(fileName, true);
			System.out.println("Enter the details to be entered in file");

			
			String contents = sc.nextLine();
			while (!contents.equalsIgnoreCase("exit")) {
                fos.write(contents.getBytes());
                fos.write(System.lineSeparator().getBytes());
                contents = sc.nextLine();
            }

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				fos.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

		System.out.println("Data written in file");

	}

}
