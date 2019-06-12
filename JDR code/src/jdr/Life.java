package jdr;

import java.util.ArrayList;

public class Life {

	public static void main(String[] args) {
		
		Character elf = new Elf();
		Character mage = new Mage();
		
		City city1 = new City();
		City city2 = new City();
		
		city1.addCharacter(elf);
		city2.addCharacter(mage);
		
		city1.display();
		city2.display();
		
		God god = new God(city1);
		
		god.toString();
		god.examineEnclosure();
		
		
		ArrayList<City> cities = new ArrayList ();
		
		cities.add(city1);
		
		Realm realm1 = new Realm(god, cities);
		
		int jetonPlay = 3 ;
		
		int jetonPlayGod = 2; 
		
		if(jetonPlay >= 3)
		{
			god.examineEnclosure();
			god.cleanEnclosure();
			god.examineEnclosure();
			
		}
		
		if(jetonPlayGod <= 2) {
			realm1.setDirtCity();
			realm1.ShowNbCharacter();
			realm1.ShowNbCharacterForEachCity();
			
		}
		
		
		
		

	}

	

}
