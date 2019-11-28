package ex3;

import java.util.ArrayList;
import java.util.List;

public abstract class Zone {

	private List<String> types = new ArrayList<String>();
	private List<String> noms = new ArrayList<String>();
	private List<String> comportements = new ArrayList<String>();
	
	public void addAnimal(String nomAnimal, String typeAnimal, String comportement) {
		noms.add(nomAnimal);
		types.add(typeAnimal);
		comportements.add(comportement);
	}
	
	public void afficherListeAnimaux(){
		for (String nom: noms){
			System.out.println(nom);
		}
	}
	
	public int compterAnimaux(){
		return noms.size();
	}
	
	public abstract double getPoids();
	
	public double calculerKgsNourritureParJour(){
		return noms.size() * getPoids();
	}
}
