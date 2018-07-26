package io;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;
import java.util.stream.IntStream;

public class Excercise {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int intValue = Integer.parseInt(br.readLine());
		 System.out.println((intValue%3==0) ? "Yes, Divisible by 3.." : "Not divisible by 3..");
		 String name = br.readLine();
		 String city = br.readLine();
		 System.out.println("Welcome "+name+"\nYou are living in "+city);
		 int[] array = new int[5];
		 for(int i = 0 ; i < array.length ; i++)
			 array[i] = Integer.parseInt(br.readLine());
		 int sum = IntStream.of(array).sum();
		 System.out.println(sum/array.length);
		 System.out.println(Arrays.stream(array).max().getAsInt());

		 int counter = 0;
		 while (true) {
			 String city1 = br.readLine();
			 if(city1.equals("STOP"))
				 break;
			 counter++;
		 }
		 System.out.println(counter);
	}
}
