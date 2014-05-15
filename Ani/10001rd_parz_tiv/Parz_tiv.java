// Author: Ani G.
// Ays file-um nkaragrvac funkcian veradardznum e 0 arjeq, ete tivy parz e, 1 hakarak depqum

public class Parz_tiv {
    public int parz(int tiv){
	int parza=1;
       for (int i=2;  i <= tiv / 2; i++){

            if(tiv % i == 0){
                parza=0;
                break;
            }
        }
        return parza;
    }
}
