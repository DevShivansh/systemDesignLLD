package chatApp;

import java.util.ArrayList;
import java.util.List;

public class Conversation {

	private int id;
	private List<Message> messages;
	
	public Conversation(int id) {
		// TODO Auto-generated constructor stub
		this.id = id;
		messages = new ArrayList<Message>();
	}
	
	public void addMessage(Message m) {
		messages.add(m);
	}
	
	public List<Message> getMessages(){
		return messages;
	}
}
