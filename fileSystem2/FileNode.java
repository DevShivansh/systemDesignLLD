package fileSystem2;

public abstract class FileNode {

	private String name;
	protected boolean isDirectory;
	private FileNode parent;
	private long createdOn;
	private long lastModifiedOn;
	private long lastReadOn;
	
	public abstract void setIsDirectory();
	
	public abstract int getSize();
	
	public FileNode(String name, FileNode parent) {
		this.name = name;
		this.parent = parent;
		//init other params
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public boolean isDirectory() {
		return isDirectory;
	}

	public void setDirectory(boolean isDirectory) {
		this.isDirectory = isDirectory;
	}

	public FileNode getParent() {
		return parent;
	}

	public void setParent(FileNode parent) {
		this.parent = parent;
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
