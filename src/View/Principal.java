package View;

import Controller.Ex1;
public class Principal {

	public Principal() {
		
	}

	public static void main(String[] args) {
		
		Ex1 ex = new Ex1();
		int numero = 5;
		int resultado = ex.soma(numero);
		System.out.println("A soma dos numeros é: " + resultado);
	}
}