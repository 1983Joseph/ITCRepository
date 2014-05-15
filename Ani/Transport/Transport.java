
// Author: Ani G.
//Ays file-um bervac e himnakan Transport class-i  nkaragrutyuny, voric jarangum en myusnery

public class Transport {
	private int nstatexeri_qanak;
	private int aragutyun;
	private int tomsi_gin;
	private int zbaxvac_texeri_qanak;

	public int azat_texeri_qanak(){
		return nstatexeri_qanak - zbaxvac_texeri_qanak;
		
	}

    public int get_nstatexeri_qanak(){
        return nstatexeri_qanak;
    }

    protected void set_nstatexeri_qanak(int qanak){
        nstatexeri_qanak = qanak;
    }

    public int get_aragutyun(){
        return aragutyun;
    }

    protected void set_aragutyun(int v){
        aragutyun = v;
    }

    public int get_tomsi_gin(){
        return tomsi_gin;
    }

    protected void set_tomsi_gin(int gin){
        tomsi_gin = gin;
    }

    public int get_zbaxvac_texeri_qanak(){
        return zbaxvac_texeri_qanak;
    }

    protected void set_zbaxvac_texeri_qanak(int qanak){
        zbaxvac_texeri_qanak = qanak;
    }
}
