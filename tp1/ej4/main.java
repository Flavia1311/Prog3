package ej4;

public class main {
	public static void main(String[] args) {
		MySimpleLinkedList lista = new MySimpleLinkedList();

		lista.insertFront(1);
		lista.insertFront(3);
		lista.insertFront(5);
		lista.insertFront(20);
		lista.insertFront(56);
		lista.insertFront(99);
		

	
		
		System.out.println(lista);
		System.out.println(lista.indexOf(5));
	}
	
}
