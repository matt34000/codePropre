package ex3;

/**
 * @author DIGINAMIC
 */
public class Zoo {

	private String nom;
	private SavaneAfricaine SavaneAfricaine = new SavaneAfricaine();
	private ZoneCarnivore ZoneCarnivore = new ZoneCarnivore();
	private FermeReptile FermeReptile = new FermeReptile();
	private Aquarium Aquarium = new Aquarium();
	
	public Zoo(String nom){
		this.nom = nom;
	}
	
	public void addAnimal(String nomAnimal, String typeAnimal, String comportement){
		if (typeAnimal.equals("MAMMIFERE") && comportement.equals("CARNIVORE")){
			ZoneCarnivore.addAnimal(nomAnimal, typeAnimal, comportement);
		}
		else if (typeAnimal.equals("MAMMIFERE") && comportement.equals("HERBIVORE")){
			SavaneAfricaine.addAnimal(nomAnimal, typeAnimal, comportement);
		}
		else if (typeAnimal.equals("REPTILE")){
			FermeReptile.addAnimal(nomAnimal, typeAnimal, comportement);
		}
		else if (typeAnimal.equals("POISSON")){
			Aquarium.addAnimal(nomAnimal, typeAnimal, comportement);
		}
	}
	
	public void afficherListeAnimaux(){
		SavaneAfricaine.afficherListeAnimaux();
		ZoneCarnivore.afficherListeAnimaux();
		FermeReptile.afficherListeAnimaux();
		Aquarium.afficherListeAnimaux();
	}

	/** Getter for nom
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
}
