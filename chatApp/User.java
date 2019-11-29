package chatApp;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.stream.Collectors;

public class User {

	private int userId;
	private String userName;
	private String password;
	private boolean isOnline;
	
	private List<User> contacts;
	
	private Queue<Message> queue;
	
	private Queue<AddRequest> requestedQueue;
	
	private Queue<AddRequest> requestQueue;
	
	private Map<User, Conversation> conversations;
	
	public User(int userId, String userName, String password) {
		// TODO Auto-generated constructor stub
		this.userId = userId;
		this.userName = userName;
		this.password = password;
		
		contacts = new ArrayList<User>();
		queue = new LinkedList<Message>();
		requestQueue = new LinkedList<AddRequest>();
		requestedQueue = new LinkedList<AddRequest>();
	}
	
	public void addContact(User contact, int id) {
		contacts.add(contact);
		contact.addContact(this, id);
		
		Conversation conversation = new Conversation(id);
		conversations.put(contact, conversation);
		contact.conversations.put(this, conversation);
		
	}
	
	public boolean removeContact(User contact) {
		contacts.remove(contact);
		contact.removeContact(this);
		return true;
	}
	
	public boolean isOnline() {
		return isOnline;
	}
	
	public boolean hasMessageQueued() {
		
		return !queue.isEmpty();
	}
	
	public Message pollMessage() {
		return queue.poll();
	}
	
	public boolean hasAddRequest() {
		
		return !requestedQueue.isEmpty();
	}
	
	public AddRequest pollAddRequest() {
		return requestedQueue.poll();
	}
	
	public void messageReceived(Message msg) {
		conversations.get(msg.getFromUser()).addMessage(msg);;
	}
	
	public void sendMessage(User toUser, String content) {
		queue.add(new Message(this, toUser, content));
	}

	public void addNewRequest(AddRequest addRequest) {
		// TODO Auto-generated method stub
		requestQueue.add(addRequest);
		
	}
	
	public void processFriendRequests() {
		
		while(!requestQueue.isEmpty()) {
			
			AddRequest request = requestQueue.poll();
			RequestStatus status = getUserRequestStatus();
			
			switch(status) {
				case ACCEPTED :
					addContact(request.getRequestedBy(), request.getId());
					request.modifyStatus(RequestStatus.ACCEPTED);
					break;
				case REJECTED:
					request.modifyStatus(RequestStatus.REJECTED);
						
			}
			
		}
		
	}

	private RequestStatus getUserRequestStatus() {
		// TODO Auto-generated method stub
		return null;
	}

	public void notifyRequestStatus(User requestedUser ,RequestStatus status) {
		// TODO Auto-generated method stub
		System.out.println("Your request status for " + requestedUser 
				+ "has changed to " + status.toString());
		
	}
	
	public List<User> getOnlineFriends(){
		return contacts.stream().filter( contact -> contact.isOnline).collect(Collectors.toList());
	}
	
}
