package Controller;

public class Ex1 {

	public Ex1() {
		super();
	}

		public int soma(int numero) {
			// se o numero for = 1, retorna 1.
			if(numero < 1) return 0;
			//sen�o, retorna o proprio numero + soma do numero (- 1);
			// at� a condi��o de parada.
			else return numero + soma(numero - 1);
		}

	}