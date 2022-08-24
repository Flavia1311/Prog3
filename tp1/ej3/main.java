package ej3;

public class main {
	public static void main(String[] args) {
		Pila listaPila = new Pila();

		listaPila.push(22);
		listaPila.push(30);
		listaPila.push(40);
	

	

	System.out.println(listaPila.top());
	listaPila.printPila();
}
}
