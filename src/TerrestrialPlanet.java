/*Assignment Three* 
 */

/**
 * @author Matt
 * @version 1
 * @date 02/20/2015
 */

public class TerrestrialPlanet extends Planet {

	private int moonCount;
	private boolean isHabitable;
	
	
	public TerrestrialPlanet(String name, double diameter, double mass) {
		super(name, diameter, mass);
		// TODO Auto-generated constructor stub
	}
	
	//Check to see if the planet has moons
	boolean HasMoons(){
		if (moonCount > 2)
			return true;
		else
			return false;
	}
	
	//Check to see if the planet has moons
	boolean isHabitable(){
		if (isHabitable == true)
			return true;
		else
			return false;
	}
	

}
