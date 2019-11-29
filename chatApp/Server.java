package chatApp;

import java.util.ArrayList;
import java.util.List;

import chatApp.listeners.AddRequestListener;
import chatApp.listeners.MessageListener;

public class Server {
	
	private List<User> users;
	private MessageListener messageListener;
	private AddRequestListener addRequestListener;
	
	public Server() {
		// TODO Auto-generated constructor stub
		users = new ArrayList<User>();
		this.messageListener = new MessageListener(users);
		this.addRequestListener = new AddRequestListener(users);
	}
	
	
	public void addUser(User user) {
		users.add(user);
	}
	
	public void remove(User user) {
		users.remove(user);
	}
	
	
	
	public void startServer() {
		
		messageListener.run();
		addRequestListener.run();
	}


		

}
