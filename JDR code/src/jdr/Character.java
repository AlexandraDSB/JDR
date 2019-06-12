package jdr;

public abstract class Character {
	
	private String name;
	private boolean sex; // true = male, false = female
	private int weight;
	private int height;
	private int age;
	private boolean hunger;
	private boolean asleep;
	private boolean health;
	private String respons;
	
	public Character(String name, int weight, int height, int age, boolean hunger, boolean asleep, boolean health, boolean sex) {
		this.name = name;
		this.weight = weight;
		this.height = height;
		this.age = age;
		this.hunger = hunger;
		this.asleep = asleep;
		this.health = health;
		this.sex = sex;
	}
	
	public Character() {
		this.name = "Albert";
		this.weight = 56;
		this.height = 126;
		this.age = 32;
		this.hunger = false;
		this.asleep = false;
		this.health = false;
		this.sex = false;
	};

	public Character(String name) {
		this.name = name;
		this.weight = 56;
		this.height = 126;
		this.age = 32;
		this.hunger = false;
		this.asleep = false;
		this.health = false;
		this.sex = false;
	};
	
	public void eat() {
		if(!this.isAsleep()) {
			this.setHunger(false);
		}
	};
	
	public void cry() {
		System.out.println(this.getName()+" veut communiquer : ");
	};
	
	public void heal() {
		this.health = true;
	};
	
	public void sleep() {
		if(this.asleep == false) {
			this.asleep = true;
		}else {
			this.asleep = false;
		}
	};
	
	
	
	@Override
	public String toString() {
		respons = "Character = " +this.getClass().getSimpleName() + ", Nom = "+name + ", Genre = ";
		if(sex) {
			respons += "male";
		}else {
			respons += "femelle";
		}
		respons += ", Weight = " + weight + ", Height = " + height + ", Age = " + age
				+ ", Hungry = ";
		if(hunger) {
			respons += "Starving";
		}else {
			respons += "full";
		}
		respons += ", Sleeping = ";
		if(asleep) {
			respons += "yes";
		}else {
			respons += "no";
		}
		respons += ", Status = ";
		
		if(health) {
			respons += "Healthy";
		}else {
			respons += "Sick";
		}
		
		return respons;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public boolean isHunger() {
		return hunger;
	}

	public void setHunger(boolean hunger) {
		this.hunger = hunger;
	}

	public boolean isAsleep() {
		return asleep;
	}

	public void setAsleep(boolean asleep) {
		this.asleep = asleep;
	}

	public boolean isHealth() {
		return health;
	}

	public void setHealth(boolean health) {
		this.health = health;
	}


	public boolean getSex() {
		return sex;
	}


	public void setSex(boolean sex) {
		this.sex = sex;
	}

}
