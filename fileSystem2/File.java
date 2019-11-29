package fileSystem2;

public class File extends FileNode {
	
	private int size;
	private String content;
	
	public File(String name, FileNode parent, int size) {
		super(name, parent);
		this.size = size;
		// TODO Auto-generated constructor stub
	}

	@Override
	public void setIsDirectory() {
		// TODO Auto-generated method stub
		isDirectory = false;
		
	}

	@Override
	public int getSize() {
		// TODO Auto-generated method stub
		return size;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

}
