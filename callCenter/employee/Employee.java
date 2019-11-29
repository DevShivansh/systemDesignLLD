package callCenter.employee;

import callCenter.Call;

public abstract class Employee {

	private String name;
	private Call currentCall;
	
	public Employee(String name) {
		// TODO Auto-generated constructor stub
		this.name = name;
	}
	
	public abstract Rank degisnation();
	
	public boolean engageCall(Call incommingCall) {
		
		if(currentCall != null || incommingCall.getPriority().getValue() > degisnation().getValue())
			return false;
		this.currentCall = incommingCall;
		return true;
	}
	
	public void releaseCall() {
		
		this.currentCall = null;
		
	}
	
	public void escalateCall(Call incommingCall) {
		incommingCall.increasePriority();
	}
	
}
