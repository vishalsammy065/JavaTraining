import java.util.Arrays;
import java.util.Collections;

public class Default {

	public static void main(String[] args) {
		
		//question 1
		long val1 = 0, val2 = 0;

		if(val1 !=0 || val2 !=0) {
			if(val1 > val2)
				System.out.println(val1);
			else if (val1 < val2)
				System.out.println(val2);
			else
				System.out.println("Zero");
		}
		else 
			System.out.println("Both can't be zero.."); 
			
		//question 2	
		double sal = 15000;
		System.out.println(sal - (sal*0.1) + (sal*0.15)); 
		
		
		//question 3
		int[] array = {50, 60, 10, 80, 90};
		Arrays.sort(array);
		System.out.println(array[array.length - 1]);
		
		//question 4
		for(int i = 1;i <=30;i++) {
			if(i%5==0) {
				System.out.println(i);
			}
		}
		
		//question 5
		int i = 1;
		do {
			System.out.println(i);
			i++;
		}while(i<=5);
		
		//question 6
		int count = 5;
		while(count >= 1) {
			System.out.println("*");
			count--;
		}
		
		
		//question 7
		for(int i = 1; i <= 10; i++) {
			System.out.println(i+" x 5 = "+ (i*5));
		}
		
		
		//question 8
		int a = 2, b=5;
		
		for(int i=0;i< (a+b);i++)
			System.out.println("Vishal");
		
		//question 9
		int speed = 689232;
		System.out.println(speed*5);
		
		//question 10
		double sal = 55555.55;
		System.out.println("He saves : "+ (sal - (sal*0.2) + (sal*0.15) - (sal*0.15) - (sal*0.5)));
		
		System.out.println(5000 % (650*5));
		
		//question 11
		System.out.print(""+(char)77 + (char)65 + (char)78 + (char)71 + (char)79);
		
		//question 12
		for(int i = 10; i <20; i++) {
			System.out.print((char)i);
		} 

		//question 13 (ternary op)
		System.out.println(5>2?2:4); 
		
		
	}
}
