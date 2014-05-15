package pythagoras_trio;

import java.util.Scanner;

public class Pythagoras_trio {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a;
		int b;
		int c;
		long mult=0;
		Scanner input_number = new Scanner(System.in);
		String number = input_number.next();
		
		for (a=1; a<Integer.parseInt(number)/2; a++){
			for (b=a+1; b<Integer.parseInt(number)/2; b++){
				for (c=b+1; c<Integer.parseInt(number)/2; c++){
					if (a*a+b*b==c*c && a+b+c==Integer.parseInt(number)){
						System.out.println("a=" + a + "\nb=" + b + "\nc=" + c);
						mult = a*b*c;
						System.out.println("a*b*c=" + mult);
						break;
					}
					
				}
				
			}
			
		}
		if (mult==0){
			System.out.println("The trio does not exist.");
		}
		
	}

}
