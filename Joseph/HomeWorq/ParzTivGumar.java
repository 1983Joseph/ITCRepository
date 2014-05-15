public class ParzTivGumar {
    public long scan(long begin,long end) {
        long bajanich = 0;
        long gumar = 0;
        label: for(long i=begin ; i<=end; i++) {
                   for(long j=1 ; j<=i ; j++) {
                       if (i % j==0)
                           bajanich++;
                         if (bajanich>2) {
                             bajanich=0;
                             continue label;
                         }
                   }
                   if (bajanich==2) {
                       System.out.print(i+", ");
                       gumar = gumar + i;
                   }
                   bajanich=0;
         }
             return gumar;
    }
    public static void main(String[] args) {
        long gumar;
        ParzTivGumar A = new ParzTivGumar();
        gumar = A.scan(1,100);
        System.out.print(" gumar = "+gumar);
    }
}
