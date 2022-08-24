package ej6;

import java.util.Iterator;

public class IteradorLista implements Iterator<Integer> {
	private Node cursor;
	
	public IteradorLista (Node first) {
		cursor=first;
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

	public void setInfo(Integer info) {
		cursor.setInfo(info);
	}

	public Integer get() {
		return (Integer) cursor.getInfo();
	}

	public Integer nextInfo() {
		Node aux = cursor;
		return aux.getNext().getInfo();
	}

}
