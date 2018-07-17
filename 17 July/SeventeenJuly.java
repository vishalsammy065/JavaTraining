import java.util.Arrays;
import java.util.Collections;

public class SeventeenJuly {
	
	public static void main(String[] args) {
		
		int sum = 0, sumEven = 0;
		int[] array = {20, 27,12,60,76};
		Integer [] arr = {20, 27,12,60,9};
		boolean isFound = false;
		String singersLinkin[] = {"Chester"};
		String[] guitaristsLinkin = {"Dave", "Brad", "Epic"};
		String[] drummerLinkin = {"Rob"};
		String[] keyboardLinkin = {"Mike"};
		String singers[] = {"Vishal"};
		String[] guitarists = {"Arpit", "Vaibhav"};
		String[] drummer= {"Ankur"};
		String[] keyboard = {"Anugreh"};
		
		//print all the data from an array one by one
		for(int i = 0; i < array.length; i++) {
			System.out.print(array[i]+" ");
		}
		
		System.out.println("");
		
		
		//print data from array in reverse order
		for(int i = array.length-1 ; i >=0 ;i-- ) {
			System.out.print(array[i]+" ");
		}
		System.out.println("");

		
		//find weather 26 is there in array or not
		for(int i = 0; i < array.length; i++) {
			if(array[i] == 26) {
				isFound = true;
				break;
			}
		}
		System.out.println(isFound?"Found":"Not Found");
		
		
		//from the given int array find the biggest num
		System.out.println(Collections.max(Arrays.asList(arr)));
		
		//from the given int array find the smallest num
		System.out.println(Collections.min(Arrays.asList(arr)));
		
		//sum of all the arrays and print sum
		for(int i = 0; i < array.length; i++) {
			sum += array[i];
		}
		System.out.println(sum);
		
		//sum only even numbers
		
		for(int i = 0; i < array.length; i++) {
			if(array[i] % 2 ==0) {
				sumEven += array[i];
			}
		}
		System.out.println(sumEven);
		
		//define a string array and assign some names from this classroom. 
		//if guru is found, say "Found" else "No found"
		
		String[] names = {"Vishal", "Guru", "Shaurya", "Aman", "Ankur"};
		boolean isGuruFound = false;
		int guruPos = 0;
		for(String i : names) {
			if(i.equalsIgnoreCase("guru")) {
				isGuruFound = true;
				guruPos = i.indexOf("Guru") + 1;
			}
		}
		System.out.println(isGuruFound?"Position of Guru is at: "+guruPos:"Not Found");
		
		//count the no. of red balls in basket1 and basket 2
		String[] basket1 = {"Red", "Green", "Blue", "White", "Black"};
		String[] basket2 = {"Red", "Green", "Red", "White", "Red"};
		int count = 0;
		
		for(int i = 0; i < basket1.length; i++) {
			if(basket1[i].equalsIgnoreCase("Red"))
				count++;
		}
		
		for(int i = 0; i < basket2.length; i++) {
			if(basket2[i].equals("Red"))
				count++;
		}
		
		System.out.println(count);
		
		//define two arrays one = country, second = capital
		//given any country, display the corresponding capital
		String[] countries = {"Japan","India", "US"};
		String[] capitals = {"Tokyo","New Delhi", "Washington DC"};
		
		for(int i = 0 ; i < countries.length; i++) {
			if(countries[i].equalsIgnoreCase("Japan")) {
				System.out.println(capitals[i]);
			}
		}
		
		//Employee class
		Employee emp = new Employee(101, "Vishal", 5000.0);
		System.out.println("Bonus : "+emp.calculateBonus());
		
		Employee emp2 = new Employee();
		System.out.println("Bonus : "+emp2.calculateBonus());
		
		//get the company name of emp
		System.out.println(Employee.getCompanyName());
		
	
		//Band class for Linkin Park Object
		Band bandLinkinPark = new Band();
		bandLinkinPark.setBandName( "Linkin Park", singersLinkin, guitaristsLinkin, drummerLinkin, keyboardLinkin);
		bandLinkinPark.printBandDetails();
		
		//Band class for Random Band Object
		Band randomBand = new Band();
		randomBand.setBandName("Random Band", singers, guitarists, drummer, keyboard);
		randomBand.printBandDetails();
		
		int linkinParkMem = bandLinkinPark.countMembers();
		int randomBandMem = randomBand.countMembers();
		
		if(linkinParkMem > randomBandMem)
			System.out.println(bandLinkinPark.getBandName()+" has more members!");
		else if (linkinParkMem < randomBandMem)
			System.out.println(randomBand.getBandName()+" has more members!");
		else
			System.out.println("Both have equal no. of members.");
		
		//command line args
		System.out.println(args.length);
		for(int i = 0; i < args.length ; i++)
			System.out.print(args[i] + " ");
		System.out.println();
		
		//to accept 2 int and get sum
		int sumCmd = 0;
		for(String str : args) {
			sumCmd += Integer.parseInt(str);
		}
		System.out.println(sumCmd);
		
		} //end of main
	
	} //end of class
