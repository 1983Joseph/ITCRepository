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
        //carovShrjox interfeysic
        Writefile grox = new Writefile();
        try {
            grox.write( " "+ gagat.banali);
        }
        catch (IOException e) {
        }
    }
}

class TesGagat implements carovShrjox {//cari gagatner@ artaberox class
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
    public void write(String tox, String filename) throws IOException {
        File flt = new File(filename);
        PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter(flt,true)));
        out.print(tox);
        out.close();
    }
};

class Read {

    public static ArrayList <Integer> read() throws IOException {
            ArrayList <Integer> nor = new ArrayList();
        try {
            Scanner scanner = new Scanner(new File("TreeSort.txt"));
            while (scanner.hasNextInt()) {
                nor.add(scanner.nextInt());
            }
            scanner.close();
            for(int k=0; k < nor.size(); k++) {
                System.out.println( + nor.get(k));
            }
        } catch (IOException e) {
            System.out.println("sxal " + e);
        }
        return nor;
    }

};

class Zangvac {
    public static int[] massiv(int chap, String filename) {
        Writefile grox = new Writefile();
        int[] tver = new int[chap];
        for (int i = 0; i < chap; i++) {
            tver[i] = ((int)(Math.random() * chap) - (chap/2));
            try {
                grox.write( " "+ tver[i], filename );
            }
            catch (IOException e) {
            }
        }
        return tver;
    }
}

class TreeSort {          //sortavorox class Treesort
    public static void main(String args[]) {
        ArrayList <Integer> nir = new ArrayList();
        Scanner nor = new Scanner(System.in);
        System.out.print("mutqagreq massivi chap@: ");
        int chaps = nor.nextInt();
        System.out.print("mutqagreq filename vortex petq e grvi massiv@: ");
        String name = nor.next();
        int[] tiv = Zangvac.massiv(chaps, name);
        try {
        nir = Read.read();
        } catch (IOException e) {
        }
        Car norCar = new Car(nir.get(0));
         for (int i = 1; i < nir.size(); i++) {
             norCar.gagatAvelacnel( new Car(nir.get(i)) );
         }
      //   norCar.qayl(new TesGagat());
    //     norCar.qayl(new TpelGagat());
    }
}
//        Car norCar = new Car(((int)(Math.random() * 500000) - 250000));//car classi konstruktori kanch
