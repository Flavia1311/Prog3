package ProgramacionIII.tp1;

import java.util.Iterator;

public class MySimpleLinkedList implements Iterable <Integer>{
	
	private Node first;
	private int size;
	private Node last;
	
	public MySimpleLinkedList() {
		this.first = null;
		this.size = 0;
		this.last=null;
	}
	
	public void insertFront(Integer info) {
		Node tmp = new Node(info,null);
		tmp.setNext(this.first);
		this.first = tmp;
		this.size ++;
	}
	
	public void insertLast (Integer info) {
		Node cursor= this.first;
		Node nuevo = new Node (info, null);

		if(this.first == null)
			this.first = nuevo;
		
			
		else
		while (cursor.getNext() != null) {
			cursor= cursor.getNext();
		}
		cursor.setNext(nuevo);
		
	}
	
	public void insertLast2 (Integer info) {
		Node nuevo= new Node  (info, null);
				if(this.last==null) {
					this.last = nuevo;
					this.first = nuevo;
				}
				else {
					this.last.setNext(nuevo);				}
	}
	public Integer extractFront() {	
		if (this.first != null) {
		Node extract = this.first;
		this.first = this.first.getNext();
		if (this.first == null){
			this.last = null;
		}
		this.size --;
		return extract.getInfo();
		}
		return null;
	}
	public boolean isEmpty() {
		if (size == 0)
			return true;
		else
		return false;
	}
	
	public Integer get(int index) {
		int cont = 0;
		if (index >= 0 && index < this.size()) {
		
		Node cursor= this.first;
		while (cont < index) {
			cursor = cursor.getNext();
			cont ++;
		}
		return cursor.getInfo();
		}
		return null;
	}
	
	public int size() {
		return this.size;
	}
	
	@Override
	public String toString() {
		// TODO
		return "";
	}

	@Override
	public Iterator<Integer> iterator() {
	return new MyIterator(this.first);
	}
	

}
