/*Assignment Three* 
 */

/**
 * @author Matt
 * @version 1
 * @date 02/20/2015
 */

//Planet super class
public class GiantPlanet extends Planet {

	private String _type;
	private int moonCount;
	private int ringCount;
	
	//Constructor
	public GiantPlanet(String name, double diameter, double mass, String type) {
		super(name, diameter, mass);
		_type = type;
	}
	
	//Check to see if the planet has moons
	boolean HasMoons(){
		if (moonCount > 2)
			return true;
		else
			return false;
	}
	
	//Check to see if the planet has rings
	boolean HasRings(){
		if (ringCount > 2)
			return true;
		else
			return false;
	}
}
