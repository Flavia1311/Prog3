package ProgramacionIII.tp1;

import java.util.Iterator;

public class MyIterator implements Iterator<Integer>{
	private Node cursor;
	
	public MyIterator(Node first) {
		cursor = first;
		// TODO Ap�ndice de constructor generado autom�ticamente
	}

	@Override
	public boolean hasNext() {
		return cursor != null;
	}

	@Override
	public Integer next() {
		int info = cursor.getInfo();
		cursor = cursor.getNext();
		return info;
	}

}
