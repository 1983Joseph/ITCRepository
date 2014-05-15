//package sort;

import java.util.Scanner;

public class MainBubbleSorting {

	static Scanner input_number = new Scanner(System.in);
	static String number = input_number.next();
	static int middle;
   static String c;
	static int t = 1;
	static int y=0;
	static int[] arr={2,3,5,6,7,8,9,14,18,25};
	static MainBubbleSorting  h=new MainBubbleSorting ();
	
	public static void main(String[] args) {
			// TODO Auto-generated method stub
		buble_sort(args);
		while(y<arr.length){
			if(arr[y]!=Integer.parseInt(args[y])){
				System.out.print("Find error in this index"+ y);
			}
			y++;
		}
		binary_search(args, number);

	}

	public static String[] buble_sort(String[] args) {
		
		int j;
		while (t == 1) {
			for (int f = 0; f < args.length; f++) {
				System.out.print(args[f] + " ");
			}
			t = 0;
			j = 0;

			for (int i = 1; i < args.length - j; i++) {
				if (Integer.parseInt(args[i - 1]) > Integer.parseInt(args[i])) {
					t = 1;
					c =args[i - 1];
					args[i - 1] = args[i];
					args[i] =c;
					j++;
				}
			}

			System.out.print("\n");
		}

		return args;
	}

	public static void binary_search(String[] args, String number) {
		System.out.print("\n");
		int ep = args.length-1;
		int bp = 0;
		while (ep > bp) {
			middle = (int) (ep+ bp) / 2;
			if (Integer.parseInt(number) == Integer.parseInt(args[middle])) {
				System.out.println("This number index is found  "+middle);
				return;
			} else if (Integer.parseInt(number) > Integer
					.parseInt(args[middle])) {
				bp = middle + 1;
			} else if (Integer.parseInt(number) < Integer
					.parseInt(args[middle])) {
				ep = middle - 1;

			}

		}
		System.out.println("-1");
	}
	
}
