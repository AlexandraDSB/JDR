package jdr;

import jdr.City.cleanlinessPossible;

public class God {
	private String name ; 
	private String alignement ; 
	private City city;
	
	public God(String name, String alignement, City city) {
		super();
		this.name = name;
		this.alignement = alignement;
		this.city = city;
	}

	public God(City city) {
		super();
		this.name = "Marcel";
		this.alignement = "BON";
		this.city = city;
	}

	public void examineEnclosure() {
		System.out.println(city.display());
		
	}
	
	
	public void cleanEnclosure() {
		city.setCleanliness(cleanlinessPossible.good);
	}
	
	public void feedAnimal() {
		for (int i = 0; i< city.getCharacter().size(); ++i) {
			if(((Character) city.getCharacter().get(i)).isHunger() == true)
			{
				((Character) city.getCharacter().get(i)).setHunger(false);
			}
		}
		
	}
	
	public void Teleportation(City cityDep ,Character character, City cityArr) {
		
		cityArr.addCharacter(character);
		cityDep.removeCharacter(character);
		
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getAlignement() {
		return alignement;
	}


	public void setAlignement(String alignement) {
		this.alignement = alignement;
	}


	public City getCity() {
		return city;
	}


	public void setCity(City city) {
		this.city = city;
	}


	@Override
	public String toString() {
		return "God [name=" + name + ", alignement=" + alignement + ", city=" + city + "]";
	}

}
