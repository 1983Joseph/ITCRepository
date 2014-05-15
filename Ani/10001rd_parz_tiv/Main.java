// Author: Ani G.
//Ays file-um bervac e Main class-i nkaragrutyuny, vory veradardznum e  nermucactvi hamarov parz tivy  

public class Main{
    public static void main(String[]args){
        int i=2;
        int qanak=0;
        int parz=0;
        int tiv;
        try{
            tiv=Integer.parseInt(args[0]);
        }catch(Exception e){
            tiv=10001;
        }
        Parz_tiv parz_tiv= new Parz_tiv();
           
        while (qanak != tiv){

            parz=parz_tiv.parz(i); 
            qanak=qanak+parz;
            i++;
        
        }
        System.out.println(i-1);

    }

}
