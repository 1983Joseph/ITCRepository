import java.io.*;
import java.util.Scanner;
import java.util.ArrayList;

public class BinarySearch {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int voroneliTiv;
        int Chap;
        int tarberak;
        System.out.print("mutqagreq voroneli tiv@: ");
        voroneliTiv = sc.nextInt();
        System.out.print("mutqagreq massivi chap@: ");
        Chap = sc.nextInt();
        int[] tver = new int[Chap];
        System.out.print("mutqagreq amboxj tver: ");
        for (int i = 0; i < tver.length; i++) {
            tver[i] = sc.nextInt();
        }

        System.out.println("inch metodov eq cankanum gtnel tiv@");
        System.out.print("iterativi hamar sexmeq 1 , rekursivi hamar sexmeq 2: ");
        tarberak = sc.nextInt();
        switch (tarberak) {
            case 1:
                binarySearch(tver,0,Chap-1,voroneliTiv);
                break;
            case 2:
                binariRecursiveSearch(tver, voroneliTiv, 0, Chap-1);
                break;
            default:
                System.out.println("aytpisi tarberak chi naxatesvel");
        }
    }

    public static int binariRecursiveSearch(int[] array, int voroneliTiv, int skizb, int verj) {
        if (verj < skizb) {
            return 0;
        } else {
            int dirq = (skizb + verj)/2;
            if (array[dirq] > voroneliTiv) {
                return binariRecursiveSearch(array, voroneliTiv, skizb, dirq-1);
            } else if (array[dirq] < voroneliTiv) {
                return binariRecursiveSearch(array, voroneliTiv, dirq+1, verj);
            } else {
                System.out.println("tiv@ gtnvel e " + (dirq+1) + " dirqum");
                return dirq;
            }
        }
    }


    public static void binarySearch(int[] array,int skizb,int verj,int voroneliTiv) {

        long start = System.currentTimeMillis();
        int dirq;
        int qayleriQanak = 1;

        dirq = (skizb + verj)/2;
        while((array[dirq] != voroneliTiv)&&(skizb <= verj)) {
            qayleriQanak++;
            if (array[dirq] > voroneliTiv) {
                verj = dirq - 1;
            } else {
                skizb = dirq + 1;
            }
            dirq = (skizb + verj)/2;
        }
        if (skizb <= verj) {
            System.out.println("tiv@ gtnvel e " + qayleriQanak + " qayl heto " + (dirq+1) + " dirqum");
        } else
            System.out.println("tiv@ chi gtnvel, katarvel e ajsqan qayl " + qayleriQanak);
        long end = System.currentTimeMillis();
        System.out.println("metodi ashxatanq@ tevec " + ((end - start)/1000) + " miliv");
    }
}
