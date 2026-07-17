package com.File_Handling;

import java.io.File;

import java.io.FileWriter;
import java.io.IOException; // Added this import so the code compiles successfully

public class WriteTOFile {
	public static void main(String[] args) {
		try {
			FileWriter myWriter = new FileWriter("C:\\Files\\file.txt");
			myWriter.write("Welcome To Coforge Technologies! All the best for learning!");
			myWriter.close();
			System.out.println("Successfully wrote to the file");
		} catch (IOException e) {
			System.out.println("An error occurred.");
			e.printStackTrace();
		}
	}
}