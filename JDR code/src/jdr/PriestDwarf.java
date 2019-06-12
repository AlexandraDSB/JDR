package jdr;

public class PriestDwarf extends Magic implements SpeakingDwarf {

	
	public PriestDwarf() {
		super();
		// TODO Auto-generated constructor stub
	}

	public PriestDwarf(String name, int weight, int height, int age, boolean hunger, boolean asleep, boolean health,
			boolean sex) {
		super(name, weight, height, age, hunger, asleep, health, sex);
		// TODO Auto-generated constructor stub
	}

	public PriestDwarf(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void speakDwarf() {
		System.out.println(this.getName()+" nage lentement");		
	}

	

}
