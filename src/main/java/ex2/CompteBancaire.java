package ex2;

/** Représente un compte bancaire de type compte courante (type=CC) ou livret A (type=LA)
 * @author DIGINAMIC
 */
public class CompteBancaire {

	/** solde : solde du compte */
	private double solde;
	
	/** decouvert : un découvert est autorisé seulement pour les comptes courants */
	private double decouvert;
	
	/** tauxRemuneration : taux de rémunération dans le cas d'un livret A */
	private double tauxRemuneration;
	
	/** Le type vaut soit CC=Compte courant, ou soit LA=Livret A */
	private String type;
	
	/** Ce constructeur est utilisé pour créer un compte générique
	 * @param type = CC (Compte Courant)
	 * @param solde représente le solde du compte
	 * @param decouvert  représente le découvert autorisé
	 */
	public CompteBancaire(String type, double solde, double decouvert) {
		super();
		this.type = type;
		this.solde = solde;
		this.decouvert = decouvert;
	}
	

	
	/** Ajoute un montant au solde
	 * @param montant
	 */
	public void ajouterMontant(double montant){
		this.solde += montant;
	}
	
	/** Ajoute un montant au solde
	 * @param montant
	 */
	public void debiterMontant(String type, double montant, double decouvert){
		
		// initialisation de la variable dec qui correspondra au decouvert dans les deux cas de figure
		double dec = 0;
		
		if (type.equals("LA")){
			dec = 0;
		}
		else { 
			dec = decouvert;
		}
				
		if (this.solde - montant > dec){
			this.solde -= montant;
		}	


	}
	
	public void appliquerRemuAnnuelle(){
		if (type.equals("LA")){
			this.solde += solde * tauxRemuneration / 100;
		}
	}
	
	/** Getter for solde
	 * @return the solde
	 */
	public double getSolde() {
		return solde;
	}

	
	/** Setter
	 * @param solde the solde to set
	 */
	public void setSolde(double solde) {
		this.solde = solde;
	}
	
	
	/** Getter for decouvert
	 * @return the decouvert
	 */
	public double getDecouvert() {
		return decouvert;
	}
	
	
	/** Setter
	 * @param decouvert the decouvert to set
	 */
	public void setDecouvert(double decouvert) {
		this.decouvert = decouvert;
	}
	
	
	/** Getter for tauxRemuneration
	 * @return the tauxRemuneration
	 */
	public double getTauxRemuneration() {
		return tauxRemuneration;
	}
	
	
	/** Setter
	 * @param tauxRemuneration the tauxRemuneration to set
	 */
	public void setTauxRemuneration(double tauxRemuneration) {
		this.tauxRemuneration = tauxRemuneration;
	}
	
	
	/** Getter for type
	 * @return the type
	 */
	public String getType() {
		return type;
	}
	
	
	/** Setter
	 * @param type the type to set
	 */
	public void setType(String type) {
		this.type = type;
	}
}
