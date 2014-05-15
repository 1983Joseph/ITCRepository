import java.util.Scanner;

public class InsertionSort {
   static int c;
   static Scanner input_number = new Scanner(System.in);
   static String number = input_number.next();
   static int middle;

   public static void main(String[] args) {
      insertion_sort(args);
      int eol = args.length - 1; 		// eol - end of line
      int bol = 0; 				      	// bol - begin of line
      binary_search(args, number);
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
