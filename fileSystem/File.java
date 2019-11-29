package fileSystem;

public class File extends Entry{

	private String content;
	private int size;
	
	public File(String name, Dictionary parent, int size) {
		// TODO Auto-generated constructor stub
		super(name, parent);
		this.size = size;
	}

	@Override
	public int size() {
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
