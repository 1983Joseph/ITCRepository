package parzTivGumar; //pateti stexcum
import java.math.*;   //javai standart klassneri kcum@
import java.util.*;

public class ParzTivGumar {  //klassi       
    protected BigInteger sum; //popoxakanneri hajtararum
    protected int count;
    protected int mLimit;
    protected int divisor; 

    public ParzTivGumar(int limit) { //konstruktori sahmanum
        setLimitAndInit(limit);
    }

    public void init() {  //klassi himnakan metodi sahmanum
        sum = BigInteger.valueOf(0); //sumin veragrum naxnakan 0 arjeq
        count = 0; //parz tveri qanakin veragrum naxnakan 0 arjeq
        int limit = mLimit; //sahmani veragrum
        for(int j=2; j<=limit; j++) { //parz tver@ voroshox himnakan cikl
            divisor = 0;
            for (int i=1; i*i<=j; i++) {
                if(j % i == 0)
                    divisor++;
                if(divisor>=2)
                    break;
            }
            if(divisor<2) {
                count++;
                sum = sum.add(BigInteger.valueOf(j)); //gumari hashvum
            }
        }
    }

    public int getLimit() { //parz tveri hashvarki sahmani get metodi sahmanum
        return mLimit;
    }

    public void setLimitAndInit(int newLimit) { //klassi himnakan metodi kanch@
        mLimit = newLimit;                   
        init();
    } 

    public BigInteger getSum() {  //parz tveri gumar get metodi sahmanum
        return sum;
    }

    public int getCount() { //parz tveri qanaki get metodi sahmanum
        return count;
    }
}
