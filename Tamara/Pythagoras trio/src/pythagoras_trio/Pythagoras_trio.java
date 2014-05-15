package pythagoras_trio;

public class Pythagoras_trio {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a;
		int b;
		int c;
		long mult;
		for (a=1; a<500; a++){
			for (b=a+1; b<500; b++){
				for (c=b+1; c<500; c++){
					if (a*a+b*b==c*c && a+b+c==1000){
						System.out.println("a=" + a + "\nb=" + b + "\nc=" + c);
						mult = a*b*c;
						System.out.println("a*b*c=" + mult);
						break;
					}
					
				}
				
			}
			
		}
		
	}

}
