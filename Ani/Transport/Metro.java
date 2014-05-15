
// Author: Ani G.
//Ays file-um bervac e Metro class-i nkaragrutyuny vory jarangum e Transport class-ic

public class Metro extends Transport {
	private int vagonneri_qanak=5;
    private int vagoni_nstatexeri_qanak=30;

	public void tr() {
		set_zbaxvac_texeri_qanak(80);
		set_tomsi_gin(80);
		set_nstatexeri_qanak(vagonneri_qanak * vagoni_nstatexeri_qanak);
	}

}
