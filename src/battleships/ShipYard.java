package battleships;

import java.util.ArrayList;

public class ShipYard {
	public static ArrayList<Ship> buildFleet(){
		ArrayList<Ship> fleet = new ArrayList<>();
		fleet.add(new Ship(5));
		fleet.add(new Ship(4));
		fleet.add(new Ship(3));
		fleet.add(new Ship(3));
		fleet.add(new Ship(2));
		
		return fleet;
	}
}
