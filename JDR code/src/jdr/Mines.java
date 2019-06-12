package jdr;

import java.util.ArrayList;

public class Mines<T extends Character> extends City {
	public int salinity;
	public int depth;
	
	
	
	public Mines() {
		super();
		this.salinity = 15;
		this.depth = 23;
	}
	
	public Mines(ArrayList<T> charaters, String name, int area, int maxCharaters, int presentCharacters, int depth, int salinity) {
		super(charaters, name, area, maxCharaters, presentCharacters);
		this.depth = depth;
		this.salinity = salinity;
	}
	
	@Override
	public void addCharacter(Character character) {
		if(character instanceof SpeakingDwarf)
		{
			super.addCharacter(character);
		}
		System.out.println("Bad type of charatere action canceled");
	}	
	
	public void clean() {
		return;
	}
	
	public String toString() {
		return null;
	}
	
	
	
	public int getSalinity() {
		return salinity;
	}
	public void setSalinity(int salinity) {
		this.salinity = salinity;
	}
	public int getDepth() {
		return depth;
	}
	public void setDepth(int depth) {
		this.depth = depth;
	}
	
	

}
