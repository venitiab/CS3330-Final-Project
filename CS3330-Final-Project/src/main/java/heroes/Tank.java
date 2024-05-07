package heroes;

public class Tank extends Hero {
    public Tank(String name, String weapon, String ability1, String ability2, String ultimate) {
        super("Tank", name, weapon, ability1, ability2, ultimate);
    }

    @Override
    public Hero pickCounter() {
    	if (getName().equalsIgnoreCase("Reinhardt")) {
            
            for (Tank tank : heroList) {
                if (tank.getName().equalsIgnoreCase("Ramattra")) {
                    
                    System.out.println(tank);
                    return tank; // 
                }
            }
        }
        return null;
    }
    //public String toString() {
        //return "Tank [Name = " + name + ", Primary/Secondary Weapon = " + weapon + ", Ability1 = " + ability1 + ", Ability2 = " + ability2 + ", Ultimate Ability = "
                //+ ultimate + "]";
    //}

}