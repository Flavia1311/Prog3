package ej3;

public class Pila {
	private MySimpleLinkedList listaPila = new MySimpleLinkedList();

	public void push(Integer info) {
		listaPila.insertFront(info);
	}

	public void pop() {
		this.listaPila.extractFront();
	}

	public int top() {
		return listaPila.get(0);
	}

	public void reverse() {
		MySimpleLinkedList reverse = new MySimpleLinkedList();
		Integer cursor = listaPila.size();
		while (reverse.size() < cursor)
			reverse.insertFront(listaPila.extractFront());
		listaPila = reverse;

	}

	public void printPila() {
		listaPila.printList();
	}
}
