package ex1;

import java.util.Date;

public class Entreprise {


	/** Attributs de la classe Entreprise
	 * @param siret en tant qu'entier
	 * @param nom en tant que string
	 * @param adresse en tant que string
	 * @param dateCreation en tant que date
	 * @param CAPITAL_MAX en tant que constante
	 */
	
	private int siret;
	private String nom;
	private String adresse;
	private Date dateCreation;

	public static final int CAPITAL_MAX = 3000000;
	

	/** Constructor de la classe Entreprise
	 * @param siret
	 * @param nom
	 * @param adresse
	 * @param dateCreation
	 */
	public Entreprise(int siret, String nom, String adresse, Date dateCreation) {
		super();
		this.siret = siret;
		this.nom = nom;
		this.adresse = adresse;
		this.dateCreation = dateCreation;
	}



	/* cette methode n'a pas de contenu... mis en commentaire temporairement
	public void Afficher_statut(){
		
	}
	 */




	/** Getter
	 * @return the siret
	 */
	public int getSiret() {
		return siret;
	}





	/** Setter
	 * @param siret the siret to set
	 */
	public void setSiret(int siret) {
		this.siret = siret;
	}





	/** Getter
	 * @return the nom
	 */
	public String getNom() {
		return nom;
	}





	/** Setter
	 * @param nom the nom to set
	 */
	public void setNom(String nom) {
		this.nom = nom;
	}





	/** Getter
	 * @return the adresse
	 */
	public String getAdresse() {
		return adresse;
	}





	/** Setter
	 * @param adresse the adresse to set
	 */
	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}





	/** Getter
	 * @return the date_Creation
	 */
	public Date getDateCreation() {
		return dateCreation;
	}





	/** Setter
	 * @param date_Creation the date_Creation to set
	 */
	public void setDateCreation(Date dateCreation) {
		this.dateCreation = dateCreation;
	}
	
}
