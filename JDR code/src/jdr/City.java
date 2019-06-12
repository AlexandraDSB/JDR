package jdr;

import java.util.ArrayList;

public class City<T extends Character> {
	private ArrayList<T> characters;
	private String name;
	private int area;
	private int maxCharacters;
	private int presentCharacters;
	enum cleanlinessPossible {bad,correct,good};
	private cleanlinessPossible cleanliness;
	
	
	
	public City(ArrayList<T> characters, String name, int area, int maxCharacters, int presentCharacters) {
		this.characters = characters;
		this.name = name;
		this.area = area;
		this.maxCharacters = maxCharacters;
		this.presentCharacters = presentCharacters;
		cleanliness = cleanlinessPossible.good;
	}
	
	
	public City() {
		this.characters = new ArrayList<T>();
		this.name = "City of Pandora";
		this.area = 2000;
		this.maxCharacters = 1700 ;
		this.presentCharacters = 0;
		cleanliness = cleanlinessPossible.good;
	}


	protected String display() {
		return ", name of the City : " + name + ", Surface : " + area + "max capacity : " + maxCharacters
				+ " characters, number of character present : " + presentCharacters + ", Cleanliness : " + cleanliness + ", Character present : " + characters;
	}

	@Override
	public String toString() {
		return "Type of city : Standard"+display();
	}

	protected void addThis(T character) {
		characters.add(character);
		this.presentCharacters += 1;
		System.out.println(character);
		System.out.println("Character added");
	}
	
	public void addCharacter(T character) {
		if(characters.size()==0) {
			addThis(character);
		}else {
			if(characters.get(0).getClass() == character.getClass()) {
			addThis(character);
			}else {
				System.out.println("Bad type of character, action canceled");
			}
		}
	}

	public void removeCharacter(Character character) {
		this.characters.remove(character);
		this.presentCharacters -= 1;
		System.out.println("Character delete");
	}

	public void feedCharacter() {
		for(int i = 0; i< characters.size();i++) {
			 characters.get(i).setHunger(false);
		}
	}
	
	public void clean() {
		if(characters.size() != 0) {
			System.out.println("This city is not empty, action canceled");
		}else {
			if(this.cleanliness!=cleanlinessPossible.good) {
				this.cleanliness = cleanlinessPossible.good;
				System.out.println("This CIty is now clean");
			}else {
				System.out.println("This City is already clean, action canceled");
			}
		}
	}
	
	
	public ArrayList<T> getCharacter() {
		return characters;
	}
	public void setCharacter(ArrayList<T> characters) {
		this.characters = characters;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getArea() {
		return area;
	}
	public void setArea(int area) {
		this.area = area;
	}
	public int getMaxCharacters() {
		return maxCharacters;
	}
	public void setMaxCharacters(int maxCharacters) {
		this.maxCharacters = maxCharacters;
	}
	public int getPresentCharacters() {
		return presentCharacters;
	}
	public void setPresentCharacters(int presentCharacters) {
		this.presentCharacters = presentCharacters;
	}
	public cleanlinessPossible getCleanliness() {
		return cleanliness;
	}
	public void setCleanliness(cleanlinessPossible cleanliness) {
		this.cleanliness = cleanliness;
	}


}
