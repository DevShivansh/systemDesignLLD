package parkingLot.level;

import java.util.HashMap;
import java.util.Map;

import parkingLot.spot.ParkingSpot;
import parkingLot.spot.Spots;
import parkingLot.vehicle.Size;
import parkingLot.vehicle.Vehicle;

public class Level {

	private int level;
	
	private Spots smallSpots;
	private Spots mediumSpots;
	private Spots largeSpots;
	private Spots xlSpots;
	
	private Map<String, ParkingSpot> parkingMap;
	
	
	private final int CAPACITY = 10;
	
	public Level(int level) {
		this.setLevel(level);
		smallSpots = new Spots(CAPACITY, Size.SMALL);
		mediumSpots = new Spots(CAPACITY, Size.MEDIUM);
		largeSpots = new Spots(CAPACITY, Size.LARGE);
		xlSpots = new Spots(CAPACITY, Size.XL);
		parkingMap = new HashMap<String, ParkingSpot>();
	}
	
		
	
	
	public ParkingSpot parkVehicle(Vehicle v) {
		
		Size size = v.getSize();
		ParkingSpot spot = null;
		switch (size) {
		case SMALL:
			if (smallSpots.isSpotAvailable()) {
				spot = smallSpots.parkVehicle(v);
				break;
			}
				
		case MEDIUM:
			if (mediumSpots.isSpotAvailable()) {
				spot = mediumSpots.parkVehicle(v);
				break;
			}
		case LARGE:
			if (largeSpots.isSpotAvailable()) {
				spot = largeSpots.parkVehicle(v);
				break;
			}
		case XL:
			if (xlSpots.isSpotAvailable()) {
				spot = xlSpots.parkVehicle(v);
				break;
			}
		
		}
		parkingMap.put(v.getRegistrationNumber(), spot);
		return spot;
	}
	
	public void removeVehicle(Vehicle v) {
		
		ParkingSpot spot = parkingMap.get(v.getRegistrationNumber());
		parkingMap.remove(v.getRegistrationNumber());
		freeParkingSpot(spot);
		
	}

	private void freeParkingSpot(ParkingSpot spot) {
		
		spot.clearSpot();
		Size occupied = spot.getSize();
		

		switch (occupied) {
		case SMALL:
			smallSpots.freeSpot();
			break;
		case MEDIUM:
			mediumSpots.freeSpot();
			break;
		case LARGE:
			largeSpots.freeSpot();
			break;
		case XL:
			xlSpots.freeSpot();
		}

	}

	public int getLevel() {
		return level;
	}

	public void setLevel(int level) {
		this.level = level;
	}

}
