package io;

import java.io.File;
import java.io.IOException;

public class FileDemo {

	public static void main(String[] args) throws IOException {
		
		//creating and deleting a file
		File f = new File("C:/Users/Nexwave/Desktop/MyFile.txt");
		if(!f.exists()) {
			f.createNewFile();
		}
		File dir = new File("C:/Users/Nexwave/Desktop/Folder");
		if(!dir.exists()) {
			dir.mkdir();
		}
		System.out.println(f.getAbsolutePath());
		System.out.println(f.isFile());
		System.out.println(dir.isDirectory());
		System.out.println("Press X to delete : ");
		int val = System.in.read();
		if(val == 120) {
			f.delete();
			dir.delete();
		}
		
		//List out all the entries in a dir
		File list = new File ("C:/Users/Nexwave/Desktop");
		String[] filesAndFoldersName = list.list();
		for (String str : filesAndFoldersName)
			System.out.println(str);
		
		//check permissions 
		if(f.canRead())
			System.out.println("Readable");
		if(f.canWrite())
			System.out.println("Writable");
		if(f.canExecute())
			System.out.println("Executable");
	}
}
