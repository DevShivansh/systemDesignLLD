package parkingLot.vehicle;

public abstract class Vehicle {

	private String registrationNumber;
	private Size size;
	
	public Vehicle(String registrationNumber, Size size) {
		// TODO Auto-generated constructor stub
		this.registrationNumber = registrationNumber;
		this.size = size;
	}

	public String getRegistrationNumber() {
		return registrationNumber;
	}

	public void setRegistrationNumber(String registrationNumber) {
		this.registrationNumber = registrationNumber;
	}

	public Size getSize() {
		return size;
	}

	public void setSize(Size size) {
		this.size = size;
	}
	
	
}
