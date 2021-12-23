package ma.fstt.entities;

import java.io.Serializable;
import java.lang.String;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: Etudiant
 *
 */
@Entity
public class Etudiant implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(nullable = false, unique = true)
	private int idEtudiant;
	private String nomEtudiant;
	private String prenomEtudiant;
	private String cneEtudiant;
	private String adresseEtudiant;
	private String niveauEtudiant;
	private static final long serialVersionUID = 1L;

	public Etudiant() {
		super();
	}

	public Etudiant(int idEtudiant, String nomEtudiant, String prenomEtudiant, String cneEtudiant,
			String adresseEtudiant, String niveauEtudiant) {
		super();
		this.idEtudiant = idEtudiant;
		this.nomEtudiant = nomEtudiant;
		this.prenomEtudiant = prenomEtudiant;
		this.cneEtudiant = cneEtudiant;
		this.adresseEtudiant = adresseEtudiant;
		this.niveauEtudiant = niveauEtudiant;
	}

	public int getIdEtudiant() {
		return this.idEtudiant;
	}

	public void setIdEtudiant(int idEtudiant) {
		this.idEtudiant = idEtudiant;
	}

	public String getNomEtudiant() {
		return this.nomEtudiant;
	}

	public void setNomEtudiant(String nomEtudiant) {
		this.nomEtudiant = nomEtudiant;
	}

	public String getPrenomEtudiant() {
		return this.prenomEtudiant;
	}

	public void setPrenomEtudiant(String prenomEtudiant) {
		this.prenomEtudiant = prenomEtudiant;
	}

	public String getCneEtudiant() {
		return this.cneEtudiant;
	}

	public void setCneEtudiant(String cneEtudiant) {
		this.cneEtudiant = cneEtudiant;
	}

	public String getAdresseEtudiant() {
		return this.adresseEtudiant;
	}

	public void setAdresseEtudiant(String adresseEtudiant) {
		this.adresseEtudiant = adresseEtudiant;
	}

	public String getNiveauEtudiant() {
		return this.niveauEtudiant;
	}

	public void setNiveauEtudiant(String niveauEtudiant) {
		this.niveauEtudiant = niveauEtudiant;
	}

	@Override
	public String toString() {
		return "Etudiant [idEtudiant=" + idEtudiant + ", nomEtudiant=" + nomEtudiant + ", prenomEtudiant="
				+ prenomEtudiant + ", cneEtudiant=" + cneEtudiant + ", adresseEtudiant=" + adresseEtudiant
				+ ", niveauEtudiant=" + niveauEtudiant + "]";
	}
}
