package refactorizacion;
/**
 * @author Jaime Rabasco Ronda
 */
/*Refactorizacion
Haz las refactorizaciones que necesites para que "Miau"
sea un campo de la clase Gato llamado "maulla"*/

public class Gato {

		public String maulla;

		protected Gato() {
				
	}

	void maullar() {
		maulla = "Miau";
		System.out.println(maulla);
	}

}
