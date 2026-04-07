
public class Parte11_Matrici {

	public static void main(String[] args) {
		introduzione();
	}

	// Questa è una procedura che stampa una matrice.
	// Rispetto alle procedura già viste, ha un parametro m, che
	// deve essere passato quando la richiamiamo.
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

	static void introduzione() {
		// Le matrici in Java sono semplicemente "vettori di vettori".
		// In altre parole, sono vettori i cui elementi sono vettori di
		// numeri. Possiamo pensare questi vettori di numeri come le righe
		// della matrice, che raggruppiamo quando facciamo un vettore di
		// vettori.

		// In Java c'è una sintassi agevolata per le matrici:
		int[][] m;
		m = new int[3][4]; // 3 righe, 4 colonne, tutti gli elementi a zero.
		
		// La lunghezza di m, cioè m.length, è il numero di vettori
		// contenuti dentro m cioè il numero di righe nella matrice.
		//
		// Le righe sono quindi m[0], ..., m[m.length-1].
		//
		// La lunghezza di una riga, per esempio m[0].length, è il numero
		// di elementi in quella riga, cioè il numero di colonne della
		// matrice.
		//
		// Gli elementi della matrice sono quindi m[i][j] dove i è l'indice
		// di riga e j quello di colonna.
		
		// Inizializziamo la matrice con dei dati opportuni
		int i,j;
		for (i = 0 ; i < m.length ; i++) {
			for (j = 0 ; j < m[i].length ; j++) {
				// m[i][j] è l'elemento in riga i e colonna j
				m[i][j] = 10*i+j;
			}
		}
		
		// Stampiamo la matrice appena creata:
		stampaMatrice(m);
		
		// Teoricamente, Java consente a ogni riga della matrice di avere
		// una lunghezza diversa dalle altre righe. La matrice in questo
		// caso non è più rettangolare ma frastagliata ("jagged"). Noi non
		// useremo questa possibilità, e useremo solo matrici rettangolari
		// come di consueto.

		// Possiamo inserire una matrice anche così:
		int[][] m2 = new int[][] {
			{ 1,  2,  3,  4 },
			{ 5,  6,  7,  8 },
			{ 9, 10, 11, 12 },
		};
		stampaMatrice(m2);
	}

	static void esercizioTrasposta() {
		// Data una matrice, si calcoli la sua trasposta.

		int[][] m = new int[][] {
			{ 1,  2,  3,  4 },
			{ 5,  6,  7,  8 },
			{ 9, 10, 11, 12 },
		};
		
		int[][] risultato = new int[][] {}; // Bozza da correggere
		
		// TODO
		
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
		
		// TODO
		
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
		
		int[][] risultato = new int[][] {}; // Bozza da correggere
		
		// TODO
		
		System.out.println("Moltiplicando la matrice");
		stampaMatrice(m1);
		System.out.println("con la matrice");
		stampaMatrice(m2);
		System.out.println("otteniamo la matrice");
		stampaMatrice(risultato);
	}
}
