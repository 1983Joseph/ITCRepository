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

class TesGagat  implements carovShrjox {//cari gagatner@ artaberox class
    public void aycelel(Car gagat) {     //vor@ implement e anum shrjelu metod@
        System.out.print( " " + gagat.banali );//carovShrjox interfeysic
    }
};

class Writefile {

    public Writefile(String[] args) {
    }

    public String write(String[] args) throws IOException {
        File flt = new File("TreeSort.txt");
     PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter(flt)));
        out.print(" ");
        out.flush();
        return " ";
    }
};

class TreeSort {          //sortavorox class Treesort
    public static void main(String args[]) {
        int p;
        Car norCar = new Car(((int)(Math.random() * 101) - 50));//car classi konstruktori kanch
        for (int i = 0; i < 100; i++) {
            p = ((int)(Math.random() * 101) - 50);
            norCar.gagatAvelacnel( new Car( p ) );
        }
        norCar.qayl(new TesGagat());
//        Writefile o1 = new Writefile();
    }
}
