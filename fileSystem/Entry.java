package fileSystem;

public abstract class Entry {
	
	private Dictionary parent;
	private String name;
	private long createdOn;
	private long lastModifiedOn;
	private long lastReadOn;
	
	public Entry(String name, Dictionary parent) {
		// TODO Auto-generated constructor stub
		this.name = name;
		this.parent = parent;
		createdOn = System.currentTimeMillis();
		lastModifiedOn = System.currentTimeMillis();
		lastReadOn = System.currentTimeMillis();
	}
	
	public abstract int size();

	public Dictionary getParent() {
		return parent;
	}

	public void setParent(Dictionary parent) {
		this.parent = parent;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public long getCreatedOn() {
		return createdOn;
	}

	public void setCreatedOn(long createdOn) {
		this.createdOn = createdOn;
	}

	public long getLastModifiedOn() {
		return lastModifiedOn;
	}

	public void setLastModifiedOn(long lastModifiedOn) {
		this.lastModifiedOn = lastModifiedOn;
	}

	public long getLastReadOn() {
		return lastReadOn;
	}

	public void setLastReadOn(long lastReadOn) {
		this.lastReadOn = lastReadOn;
	}
	
	

}
