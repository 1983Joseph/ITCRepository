// Author: Ani G.
// Ays file-um bervum e Main class-i nkaragrutyuny, vory veradardznum e 1-ic minchev dzer nermucac tvi amenapoqr yndhanur bazmapatiky

public class Main{
    public static void main(String[]args){
       int yndhanur_bazmapatik=1;
        int tiv;
        try{
            tiv=Integer.parseInt(args[0]);
        }catch(Exception e){
            tiv=10;
        }
        Bazmapatik bazmapatik= new Bazmapatik();
        for(int i=1; i<=tiv; i++ ){
            
           yndhanur_bazmapatik=bazmapatik.bazma(yndhanur_bazmapatik , i);
        }
        System.out.println(yndhanur_bazmapatik);

    }

}
