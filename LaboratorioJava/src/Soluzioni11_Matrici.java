
public class Soluzioni11_Matrici {

	public static void main(String[] args) {
	}

	static void stampaMatrice(int[][] m) {
		int i,j;
		System.out.println("--------------------------");
		for (i = 0 ; i < m.length ; i++) {
			for (j = 0 ; j < m[i].length ; j++) {
				System.out.print(m[i][j] + "   ");
			}
			System.out.println();  // Vai a capo
		}
		System.out.println("--------------------------");
	}
	
	static void esercizioTrasposta() {
		// Data una matrice, si calcoli la sua trasposta.

		int[][] m = new int[][] {
			{ 1,  2,  3,  4 },
			{ 5,  6,  7,  8 },
			{ 9, 10, 11, 12 },
		};
		
		int[][] risultato = new int[m[0].length][m.length];
		
		int i, j;
		for (i = 0 ; i < risultato.length ; i++) {
			for (j = 0 ; j < risultato[i].length ; j++) {
				risultato[i][j] = m[j][i];
			}
		}
		
		System.out.println("La trasposta della matrice");
		stampaMatrice(m);
		System.out.println("è la matrice");
		stampaMatrice(risultato);
	}

	static void esercizioSommaMatrici() {
		// Date due matrici con uguali dimensioni, si calcoli la loro somma.

		int[][] m1 = new int[][] {
			{ 1,  2,  3,  4 },
			{ 5,  6,  7,  8 },
			{ 9, 10, 11, 12 },
		};
		int[][] m2 = new int[][] {
			{ 10,  20,  30,  40 },
			{ 50,  60,  70,  80 },
			{ 90, 100, 110, 120 },
		};
		
		int[][] risultato = new int[m1.length][m1[0].length];
		
		int i, j;
		for (i = 0 ; i < risultato.length ; i++) {
			for (j = 0 ; j < risultato[i].length ; j++) {
				risultato[i][j] = m1[i][j] + m2[i][j];
			}
		}
		
		
		System.out.println("Sommando la matrice");
		stampaMatrice(m1);
		System.out.println("con la matrice");
		stampaMatrice(m2);
		System.out.println("otteniamo la matrice");
		stampaMatrice(risultato);
	}
	
	static void esercizioProdottoMatrici() {
		// Date due matrici con dimensioni compatibili, si calcoli il loro
		// prodotto.

		int[][] m1 = new int[][] {
			{ 1,  2,  3,  4 },
			{ 5,  6,  7,  8 },
			{ 9, 10, 11, 12 },
		};
		int[][] m2 = new int[][] {
			{ 2, 0, 0 },
			{ 0, 2, 0 },
			{ 0, 0, 2 },
			{ 0, 0, 0 },
		};
		
		int[][] risultato = new int[m1.length][m2[0].length];
		
		int i, j;
		for (i = 0 ; i < risultato.length ; i++) {
			for (j = 0 ; j < risultato[i].length ; j++) {
				int k;
				int prodottoScalare = 0;
				for (k = 0 ; k < m1[0].length ; k++) {
					prodottoScalare = prodottoScalare + m1[i][k] * m2[k][j];
				}
				risultato[i][j] = prodottoScalare;
			}
		}
		
		System.out.println("Moltiplicando la matrice");
		stampaMatrice(m1);
		System.out.println("con la matrice");
		stampaMatrice(m2);
		System.out.println("otteniamo la matrice");
		stampaMatrice(risultato);
	}
}
