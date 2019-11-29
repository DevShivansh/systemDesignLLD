package callCenter;

import java.util.ArrayList;
import java.util.List;

import callCenter.employee.Employee;

public class CallHandler {
	
	private static CallHandler handler = new CallHandler();
	
	private CallHandler() {
		// TODO Auto-generated constructor stub
	}
	
	private List<List<Employee>> employees = new ArrayList<List<Employee>>();
	
	private List<List<Call>> callQueues = new ArrayList<List<Call>>();
	
	public static CallHandler getInstance() {
		return handler;
	}
	
	public Employee getHandlerForCall() {
		return null;
	}
	
	public void dispatchCall(Caller call) {
		dispatchCall(new Call(call));
	}

	private void dispatchCall(Call call) {
		// TODO Auto-generated method stub
		
		Employee e = getHandlerForCall();
		
		if(e != null) {
			call.engageCall(e);
			e.engageCall(call);
		}else {
			call.increasePriority();
			callQueues.get(call.getPriority().getValue()).add(call);
		}
		
		
	}
	
	private boolean assignCall(Employee e) {
		return true;
	}

}
