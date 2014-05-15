import parzTivGumar.ParzTivGumar; //parz tver voroshox classi kcum
import java.math.*;   //java standart classi kcum
public class Main {   //Main classi sahmanum
    public static void main(String[] args) { //classi himnakan metod@
        ParzTivGumar o2 = new ParzTivGumar(2000000); //parzTivGumar classi
        BigInteger sum = o2.getSum();               //objekti stexcum   
        int count = o2.getCount();           //metodneri kanchum
        System.out.println("parz tveri gumar@ voronq poqr en " + o2.getLimit() +"-ic havasar e =" + o2.getSum() + " isk dranc qanak@=" + o2.getCount());
        o2.setLimitAndInit(1000);
        System.out.println("parz tveri gumar@ voronq poqr en " + o2.getLimit() +"-ic havasar e =" + o2.getSum() + " isk dranc qanak@=" + o2.getCount());
        o2.setLimitAndInit(100);
        System.out.println("parz tveri gumar@ voronq poqr en " + o2.getLimit() +"-ic havasar e =" + o2.getSum() + " isk dranc qanak@=" + o2.getCount());
        o2.setLimitAndInit(20);
        System.out.println("parz tveri gumar@ voronq poqr en " + o2.getLimit() +"-ic havasar e =" + o2.getSum() + " isk dranc qanak@=" + o2.getCount());
        o2.setLimitAndInit(10);
        System.out.println("parz tveri gumar@ voronq poqr en " + o2.getLimit() +"-ic havasar e =" + o2.getSum() + " isk dranc qanak@=" + o2.getCount());
    }
}
