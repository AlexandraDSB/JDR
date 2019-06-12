package jdr;

public class Berserk extends NotMagic implements SpeakingOrc {

	public Berserk() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Berserk(String name, int weight, int height, int age, boolean hunger, boolean asleep, boolean health,
			boolean sex) {
		super(name, weight, height, age, hunger, asleep, health, sex);
		// TODO Auto-generated constructor stub
	}

	public Berserk(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void speakOrc() {
		System.out.println(this.getName()+ " : I BELIVE I CAN FLY");
		
	}

	@Override
	public Object sword() {
		// TODO Auto-generated method stub
		return null;
	}

}
