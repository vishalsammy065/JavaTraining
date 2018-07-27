package SecondWeekAssign;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

abstract class Arithmetic {
	double n1, n2;

	Arithmetic(double n1, double n2) {
		this.n1 = n1;
		this.n2 = n2;
	}

	public double getN1() {
		return n1;
	}

	public double getN2() {
		return n2;
	}

	public void setN1(double n1) {
		this.n1 = n1;
	}

	public void setN2(double n2) {
		this.n2 = n2;
	}

	public abstract double calculate();

}

class Addition extends Arithmetic {

	Addition(double n1, double n2) {
		super(n1, n2);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double calculate() {
		// TODO Auto-generated method stub

		return n1 + n2;
	}

}

class Subtraction extends Arithmetic {

	Subtraction(double n1, double n2) {
		super(n1, n2);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double calculate() {
		// TODO Auto-generated method stub
		return n1 - n2;
	}

}

class Multiplication extends Arithmetic {

	Multiplication(double n1, double n2) {
		super(n1, n2);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double calculate() {
		// TODO Auto-generated method stub
		return n1 * n2;
	}

}

class Division extends Arithmetic {

	Division(double n1, double n2) {
		super(n1, n2);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double calculate() {
		// TODO Auto-generated method stub
		return n1 / n2;
	}

}

public class Calculator {

	public static void main(String args[]) throws NumberFormatException, IOException {
		Arithmetic operations[] = new Arithmetic[4];
		System.out.println("Enter two numbers");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		double n1, n2;
		int choice;
		double result = 0.0;
		n1 = Double.parseDouble(br.readLine());
		n2 = Double.parseDouble(br.readLine());

		System.out.println("Enter 1 for addition 2 for subtraction 3 for multiplication 4 for division");
		choice = Integer.parseInt(br.readLine());
		operations[0] = new Addition(n1, n2);
		operations[1] = new Subtraction(n1, n2);
		operations[2] = new Multiplication(n1, n2);
		operations[3] = new Division(n1, n2);
		try {
			result = operations[choice - 1].calculate();
		} catch (ArrayIndexOutOfBoundsException ex) {
			System.out.println("Choice not correct");
			return;
		}
		System.out.println("result is " + result);

	}
}
