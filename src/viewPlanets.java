//Assignment 3
public class viewPlanets {

	//Constructor
	public viewPlanets() {
		
	}
	
	//Entry point of the program
	public static void main(String[] args) {
		GiantPlanet GP = new GiantPlanet("PlanetOne", 2000, 2000, "ice");
		System.out.println(GP.toString());
		
		TerrestrialPlanet TP = new TerrestrialPlanet("PlanetTwo", 200.5, 400.8);
		System.out.println(TP.toString());
	}

}
