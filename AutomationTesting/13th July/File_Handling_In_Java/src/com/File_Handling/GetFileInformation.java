package com.File_Handling;

import java.io.File;

public class GetFileInformation {
	public static void main(String[] args) {
		
		File myobj = new File("C:\\Files\\file.txt");
		if(myobj.exists()) {
			System.out.println("File name: "+ myobj.getName());
			System.out.println("Absolute path "+ myobj.getAbsolutePath());
			System.out.println("Writable: "+myobj.canWrite());
			System.out.println("Readable: "+myobj.canRead());
			System.out.println("File size in bytes : "+myobj.length());
			
		}
		else {
			System.out.println("The file does not exist .");
		}
	}
}
 