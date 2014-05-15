import fibonaccis.Fibonacci4;
import java.math.BigInteger;
public class Main {
    public static void main(String[] args) {
        Fibonacci4 o1 = new Fibonacci4(1000);
        int size = o1.getNumber();
        BigInteger number = o1.getValue();
        System.out.println("araji fibonaccii tar@ vor@ uni " + o1.getCount() +" nish =" + o1.getValue() + " ajd tari hamarn@=" + o1.getNumber());
        o1.setCountAndInit(5);
        System.out.println("araji fibonaccii tar@ vor@ uni " + o1.getCount() +" nish =" + o1.getValue() + " ajd tari hamarn@=" + o1.getNumber());
        o1.setCountAndInit(10);
        System.out.println("araji fibonaccii tar@ vor@ uni " + o1.getCount() +" nish =" + o1.getValue() + " ajd tari hamarn@=" + o1.getNumber());
        o1.setCountAndInit(4);
        System.out.println("araji fibonaccii tar@ vor@ uni " + o1.getCount() +" nish =" + o1.getValue() + " ajd tari hamarn@=" + o1.getNumber());
        o1.setCountAndInit(3);
        System.out.println("araji fibonaccii tar@ vor@ uni " + o1.getCount() +" nish =" + o1.getValue() + " ajd tari hamarn@=" + o1.getNumber());
        o1.setCountAndInit(2);
        System.out.println("araji fibonaccii tar@ vor@ uni " + o1.getCount() +" nish =" + o1.getValue() + " ajd tari hamarn@=" + o1.getNumber());
    }
}
