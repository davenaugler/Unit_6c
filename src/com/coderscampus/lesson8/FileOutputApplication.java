package com.coderscampus.lesson8;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileOutputApplication {
	 
	public static void main (String[] args) throws IOException {
		
		BufferedWriter writer = null;
		try {
			writer = new BufferedWriter(new FileWriter("data.txt")); 
			writer.write("This is a test string that will output to a file\n");
			writer.write("This is a second line of text");
		} finally {
			if (writer != null) writer.close();
		}
		
		BufferedReader reader = null;	
		try {
			reader = new BufferedReader(new FileReader("data.txt"));
//			System.out.println(reader.readLine());
			// Referenced 'FileService.java' from Unit_5_Assignment_3
			String line;
			while ((line = reader.readLine()) != null) {
				System.out.println(line);
			}
			
		} finally {
			if (reader != null) reader.close();
		}
		
	}

}
