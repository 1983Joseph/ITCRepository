
// Author: Ani G.
//Ays file-um bervac e Main class-i nkaragrutyuny, vory veradardznum e cankali gumari shrjanakanerum transportneri cucaky

public class Main{
    public static void main(String[] args) {
        int x;
        try{
            x = Integer.parseInt(args[0]);
        }catch(Exception e){
            x = 10000;
        }

        Metro metro= new Metro();
        metro.tr();
        if (x >= metro.get_tomsi_gin() ) { 
            System.out.println("Metro.");
            System.out.println(" Tomsi arjeqn e` " + metro.get_tomsi_gin() +"dram");
            System.out.println(" Azat texeri qanakn e` " + metro.azat_texeri_qanak());
        }

        Ertuxayin ertuxayin = new Ertuxayin();
        ertuxayin.tr();
        if (x  >= ertuxayin.get_tomsi_gin() ) {
            System.out.println("Ertuxayin.");
            System.out.println(" Tomsi arjeqn e` " + ertuxayin.get_tomsi_gin() +"dram");
            System.out.println(" Azat texeri qanakn e` " + ertuxayin.azat_texeri_qanak());
        }

        if (x < metro.get_tomsi_gin() && x < ertuxayin.get_tomsi_gin() ) { 

            System.out.println("Dzez harmar transport chka ;)\n");
        }
    }	
}
