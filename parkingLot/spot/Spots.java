package parkingLot.spot;

import java.util.ArrayList;

import parkingLot.vehicle.Size;
import parkingLot.vehicle.Vehicle;

public class Spots extends ArrayList<ParkingSpot>{
	
	private Size size;
	private int filledSpots;
	private final int capacity;
	
	public Spots(int capacity, Size size) {
		// TODO Auto-generated constructor stub
		this.capacity = capacity;
		this.filledSpots = 0;
		initSpots();
	}

	private void initSpots() {
		// TODO Auto-generated method stub
		for(int i = 1; i <= capacity; i++) {
			add(new ParkingSpot(i, size, null));
		}
		
	}
	
	public boolean isSpotAvailable() {
		return filledSpots <= capacity ? true : false;
	}
	
	
	public ParkingSpot parkVehicle(Vehicle v) {
		
		if(!isSpotAvailable())
			return null;
		
		ParkingSpot freeSpot = getFreeSpot();
		freeSpot.setVehicle(v);
		return freeSpot;
		
	}

	private ParkingSpot getFreeSpot() {
		// TODO Auto-generated method stub
		return this.stream().filter( spot -> spot.isFree()).findFirst().get();
	}

	public void freeSpot() {
		// TODO Auto-generated method stub
		this.filledSpots--;
		
	}
	
	

}
