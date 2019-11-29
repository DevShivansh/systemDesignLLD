package parkingLot;

import java.util.ArrayList;
import java.util.List;

import parkingLot.level.Level;
import parkingLot.spot.ParkingSpot;
import parkingLot.vehicle.Vehicle;

public class ParkingLot {
	
	static List<Level> levels = null;
	
	private static final int LEVEL = 4;
	
	static {
		levels = new ArrayList<Level>();
		for(int i =1; i<= LEVEL; i++) {
			levels.add(new Level(i));
		}
	}
	
	public static void parkVehicle(Vehicle v) {
		boolean isParked = false;
		for(Level level : levels) {
			
			ParkingSpot spot = level.parkVehicle(v);
			if(spot != null) {
				isParked = true;
				break;
			}
		}
		
		if(isParked)
			System.out.println("Vechile parked!");
		else
			System.out.println("Sorry, parking not available currently!");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
