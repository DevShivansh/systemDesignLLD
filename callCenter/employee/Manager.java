package callCenter.employee;

public class Manager extends Employee{

	public Manager(String name) {
		// TODO Auto-generated constructor stub
		super(name);
	}

	@Override
	public Rank degisnation() {
		// TODO Auto-generated method stub
		return Rank.MANAGER;
	}
}
