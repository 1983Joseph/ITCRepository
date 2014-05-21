import java.io.*;
import java.io.BufferedWriter;
import java.util.*;

class Car {
    public Car dzax;   // aj ev dzax entacarer ev banalin
    public Car aj;
    public int banali;

    public Car(int k) { // Car classi konstruktor
        banali = k;
    }

    public void gagatAvelacnel( Car aCar) {//carin nor gagat avelacnox metod
        if ( aCar.banali < banali )         //anhavasarakshrvac cari paymanneri
            if ( dzax != null ) dzax.gagatAvelacnel( aCar );//stugum @st voronc
            else dzax = aCar;             //karucvum e car@
        else
            if ( aj != null ) aj.gagatAvelacnel( aCar );
            else aj = aCar;
    }

    public void qayl(carovShrjox aycelvoxGagat) {//car classi metod, vor@ 
        if ( dzax != null)                //carShrjox interfeysi mijocov ev 
            dzax.qayl( aycelvoxGagat ); //binar cari kanonneri hamadzayn  
                                        //ancnume e cari gagatneri vrayov 
        aycelvoxGagat.aycelel(this);

        if ( aj != null ) 
            aj.qayl( aycelvoxGagat );
    }
}

interface carovShrjox {  //cari gagatnerov ancnox interfeys
    public void aycelel(Car gagat);//interfejsi miak metod@
};

class TesGagat implements carovShrjox {//cari gagatner@ artaberox class
    public void aycelel(Car gagat) {     //vor@ implement e anum shrjelu metod@
                                         //carovShrjox interfeysic
        Writefile grox = new Writefile();
        try {
            grox.write( " "+ gagat.banali );
        }
        catch (IOException e) {
        }
    }
}

class TpelGagat implements carovShrjox {//cari gagatner@ artaberox class
    public void aycelel(Car gagat) {     //vor@ implement e anum shrjelu metod@
        System.out.print( " " + gagat.banali );//carovShrjox interfeysic
    }
};

class Writefile {

    public void write(String tox) throws IOException {
        File flt = new File("TreeSort.txt");
        PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter(flt,true)));
        out.print(tox);
        out.close();
    }
};

class TreeSort {          //sortavorox class Treesort
    public static void main(String args[]) {
	Scanner nor = new Scanner(System.in);
	int chap;
	System.out.print("mutqagreq sortavorvox tveri qanak@: ");
	chap = nor.nextInt();
	int[] tver = new int[chap];
        for (int i = 0; i < chap; i++) {
            tver[i] = ((int)(Math.random() * chap) - (chap/2));
        }
	Car norCar = new Car(tver[0]);
	for (int i = 1; i < tver.length; i++) {
            norCar.gagatAvelacnel( new Car(tver[i]) );
	}
        norCar.qayl(new TesGagat());
    }
}
//        Car norCar = new Car(((int)(Math.random() * 500000) - 250000));//car classi konstruktori kanch
