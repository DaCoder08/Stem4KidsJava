import java.util.*;
public class WhatIsYourName {

	public static void main (String[] args) {

		Scanner reader = new Scanner(System.in);  // Reading from System.in
		System.out.println("What is your name?");
		String name = reader.nextLine(); // Scans the next token of the input as an int.
		//once finished
		System.out.println("Hello "+name);
		reader.close();

	}

}
