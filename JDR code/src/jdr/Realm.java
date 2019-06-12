package jdr;

import java.util.ArrayList;
import java.util.Random;

import jdr.City.cleanlinessPossible;

public class Realm {

	private String name;
	private God god;
	private int nbMaxCity ; 
	private ArrayList<City> cities = new ArrayList<>();

	public Realm(String name, God god, int nbMaxEnclosures, ArrayList<City> cities) {
		super();
		this.name = name;
		this.god = god;
		this.nbMaxCity  = nbMaxCity ;
		this.cities = cities;
	}
	
	
	public Realm(God god, ArrayList<City> cities) {
		super();
		this.name = "bidule";
		this.god = god;
		this.nbMaxCity  = 23;
		this.cities = cities;
	}
	
	


	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public God getGod() {
		return god;
	}

	public void setGod(God god) {
		this.god = god;
	}

	public int getNbMaxCity () {
		return nbMaxCity ;
	}

	public void setNbMaxRealm(int nbMaxEnclosures) {
		this.nbMaxCity  = nbMaxEnclosures;
	}

	public ArrayList<City> getCities() {
		return cities;
	}

	public void setCities(ArrayList<City> cities) {
		this.cities = cities;
	}

	public void ShowNbCharacterForEachCity () {
		for(int i = 0; i< cities.size(); ++i) {
			System.out.println("number Animals For Each City "+ cities.get(i).getPresentCharacters());
		    ;
		}
	}
	
	public void ShowNbCharacter() {
		int sum = 0;
		for(int i = 0; i< cities.size(); i++) {
			sum += cities.get(i).getPresentCharacters();
			}
		System.out.println("Nb Character is  "+sum);
	}
	
	
	public void setHealthCharacter() {
		
		for(int i = 0; i< cities.size(); i++) {
					
					int rand = new Random().nextInt(cities.get(i).getCharacter().size());
				
					((Character) cities.get(i).getCharacter().get(rand)).setHunger(true);
			 
		}
		
	}
	
	public void setDirtCity() {
		for(int i = 0; i< cities.size(); i++) {
			 
			 cities.get(i).setCleanliness(cleanlinessPossible.bad);
			}
		
	}

	@Override
	public String toString() {
		return "Realm [name=" + name + ", god=" + god + ", nbMaxCity =" + nbMaxCity + ", cities="
				+ cities + "]";
	}
}
