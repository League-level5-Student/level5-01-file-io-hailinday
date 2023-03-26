package _01_File_Recorder;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileRecorder {
	// Create a program that takes a message from the user and saves it to a file.
	public static void main(String[] args) {
		try {
			FileWriter fw = new FileWriter("src/_01_File_Recorder/test.txt");
			Scanner kb = new Scanner(System.in);
			System.out.println("Write a message to print: ");
			String write = kb.nextLine();
			fw.write(write);
				
			fw.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
//Copyright © 2023 Hailin Day//Copyright © 2023 Hailin Day