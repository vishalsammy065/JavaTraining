import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		int[] arr = new int[size];
		for(int i = 0 ; i < size; i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println(UserMainCode.checkTriplets(arr) ? "TRUE" : "FALSE");
	}
}
