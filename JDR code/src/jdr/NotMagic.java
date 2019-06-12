package jdr;

public abstract class NotMagic extends Character {
	
	public NotMagic(String name, int weight, int height, int age, boolean hunger, boolean asleep, boolean health, boolean sex) {
		super(name, weight, height, age, hunger, asleep, health, sex);
	}

	public NotMagic() {
		super();
	}
	
	public NotMagic(String name) {
		super(name);
	}

	public abstract Object sword();

}
