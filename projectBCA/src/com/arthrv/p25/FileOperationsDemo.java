package com.arthrv.p25;

import java.io.*;

public class FileOperationsDemo {
    public static void main(String[] args) {
        File sourceFilePath = new File("src\\com\\arthrv\\p25\\source.txt"); // Path to the source file
        File destinationFilePath = new File("src\\com\\arthrv\\p25\\destination.txt"); // Path to the destination file

        // Step 1: Read content from the source file
        System.out.println("Reading content from the source file:");
        readFile(sourceFilePath);

        // Step 2: Write content to a destination file
        String contentToWrite = "This is a sample content written to the destination file.\n";
        writeFile(destinationFilePath, contentToWrite);
        System.out.println("\nContent written to the destination file successfully.");

        // Step 3: Copy content from the source file to the destination file
        copyFileContent(sourceFilePath, destinationFilePath);
        System.out.println("\nContent copied from the source file to the destination file successfully.");

        // Step 4: Display the content of the destination file after copying
        System.out.println("\nReading content from the destination file:");
        readFile(destinationFilePath);
    }

    // Method to read content from a file
    public static void readFile(File sourceFilePath) {
        try (BufferedReader br = new BufferedReader(new FileReader(sourceFilePath))) {
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.out.println("An error occurred while reading the file: " + e.getMessage());
        }
    }

    // Method to write content to a file
    public static void writeFile(File destinationFilePath, String content) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(destinationFilePath))) {
            bw.write(content);
        } catch (IOException e) {
            System.out.println("An error occurred while writing to the file: " + e.getMessage());
        }
    }

    // Method to copy content from one file to another
    public static void copyFileContent(File sourceFilePath, File destinationFilePath) {
        try (BufferedReader br = new BufferedReader(new FileReader(sourceFilePath));
             BufferedWriter bw = new BufferedWriter(new FileWriter(destinationFilePath, true))) { // Append mode

            String line;
            while ((line = br.readLine()) != null) {
                bw.write(line);
                bw.newLine(); // To ensure lines are properly formatted in the destination file
            }
        } catch (IOException e) {
            System.out.println("An error occurred while copying the file content: " + e.getMessage());
        }
    }
}
