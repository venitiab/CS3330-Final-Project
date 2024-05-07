package heroes;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.io.FileWriter;
import java.util.Random;


public class HeroManager {
	private static HeroManager instance = null; //instance
	private final static String heroFilePath="src/main/resources/OverwatchHeroes.csv";
	
	private List<Hero> heroList = new ArrayList<>();
	
	public boolean initializeStock() {
		try {
			List < List <String> > data = new ArrayList<>();
			BufferedReader br = new BufferedReader(new FileReader(heroFilePath));
			br.readLine();
			String line = br.readLine();
			while (line != null) {
				List<String> lineData = Arrays.asList(line.split(","));
				data.add(lineData);
				line = br.readLine();
			}
			for(List<String> list : data) {
				String type = list.get(0);
				String name = list.get(1);
				String weapon = list.get(2);
				String ability1 = list.get(3);
				String ability2 = list.get(4);
				String ultimate = list.get(5);
				
				Hero hero = null;
				switch(type)
				{
				case "Tank":
				{
					Tank tank = new Tank(name, weapon, ability1, ability2, ultimate);
					heroList.add(tank);
					break;
				}
				case "Damage":
				{
					Damage damage = new Damage(name, weapon, ability1, ability2, ultimate);
					heroList.add(damage);
					break;
				}
				case "Support":
				{
					Support support = new Support(name, weapon, ability1, ability2, ultimate);
					heroList.add(support);
					break;
				}
				default:
				{
					System.out.println("Invalid Hero Type");
					break;
				}
			}
		}
		br.close();
		} catch(IOException e) {
			e.printStackTrace();
			return false;
		}
		return true;
	}
	
	public void displayAllHeroInformation() {
		for(Hero hero : heroList) {
				System.out.println(hero.toString());
		}
	}
}
