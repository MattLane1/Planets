/*Assignment Three* 
 */

/**
 * @author Matt
 * @version 1
 * @date 02/20/2015
 */


public abstract class Planet {
	//CONSTRUCTOR OF PLANET CLASS
	
	private double _diameter;
	private double _mass;
	private double _moonCount;
	private String _name;
	private double _orbitalPeriod;
	private int    _ringCount;
	private double _rotationalPeriod;
	
	public  double Diameter;
	public  double Mass;
	public  double moonCount;
	public  String Name;
	public  double orbitalPeriod;
	public  int    ringCount;
	public  double rotationalPeriod;
	
	public Planet(String name, double diameter, double mass){
		_name = name;
		_diameter = diameter;
		_mass = mass;
	}
	
 public String toString(){
		
	 return "Name =" + _name + "Diameter = " + _diameter + "Mass = " + _mass + "Moon Count = "+ _moonCount + "Orbital Period ="+ _orbitalPeriod +
			 "Ring Count = "+ _ringCount + "Rotational Period = " + _rotationalPeriod;
	}
}
