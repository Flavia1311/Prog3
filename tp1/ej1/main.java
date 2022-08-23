package ProgramacionIII.tp1;

import java.util.Iterator;

public class main {
 public static void main(String[] args) {
	MySimpleLinkedList lista = new MySimpleLinkedList();
	lista.insertFront (20);
	lista.insertFront (10);
	lista.insertLast (30);
	
	Iterator <Integer> it = lista.iterator();
	while (it.hasNext()) {
		System.out.println(it.next());
	}
}
}
