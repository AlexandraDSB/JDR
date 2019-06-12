package jdr;

public class BardeHumain extends NotMagic implements SpeakingDwarf, SpeakingOrc {

	public BardeHumain() {
		super();
		// TODO Auto-generated constructor stub
	}

	public BardeHumain(String name, int weight, int height, int age, boolean hunger, boolean asleep, boolean health, boolean sex) {
		super(name, weight, height, age, hunger, asleep, health, sex);
		// TODO Auto-generated constructor stub
	}

	public BardeHumain(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void speakDwarf() {
		System.out.println(this.getName()+" Vorum dwarkar geddum ?");
	}

	@Override
	public void speakOrc() {
		System.out.println(this.getName()+ " Ash nazg durbatulûk, ash nazg gimbatul, ash nazg thrakatulûk agh burzum-ishi krimpatul.");
		
	}

	@Override
	public Object sword() {
		// TODO Auto-generated method stub
		return null;
	}

}
