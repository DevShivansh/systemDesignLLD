package callCenter.employee;

public class Respondant extends Employee{

	public Respondant(String name) {
		// TODO Auto-generated constructor stub
		super(name);
	}

	@Override
	public Rank degisnation() {
		// TODO Auto-generated method stub
		return Rank.RESPONDANT;
	}
}
