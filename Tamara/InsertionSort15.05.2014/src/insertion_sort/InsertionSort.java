package insertion_sort;

import java.util.Scanner;

public class InsertionSort {
	static int c;
	static int[] b;
	static Scanner input_number = new Scanner(System.in);
	static String number = input_number.next();
	static int middle;

	public static void main(String[] args) {
		insertion_sort(parse_int(args));
		int bol = 0;
		int eol = args.length-1;
		//binary_search1(insertion_sort(parse_int(args)), number,bol,eol);
		binary_search(insertion_sort(parse_int(args)), number);
	}
public static int[] parse_int(String[] a){

		int intarray[] = new int[a.length];
		for (int i = 0; i < a.length; i++) {
		intarray[i] = Integer.parseInt(a[i]);
		}
		return intarray;
	
	
}
	public static int[] insertion_sort(int[] ls) {

		for (int i = 1; i < ls.length; i++) {

			for (int k = 0; k < ls.length; k++) {
				for (int j = 0; j < i; j++) {
					if (ls[i] <ls[j]) {
						c = ls[j];
						ls[j] = ls[i];
						ls[i] = c;
					}
				}
				System.out.print(ls[k] + " ");
			}
			System.out.println("\n");
		}

		return ls;
	}

	
	/* public static void binary_search1(int[] args, String number, int bol,
	  int eol) {
		 middle = (int) (eol + bol) / 2; 
	  while (eol >= bol) { 
		  
		  if  (Integer.parseInt(number) > args[middle]) {
	  binary_search1(args, number, middle + 1, eol); 
	  } else 
		  if  (Integer.parseInt(number) < args[middle]) {
	  binary_search1(args, number, bol, middle - 1); 
	  } else {
	  System.out.println("number_index = " + middle); return; 
	  }
	  
	  } System.out.println("-1"); return;}
	 */

	public static void binary_search(int[] args, String number) {
		System.out.println("---------------------");
		for (int k = 0; k < args.length; k++) {
			System.out.print(args[k] + " ");
		}
		System.out.print("\n");
		int eol = args.length - 1;
		int bol = 0;
		while (eol >= bol) {
			middle = (int) (eol + bol) / 2;
			if (Integer.parseInt(number) == args[middle]) {
				System.out.println("number_index = " + middle);
				return;
			} else if (Integer.parseInt(number) > args[middle]) {
				bol = middle + 1;
			} else if (Integer.parseInt(number) < args[middle]) {
				eol = middle - 1;

			}

		}
		System.out.println("-1");
	}

}