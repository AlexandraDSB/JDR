package jdr;

public class Elf extends Magic implements SpeakingElf {
	/* class Elf 
	 * @see description the elf can speak elf and they are magical */

	public Elf() {
		super();
	}

	public Elf(String name, int weight, int height, int age, boolean hunger, boolean asleep, boolean health,
			   boolean sex) {
		super(name, weight, height, age, hunger, asleep, health, sex);
	}

	public Elf(String name) {
		super(name);
	}

	@Override
	public void speakElf() {
		System.out.println(this.getName()+"Can enter in the Forest");
	}

}
