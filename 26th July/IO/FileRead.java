package io;
import java.io.*;
public class FileRead{
	public static void main(String[] args) throws IOException {
		//Byte Stream char by char
		FileInputStream fis = new FileInputStream("C:\\Users\\Nexwave\\Desktop\\Hello.txt");
		int xx = fis.read();
		while ( xx != -1) {
			System.out.print((char)xx);
			xx = fis.read();
		}
		fis.close();
		
		//char stream using BufferedReader
		System.out.println("\n\n\nFrom FileReader.........");
		BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\Nexwave\\Desktop\\Hello.txt"));
		String str = br.readLine();
		int flag = 0;
		while( str != null ) {
			//check for string "INSERT" in the file
			if(str.contains("INSERT")) {
				flag = 1;
				break;
			}
			// System.out.println(br.readLine());  show line by line
			str = br.readLine();
		}
		System.out.println((flag==1) ? "Success" : "Not Found");
		br.close();
	}
}