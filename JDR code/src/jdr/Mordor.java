package jdr;

import java.util.ArrayList;

public class Mordor<T extends Character> extends City {
	
	private int height;

	public Mordor() {
		super();
		this.height = 750;
	}

	public Mordor(ArrayList<Character> characters, String name, int area, int maxCharacters, int presentCharacters, int height) {
		super(characters, name, area, maxCharacters, maxCharacters);
		this.height = height;
	}
	
	public void clean() {
		
	}
	
	
	@Override
	public void addCharacter(Character character) {
		if(character instanceof SpeakingOrc)
		{
			 super.addCharacter(character);
		}else {
			System.out.println("This character can't survive in the Mordor, he cant't go inside, action canceled");
		}
	}

}
