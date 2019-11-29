package chatApp;

public class AddRequest {

	private User requestedTo;
	private User requestedBy;
	private RequestStatus status;
	private int id;
	private static int counter = 1;
	
	public AddRequest(User requestedTo, User requestedBy) {
		super();
		this.requestedTo = requestedTo;
		this.requestedBy = requestedBy;
		status = RequestStatus.PENDING;
		id = counter++;
	}
	
	public void modifyStatus(RequestStatus status) {
		this.status = status;
		requestedBy.notifyRequestStatus(requestedTo, status);
	}
	
	public User getRequestedBy() {
		return requestedBy;
	}
	
	public User getRequestedTo() {
		return requestedTo;
	}
	
	public RequestStatus getStatus() {
		return status;
	}
	
	public void executeRequest() {
		requestedTo.addNewRequest(this);
	}
	
	public int getId() {
		return id;
	}
}
