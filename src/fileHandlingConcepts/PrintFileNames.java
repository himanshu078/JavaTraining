package fileHandlingConcepts;

import java.io.*;
import java.util.Arrays;

public class PrintFileNames {

	public static void main(String[] args) {

		String path = "C:\\Users\\Swati\\Downloads";

	//	getFileNames(path);
		getSpecificFileNames(path, ".pdf");


	}

	public static void getFileNames(String path) {

		File file = new File(path);

		File filesdownload[] = file.listFiles();

		Arrays.sort(filesdownload);

		System.out.println("Total number of entries are : " + filesdownload.length);

		for (File e : filesdownload ) {

			if (e.isFile()) {
				System.out.println("File: " + e.getName());
			}
			else if (e.isDirectory()) {
				System.out.println("Directory: " + e.getName());
			}
			else System.out.println("Not known: " + e.getName());
		}

	}

	public static void getSpecificFileNames(String path, String keyword) {

		File file = new File(path);
		File filesdownload[] = file.listFiles();
		Arrays.sort(filesdownload);
		int i =0;

		

		for (File e : filesdownload ) {

			String filename = e.getName();

			if (filename.contains(keyword)){
				System.out.println("File: " + filename);
				i++;
			}
		}
		
		System.out.println("Total number of entries are : " + filesdownload.length);
		System.out.println("Total number of pdf files are : " + i);
	}
}


