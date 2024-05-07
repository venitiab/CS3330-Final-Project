package heroes;

public abstract class Hero {
	protected String type;
	protected String name;
	protected String weapon;
	protected String ability1;
	protected String ability2;
	protected String ultimate;
	
	//constructor
    public Hero(String type, String name, String weapon, String ability1, String ability2, String ultimate) {
        this.type = type;
        this.name = name;
        this.weapon = weapon;
        this.ability1 = ability1;
        this.ability2 = ability2;
        this.ultimate = ultimate;
    }
    
    public abstract Hero pickCounter();
    
    //display hero information
    public void displayInfo() {
        System.out.println("Type: " + type);
        System.out.println("Name: " + name);
        System.out.println("Primary/Secondary Weapon: " + weapon);
        System.out.println("Ability 1: " + ability1);
        System.out.println("Ability 2: " + ability2);
        System.out.println("Ultimate: " + ultimate);
    }
}