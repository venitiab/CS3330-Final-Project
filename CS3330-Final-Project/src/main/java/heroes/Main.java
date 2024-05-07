package heroes;

public class Main {

	public static void main(String[] args) {
		// Instantiate heroManager
		HeroManager heroManager = new HeroManager();	
		
		// Read data from csv file and initialize objects.
		heroManager.initializeStock();
				
		// Display all hero information.
		System.out.println("All Hero Information:");
		System.out.println("------------------------");
		heroManager.displayAllHeroInformation();
		System.out.println();

	}

}
