package heroes;

public class Support extends Hero {
	
	public Support(String name, String weapon, String ability1, String ability2, String ultimate) {
		
		super();
		this.name = name;
		this.weapon = weapon;
		this.ability1 = ability1;
		this.ability2 = ability2;
		this.ultimate = ultimate;
		
	}
	//copy constructor
	public Support(Support support) { 
		super();
		this.name = support.name;
		this.weapon = support.weapon;
		this.ability1 = support.ability1;
		this.ability2 = support.ability2;
		this.ultimate = support.ultimate;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public String getWeapon() {
		return weapon;
	}

	public void setWeapon(String weapon) {
		this.weapon = weapon;
	}
	
	public String getAbility1() {
		return ability1;
	}

	public void setAbility1(String ability1) {
		this.ability1 = ability1;
	}
	
	public String getAbility2() {
		return ability2;
	}

	public void setAbility2(String ability2) {
		this.ability2 = ability2;
	}
	
	public String getUltimate() {
		return ultimate;
	}

	public void setUltimate(String ultimate) {
		this.ultimate = ultimate;
	}
	
	@Override
	public String toString() {
		return "Support [Name = " + name + ", Primary/Secondary Weapon = " + weapon + ", Ability1 = " + ability1 + ", Ability2 = " + ability2 + ", Ultimate Ability = "
				+ ultimate + "]";
	}

}