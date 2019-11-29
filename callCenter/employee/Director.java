package callCenter.employee;

public class Director extends Employee{

	public Director(String name) {
		// TODO Auto-generated constructor stub
		super(name);
	}

	@Override
	public Rank degisnation() {
		// TODO Auto-generated method stub
		return Rank.DIRECTOR;
	}
	
}
