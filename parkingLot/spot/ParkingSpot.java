package parkingLot.spot;

import parkingLot.vehicle.Size;
import parkingLot.vehicle.Vehicle;

public class ParkingSpot {

	private Size size;
	private int id;
	private Vehicle vehicle;
	
	public ParkingSpot(int id, Size size, Vehicle vehicle) {
		// TODO Auto-generated constructor stub
		this.size = size;
		this.id = id;
		this.vehicle = vehicle;
	}
	
	public boolean isFree() {
		if(vehicle == null)
			return true;
		return false;
	}
	
	public void clearSpot() {
		vehicle = null;
	}

	public Size getSize() {
		return size;
	}

	public void setSize(Size size) {
		this.size = size;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Vehicle getVehicle() {
		return vehicle;
	}

	public void setVehicle(Vehicle vehicle) {
		this.vehicle = vehicle;
	}
	
	
}
