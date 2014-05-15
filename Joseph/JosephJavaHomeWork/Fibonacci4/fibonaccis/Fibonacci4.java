package fibonaccis;
import java.math.BigInteger;
import java.util.ArrayList;

public class Fibonacci4 {
    protected ArrayList table = new ArrayList();
    protected BigInteger limit;
    protected int number;
    protected int mCount;
    protected BigInteger value;
   
    public Fibonacci4(int count) {
        setCountAndInit(count);
    }

    public void init() {
        number = 2;
        limit = BigInteger.valueOf(10).pow(mCount - 1);
        table.add(BigInteger.valueOf(1));
        table.add(BigInteger.valueOf(1));
        BigInteger lastfibo;
        BigInteger lastlastfibo;
        BigInteger nextfibo;
        do { 
            lastfibo = (BigInteger)table.get(number-1);
            lastlastfibo = (BigInteger)table.get(number-2);
            nextfibo = lastfibo.add(lastlastfibo);
            table.add(nextfibo);
            number++;
        } while(nextfibo.compareTo(limit)<=0);
        value = (BigInteger) table.get(number - 1);
    }

    public int getNumber() {
        return number;
    }

    public BigInteger getValue() {
        return value;
    }

    public int getCount() {
        return mCount;
    }

    public void setCountAndInit(int newCount) {
        mCount = newCount;
        init();
    }
}
