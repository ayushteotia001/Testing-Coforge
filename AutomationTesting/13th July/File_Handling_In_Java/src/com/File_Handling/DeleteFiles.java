package com.File_Handling;

import java.io.File;

public class DeleteFiles {
    public static void main(String[] args) {
        
        File myobj = new File("C:\\Files\\file.txt");
        
        if (myobj.delete()) {
            System.out.println("File deleted successfully: " + myobj.getName());
        } else {
            System.out.println("Failed to delete the file (it might not exist or is open in another program).");
        }
    }
}