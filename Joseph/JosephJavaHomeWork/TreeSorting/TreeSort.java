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
        if ( aCar.banali < banali ) {      //anhavasarakshrvac cari paymanneri
            if ( dzax != null ) {
                dzax.gagatAvelacnel( aCar );//stugum @st voronc
            } else {
                dzax = aCar;
            }                              //karucvum e car@
        } else {
            if ( aj != null ) {
                aj.gagatAvelacnel( aCar );
            } else {
                aj = aCar;
            }
        }
    }

    public void qayl(carovShrjox aycelvoxGagat) {//car classi metod, vor@ 
        if ( dzax != null) {               //carShrjox interfeysi mijocov ev 
            dzax.qayl( aycelvoxGagat ); //binar cari kanonneri hamadzayn  
        }                               //ancnume e cari gagatneri vrayov 
        aycelvoxGagat.aycelel(this);
        if ( aj != null ) { 
            aj.qayl( aycelvoxGagat );
        }
    }
}

interface carovShrjox {  //cari gagatnerov ancnox interfeys

    public void aycelel(Car gagat);//interfejsi miak metod@
};

class TpelGagat implements carovShrjox {//cari gagatner@ artaberox class

    public void aycelel(Car gagat) {     //vor@ implement e anum shrjelu metod@
        ArrayList <Integer> carArray = new ArrayList();//carovShrjox interfeysic
        carArray.add(gagat.banali);
    }

}

class TesGagat implements carovShrjox {//cari gagatner@ artaberox class

    public void aycelel(Car gagat) {     //vor@ implement e anum shrjelu metod@
        System.out.print( " " + gagat.banali );//carovShrjox interfeysic
    }
};

class Writefile {

    public void write(String tox, String filename) throws IOException {
        File flt = new File(filename);
        PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter(flt,true)));
        out.print(tox);
        out.close();
    }
};

class Read {

    public static ArrayList <Integer> read(String filename) throws IOException {
        ArrayList <Integer> norArray = new ArrayList();
        try {
            Scanner scanner = new Scanner(new File(filename));
            while (scanner.hasNextInt()) {
                norArray.add(scanner.nextInt());
            }
            scanner.close();
            for(int k=0; k < norArray.size(); k++) {
                System.out.print(" " + norArray.get(k));
            }
        } catch (IOException e) {
            System.out.println("sxal " + e);
        }
        return norArray;
    }

};

class Zangvac {

    public static int[] massiv(int chap, String filename) {
        Writefile grox = new Writefile();
        int[] tveriMassiv = new int[chap];
        for (int i = 0; i < chap; i++) {
            tveriMassiv[i] = ((int)(Math.random() * chap) - (chap/2));
            try {
                grox.write( " "+ tveriMassiv[i], filename );
            }
            catch (IOException e) {
            }
        }
        return tveriMassiv;
    }
}

class TreeSort {//sortavorox class Treesort

    public static void main(String args[]) {
        ArrayList <Integer> norArray = new ArrayList();
        Scanner norScanner = new Scanner(System.in);
        System.out.print("mutqagreq massivi chap@: ");
        int chaps = norScanner.nextInt();
        System.out.print("mutqagreq filename vortex petq e grvi massiv@: ");
        String filename1 = norScanner.next();
        int[] tiviMassiv = Zangvac.massiv(chaps, filename1);
        System.out.print("mutqagreq filename vortexic petq e vercrvi massiv@: ");
        String filename2 = norScanner.next();
        try {
            norArray = Read.read(filename2);
        } catch (IOException e) {
        }
        System.out.print("\n#########################################################################");
        System.out.print("\n");
        Car norCar = new Car(norArray.get(0));
        for (int i = 1; i < norArray.size(); i++) {
            norCar.gagatAvelacnel( new Car(norArray.get(i)) );
        }
        Writefile grox = new Writefile();
        norCar.qayl(new TesGagat());
        for(int k=0; k < carArray.size(); k++) {
            try {
                grox.write( " "+ carArray(k), filename );
            }
            catch (IOException e) {
            }
        }
        //norCar.qayl(new TpelGagat());
        System.out.print("\n");
    }
}
