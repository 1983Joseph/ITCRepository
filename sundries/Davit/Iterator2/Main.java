import NameRepository.*;
import Iterator.*;
import NameIterator.*;

public class Main {
	NameRepository names= new NameRepository();
	void Print() {
 		NameIterator it = names.getIterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
	}
	public static void main(String [] args){
		Main m = new Main();
//		m.names 
		m.Print();
	}
}