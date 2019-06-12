package jdr;

public class MageElf extends Magic implements SpeakingElf {
	/* class Mage*/
	

	public MageElf() {
		super();
		// TODO Auto-generated constructor stub
	}

	public MageElf(String name, int weight, int height, int age, boolean hunger, boolean asleep, boolean health,
			boolean sex) {
		super(name, weight, height, age, hunger, asleep, health, sex);
		// TODO Auto-generated constructor stub
	}

	public MageElf(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void speakElf() {
		System.out.println(this.getName()+" est en train de vagabonder");
	}
	
	public void cry() {
		super.cry();
		System.out.println("AHOUUU");
	}

	
}
