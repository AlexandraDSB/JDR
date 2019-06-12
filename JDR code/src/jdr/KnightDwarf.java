package jdr;

public class KnightDwarf extends NotMagic implements SpeakingDwarf {

	@Override
	public void speakDwarf() {
		System.out.println("En avant ! YEAHHH ");
	}

	public KnightDwarf() {
		super();
		// TODO Auto-generated constructor stub
	}

	public KnightDwarf(String name, int weight, int height, int age, boolean hunger, boolean asleep, boolean health,
			boolean sex) {
		super(name, weight, height, age, hunger, asleep, health, sex);
		// TODO Auto-generated constructor stub
	}

	public KnightDwarf(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	@Override
	public Object sword() {
		// TODO Auto-generated method stub
		return null;
	}

}
