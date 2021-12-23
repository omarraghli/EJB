package ma.fstt.tools;

import ma.fstt.beans.EtudiantTraitementBean;
import ma.fstt.entities.Etudiant;

public class Test {

	public static void main(String[] args) {
		EtudiantTraitementBean etudiantBean = new EtudiantTraitementBean();
		Etudiant etudiant = new Etudiant(0, "Test", "Hood", "KB1333", "Belle vue", "LSI2 S3");
		etudiantBean.save(etudiant);
	}

}
