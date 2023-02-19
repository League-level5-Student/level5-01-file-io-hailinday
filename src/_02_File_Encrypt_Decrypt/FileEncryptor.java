package _02_File_Encrypt_Decrypt;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Iterator;
import java.util.Scanner;

public class FileEncryptor {
	/*
	 * Encryption is the process of encoding a message or information
	 * in such a way that only authorized parties can access it and
	 * those who are not authorized cannot.
	 *
	 * A simple shift cipher works by shifting the letters of a message
	 * down based on a key. If our key is 4 then:
	 * 
	 * a b c d e f g h i j k l m n o p q r s t u v w x y z
	 * 
	 * becomes:
	 *
	 * e f g h i j k l m n o p q r s t u v w x y z a b c d
	 * 
	 * "Hello World" changes to "Lipps Asvph"
	 *
	 * Create a program that takes a message and a key from the user.
	 * Use the key to shift each letter in the users input and save the final result to a file.
	 */
	static int key;
	public static void main(String[] args) {
		try {
			FileWriter fw = new FileWriter("src/_02_File_Encrypt_Decrypt/test.txt");
			Scanner kb = new Scanner(System.in);
			System.out.println("Write a message to print: ");
			String write = kb.nextLine();
			System.out.println("Enter a key to shift by: ");
			key = kb.nextInt();
			String writeCrypt = "";
			for (int i = 0; i < write.length(); i++) {
				if (write.charAt(i)!= ' ' ++ //figure out the shift of the ends where it goes to the other side of the alphabet) {
					
				}
			}
			fw.write(write);
			fw.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	public int getKey () {
		return key;
	}
}
