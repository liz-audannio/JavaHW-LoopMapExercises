package loopmapexercises;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

/*Write a program that does the following:
	*Asks the user for 5 numbers
	*Stores them in an array list
	*Finds the sum, product, largest, and smallest of those numbers*/

public class ArrayListHW {
	public static void main(String[] args) {
		try (Scanner input = new Scanner(System.in)) {
			ArrayList<Integer> list = new ArrayList<Integer>();
			int sum = 0;
			int product = 1;
			int largest = 0;
			int smallest = 0;

			System.out.println("Enter 5 numbers, each followed by the enter key.");
			for (int i = 0; i < 5; i++) {
				list.add(input.nextInt());
			}

			for (int i = 0; i < list.size(); i++) {
				sum += list.get(i);
				product *= list.get(i);
				if (i == 0) {
					largest = list.get(i);
					smallest = list.get(i);
				}
				if (list.get(i) > largest) {
					largest = list.get(i);
				}
				if (list.get(i) < smallest) {
					smallest = list.get(i);
				}
			}

			System.out.println("Sum: " + sum);
			System.out.println("Product: " + product);
			System.out.println("Largest: " + largest);
			System.out.println("Smallest: " + smallest);

			Collections.sort(list);
			System.out.println("Sorted: " + list);
			}
	}
}
