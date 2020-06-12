package refactorizacion;
/**
 * @author Jaime Rabasco Ronda
 */
/*Refactorizacion
Haz las refactorizaciones que necesites para que "Miau"
sea un campo de la clase Gato llamado "maulla"*/

/**
 * La clase Gato es p�blica, "Miau" es un campo de la clase Gato llamada "maulla".
 * @author Andrea Sol�s
 *
 */
public class Gato {

		public String maulla;

		protected Gato() {
				
	}

	void maullar() {
		maulla = "Miau";
		System.out.println(maulla);
	}

}
