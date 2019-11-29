package callCenter;

import callCenter.employee.Employee;
import callCenter.employee.Rank;

public class Call {

	private Rank priority;
	
	private Caller caller;
	
	private Employee receiver;
	
	public Call(Caller caller) {
		// TODO Auto-generated constructor stub
		this.caller = caller;
		this.priority = caller.rank;
	}
	
	
	public void engageCall(Employee e) {
		this.receiver = e;
	}
	
	public void disconnect() {
		this.receiver = null;
	}
	
	
	public void reply(String reply) {
		//
	}
	
	
	public Rank getPriority() {
		return priority;
	}
	
	public void increasePriority() {
		
		if(priority.getValue() != 2) {
			priority = priority.getPriorityRank();
		}
		
	}
}
