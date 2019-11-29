package callCenter.employee;

public enum Rank {
	
	RESPONDANT(0), MANAGER(1), DIRECTOR(2);

	private int value;
	
	private Rank(int val) {
		this.value = val;
	}
	
	public int getValue() {
		return value;
	}
	
	public Rank getPriorityRank() {
		
		if(this.value == 1)
			return MANAGER;
		else
			return DIRECTOR;
	}
}
