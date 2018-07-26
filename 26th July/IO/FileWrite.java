package io;

import java.io.BufferedWriter;
import java.io.DataOutput;
import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;

public class FileWrite {
	public static void main(String[] args) throws IOException {
		//char by char by byte stream
		FileOutputStream fos = new FileOutputStream("C:\\Users\\Nexwave\\Desktop\\File.txt");
		byte[]  by = {'j','b','c'};
		fos.write(by);
		DataOutputStream dos = new DataOutputStream(fos);
		dos.writeBytes("Hello World\n");
		dos.writeBytes("This should be in the next line..\n");
		fos.close();
		
		//By char stream FileWriter
		BufferedWriter bw = new BufferedWriter (new FileWriter("C:\\Users\\Nexwave\\Desktop\\fileWriter.txt"));
		bw.write("Hey.. This is written using bufferedWriter and File Writer");
		bw.newLine();
		bw.write("Next line...");
		bw.close();
	}
}
