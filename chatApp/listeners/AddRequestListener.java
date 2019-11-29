package chatApp.listeners;

import java.util.List;
import java.util.stream.Collectors;

import chatApp.AddRequest;
import chatApp.User;

public class AddRequestListener implements Runnable {

private List<User> users;
	
	public AddRequestListener(List<User> users) {
		// TODO Auto-generated constructor stub
		this.users = users;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		while (true) {

			List<AddRequest> requests = users.stream().filter(user -> user.hasAddRequest())
					.map(user -> user.pollAddRequest()).collect(Collectors.toList());
			requests.forEach(req -> req.executeRequest());
			
			
		}
		
	}
}
