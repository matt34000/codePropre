package ex2;

public class LivretA extends CompteBancaire {

	/** Ce constructeur est utilisé pour créer un compte de type Livret A
	 * @param type = LA
	 * @param solde représente le solde du compte
	 * @param decouvert  représente le découvert autorisé
	 * @param tauxRemuneration  représente le taux de rémunération du livret A
	 */
	public CompteBancaire(String type, double solde, double tauxRemuneration) {
		super();
		this.type = type;
		this.solde = solde;
		this.decouvert = 0;
		this.tauxRemuneration = tauxRemuneration;
	}

}
