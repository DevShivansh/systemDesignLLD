package chatApp.listeners;

import java.util.List;
import java.util.stream.Collectors;

import chatApp.Message;
import chatApp.User;

public class MessageListener implements Runnable{
	
	private List<User> users;
	
	public MessageListener(List<User> users) {
		// TODO Auto-generated constructor stub
		this.users = users;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		while (true) {

			List<Message> messages = users.stream().filter(user -> user.hasMessageQueued())
					.map(user -> user.pollMessage()).collect(Collectors.toList());
			messages.forEach( msg -> msg.executeMessage());
			
			
		}
		
	}

}
