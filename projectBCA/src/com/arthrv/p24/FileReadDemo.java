package com.arthrv.p24;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class FileReadDemo {
	public static void main(String[] args) {
		File file = new File("src/com/arthrv/p24/example.txt");
		// Replace with the path of your text file

		// Using try-with-resources to ensure the file is closed after reading
		try (BufferedReader br = new BufferedReader(new FileReader(file))) {
			String line;

			// Reading the file line by line
			while ((line = br.readLine()) != null) {
				System.out.println(line);
			}
		} catch (IOException e) {
			// Handling exceptions related to file reading
			System.out.println("An error occurred while reading the file: " + e.getMessage());
		}
	}
}
