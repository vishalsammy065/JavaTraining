package io;
import java.io.*;
public class ReadMyName {
	public static void main(String[] arfs) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		/*int val = System.in.read();
		System.out.println((char)val);*/
		
		String name = br.readLine();
		System.out.println(name);
		
		int age = Integer.parseInt(br.readLine());
		System.out.println(age);
	}	
}
