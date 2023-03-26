package _04_Directory_Iteration;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import javax.swing.JFileChooser;

public class DirectoryIterator {
	public static void main(String[] args) {
		/* 
		 * The following is an example of how to list all of the files in a directory.
		 * Once the program is running, the directory is chosen using the JFileChooser.
		 */
			File directory = new File("src/");
			System.out.println(directory.getAbsolutePath());
			File[] files = directory.listFiles();
			if(files != null) {
				for(File f : files) {
					File [] javaFiles = f.listFiles();
					if (javaFiles!=null) {
						for (File javaFile : javaFiles) {
							if (javaFile.getName().contains(".java")) {
								copyrightPrint(javaFile);
							}
						}
					} else {
						
					}
					
				}
			}
		
		
		/*
		 * Your task is to write a program that iterates through the src folder of this current Java Project. 
		 * For every .java file it finds, the program will add a (non-legally binding) copyright statement at the bottom.
		 * Be aware of possible directories inside of directories.
		 * (e.g //Copyright © 2019 FirstName LastName)
		 */
		
	}
	
	public static void copyrightPrint (File jFile) {
				try {
					FileWriter fw = new FileWriter(jFile.getAbsolutePath(),true);
					
					fw.write("//Copyright © 2023 Hailin Day");
						
					fw.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
		
	}
	
	
}
//Copyright © 2023 Hailin Day