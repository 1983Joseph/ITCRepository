package insertion_sort;

import java.awt.List;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class InsertionSort {

	static int c;
	static int i;
	static Scanner input_number = new Scanner(System.in);
	static String number = input_number.next();
	static int middle;
	static int[] myIntArray = { 1, 3, 4, 5, 6, 6, 7, 8, 9 };

	public static void main(String[] args) {

		/*
		 * ArrayList<Integer> list = new ArrayList<Integer>(); File file = new
		 * File("Insertion_args.txt"); BufferedReader reader = null; try {
		 * reader = new BufferedReader(new FileReader(file)); String text =
		 * null;
		 * 
		 * while ((text = reader.readLine()) != null) {
		 * list.add(Integer.parseInt(text)); } } catch (FileNotFoundException e)
		 * { e.printStackTrace(); } catch (IOException e) { e.printStackTrace();
		 * } finally { try { if (reader != null) { reader.close(); } } catch
		 * (IOException e) { } }
		 * 
		 * //print out the list System.out.println(list);
		 */

		insertion_sort(args);
		compareArrays(args, myIntArray);
		int eol = args.length - 1; // eol - end of line
		int bol = 0; // bol - begin of line
		// binary_search1(args, number, bol, eol);
		binary_search(args, number);
	}

	public static void compareArrays(String[] array1, int[] myIntArray2) {

		for (int i = 0; i < array1.length; i++) {
			if (Integer.parseInt(array1[i]) != myIntArray2[i]) {
				System.out.println("Arrays not equal");
			}
		}
		System.out.println("Arrays are equal");

	}

	public static String[] insertion_sort(String[] a) {

		for (int i = 1; i < a.length; i++) {

			for (int k = 0; k < a.length; k++) {
				for (int j = 0; j < i; j++) {
					if (Integer.parseInt(a[i]) < Integer.parseInt(a[j])) {
						c = Integer.parseInt(a[j]);
						a[j] = a[i];
						a[i] = Integer.toString(c);
					}
				}
				System.out.print(a[k] + " ");
			}
			System.out.println("\n");
		}

		return a;

	}

	/*
	 * public static void binary_search1(String[] args, String number, int bol,
	 * int eol) {
	 * 
	 * while (eol >= bol) { middle = (int) (eol + bol) / 2; if
	 * (Integer.parseInt(number) > Integer.parseInt(args[middle])) {
	 * binary_search1(args, number, middle + 1, eol); } else if
	 * (Integer.parseInt(number) < Integer .parseInt(args[middle])) {
	 * binary_search1(args, number, bol, middle - 1); } else {
	 * System.out.println(middle); break; }
	 * 
	 * } System.out.println("-1"); }
	 */

	public static void binary_search(String[] args, String number) {
		System.out.println("---------------------");
		for (int k = 0; k < args.length; k++) {
			System.out.print(args[k] + " ");
		}
		System.out.print("\n");
		int eol = args.length - 1;
		int bol = 0;
		while (eol >= bol) {
			middle = (int) (eol + bol) / 2;
			if (Integer.parseInt(number) == Integer.parseInt(args[middle])) {
				System.out.println("number_index = " + middle);
				return;
			} else if (Integer.parseInt(number) > Integer
					.parseInt(args[middle])) {
				bol = middle + 1;
			} else if (Integer.parseInt(number) < Integer
					.parseInt(args[middle])) {
				eol = middle - 1;

			}

		}
		System.out.println("-1");
	}

}
