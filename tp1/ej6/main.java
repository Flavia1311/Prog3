package ej6;

public class main {
	public static void main(String[] args) {
		MySimpleLinkedList lista1 = new MySimpleLinkedList();
		MySimpleLinkedList lista2 = new MySimpleLinkedList();

		MySimpleLinkedList resultado = new MySimpleLinkedList();

		lista1.insertFront(1);
		lista1.insertFront(3);
		lista1.insertFront(5);
		lista1.insertFront(20);
		lista1.insertFront(56);
		lista1.insertFront(99);
		lista1.insertFront(94);

		lista2.insertFront(1);
		lista2.insertFront(8);
		lista2.insertFront(5);
		lista2.insertFront(94);
		lista2.insertFront(20);
		lista2.insertFront(56);

		// lista2.printList();
		// lista1.printList();

		resultado = interseccion(lista1, lista2);
		resultado.printList();
		ordenarBurbuja(resultado);
		resultado.printList();
		
		resultado = interseccionOrdenado(lista1,lista2);
		resultado.printList();

	}

	public static MySimpleLinkedList interseccion(MySimpleLinkedList lista1, MySimpleLinkedList lista2) {

		MySimpleLinkedList listaResultante = new MySimpleLinkedList();

		IteradorLista iteradorLista1 = lista1.iterator();
		
		if ((lista1.size() != 0) && (lista2.size() != 0)) {
			
			while (iteradorLista1.hasNext()) {
			
				IteradorLista iteradorLista2 = lista2.iterator();
				
				boolean noEncontrado = true;
				
				while (iteradorLista2.hasNext() && noEncontrado) {

					if (iteradorLista1.get().equals(iteradorLista2.get())) {
						listaResultante.insertFront(iteradorLista1.get());
						noEncontrado = false;
					} else
						iteradorLista2.next();
				}
				iteradorLista1.next();

			}
		}
		return listaResultante;
	}

	public static void ordenarBurbuja(MySimpleLinkedList lista) {
		for (int i = 0; i < lista.size(); i++) {

			IteradorLista iteradorLista = lista.iterator();
			for (int j = 0; j < lista.size() - 1; j++) {
				if ((iteradorLista.get() > iteradorLista.nextInfo())) {
					Integer aux = iteradorLista.get();
					iteradorLista.setInfo(iteradorLista.nextInfo());
					iteradorLista.next();
					iteradorLista.setInfo(aux);
				}
			}
		}
	}

	public static MySimpleLinkedList interseccionOrdenado(MySimpleLinkedList lista1, MySimpleLinkedList lista2) {
		MySimpleLinkedList listaResultante = new MySimpleLinkedList();
		IteradorLista iteradorLista1 = lista1.iterator();
		if ((lista1.size() != 0) && (lista2.size() != 0)) {
			while (iteradorLista1.hasNext()) {
				IteradorLista iteradorLista2 = lista2.iterator();
				boolean noEncontrado = true;
				while (iteradorLista2.hasNext() && noEncontrado) {
					if (iteradorLista1.get().equals(iteradorLista2.get())) {
						listaResultante.insertFront(iteradorLista1.get());
						noEncontrado = false;
					} else
						iteradorLista2.next();
				}
				iteradorLista1.next();
			}

		}
		return listaResultante;
	}
}