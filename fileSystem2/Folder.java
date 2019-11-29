package fileSystem2;

import java.util.ArrayList;
import java.util.List;

public class Folder extends FileNode{
	
	private List<FileNode> files;
	
	
	public Folder(String name, FileNode parent) {
		super(name, parent);
		files = new ArrayList<FileNode>();
		
	}

	@Override
	public void setIsDirectory() {
		// TODO Auto-generated method stub
		this.isDirectory = true;
		
	}

	@Override
	public int getSize() {
		// TODO Auto-generated method stub
		int size = 0;
		
		for(FileNode file : files)
			size += file.getSize();
		return size;
	}
	
	public int numberOfFiles() {
		int count = 0;
		
		for(FileNode file : files) {
			
			if( file instanceof Folder) {
				Folder f = (Folder)file;
				count += f.numberOfFiles();
			}
			count++;
			
		}
		return count;
		
	}
	
	public void addFile(FileNode f) {
		files.add(f);
	}
	
	public boolean removeFile(FileNode f) {
		if(f.isDirectory && f.getSize() != 0)
			return false;
		return files.remove(f);
	}
	

}
