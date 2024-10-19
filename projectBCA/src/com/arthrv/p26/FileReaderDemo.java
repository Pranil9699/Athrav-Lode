package com.arthrv.p26;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderDemo {
    public static void main(String[] args) {
        File filePath = new File("src\\com\\arthrv\\p26\\example.txt"); // Path to your text file

        // Use try-with-resources to ensure proper resource management
        try (FileReader fr = new FileReader(filePath)) {
            int character;

            // Read characters one at a time
            while ((character = fr.read()) != -1) {
                // Convert the integer value to a character and print it
                System.out.print((char) character);
            }

        } catch (IOException e) {
            // Handle file-related exceptions
            System.out.println("An error occurred while reading the file: " + e.getMessage());
        }
    }
}
