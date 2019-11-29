package fileSystem;

import java.util.ArrayList;
import java.util.List;

public class Dictionary extends Entry{

	private List<Entry> content;
	
	public Dictionary(String name, Dictionary parent) {
		// TODO Auto-generated constructor stub
		super(name, parent);
		content = new ArrayList<Entry>();
	}

	@Override
	public int size() {
		// TODO Auto-generated method stub
		int size = 0;
		for(Entry e : content) {
			size += e.size();
		}
		return size;
	}
	
	public int numberOfFiles() {
		int count = 0;
		
		for(Entry e : content) {
			
			if( e instanceof Dictionary) {
				count++;
				Dictionary d = (Dictionary) e;
				count += d.numberOfFiles();
			}else {
				count++;
			}
			
		}
		return count;
	}
	
	public void addEntry(Entry e) {
		content.add(e);
	}
	
	public boolean removeEntry(Entry e) {
		return content.remove(e);
	}
	
	public List<Entry> getContent(){
		return content;
	}
}
