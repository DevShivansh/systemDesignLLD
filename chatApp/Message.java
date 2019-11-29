package chatApp;


public class Message {
	
	private User fromUser;
	private User toUser;
	private String content;
	private long time;
	
	public Message(User fromUser, User toUser, String content) {
		super();
		this.fromUser = fromUser;
		this.toUser = toUser;
		this.content = content;
		time = System.currentTimeMillis();
	}

	public User getFromUser() {
		return fromUser;
	}

	public void setFromUser(User fromUser) {
		this.fromUser = fromUser;
	}

	public User getToUser() {
		return toUser;
	}

	public void setToUser(User toUser) {
		this.toUser = toUser;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public long getTime() {
		return time;
	}

	public void setTime(long time) {
		this.time = time;
	}
	
	public void executeMessage() {
		
		toUser.messageReceived(this);
		
	}
	
	

}
