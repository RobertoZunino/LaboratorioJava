
public class Soluzioni09_Vettori {

	public static void main(String[] args) {
		esercizioOrdinato();
	}
		
	static void esercizioConto() {
		// Dato n>=0, generate un vettore con dentro i primi n naturali.
		
		int n = 10;
		
		int[] v = new int[n];
		int i;
		for (i = 0 ; i < n ; i++) {
			v[i] = i;
		}
	}

	static void esercizioQuadrati() {
		// Dato n>=0, generate un vettore con dentro i primi n quadrati.
		
		int n = 10;
		
		int[] v = new int[n];
		int i;
		for (i = 0 ; i < n ; i++) {
			v[i] = i*i;
		}
	}
	
	static void esercizioSomma() {
		// Dato un vettore di interi, calcolate la somma dei suoi elementi.
		
		int[] v = new int[] { 1, 6, 2, 5 };
		
		int i;
		int somma = 0;
		for (i = 0 ; i < v.length ; i++) {
			somma = somma + v[i];
		}

		System.out.println("La somma degli elementi del vettore è " + somma);
	}
	
	static void esercizioSommeParziali() {
		// Dato un vettore di interi v, calcolate in un altro vettore w
		// tutte le somme parziali di v. Cioè:
		//		w[0] = v[0]
		//		w[1] = v[0] + v[1] 
		//		w[2] = v[0] + v[1] + v[2]
		//		w[3] = v[0] + v[1] + v[2] + v[3]
		// e così via.
		
		int[] v = new int[] { 1,7,2,4,8,1,5,7,0 };

		System.out.println("La lunghezza di v è " + v.length);
		int i;
		for (i = 0 ; i < v.length ; i++) {
			System.out.println("v[" + i + "] = " + v[i]);
		}

		int[] w = new int[v.length];
		w[0] = v[0];
		for (i = 1 ; i < w.length ; i++) {
			w[i] = w[i-1] + v[i];
		}
		
		System.out.println("La lunghezza di w è " + w.length);
		for (i = 0 ; i < w.length ; i++) {
			System.out.println("w[" + i + "] = " + w[i]);
		}
	}

	static void esercizioSommaVettori() {
		// Dati due vettori di interi della stessa lunghezza, create un
		// terzo vettore con la loro somma, componente per componente.
		int[] v1 = new int[] { 1,2,3,4,5,6,7,8 };
		int[] v2 = new int[] { 10,20,30,40,50,60,70,80 };
		
		int[] w = new int[v1.length];

		int i;
		for (i = 0 ; i < w.length ; i++) {
			w[i] = v1[i] + v2[i];
		}
		
		System.out.println("La lunghezza di v1 è " + v1.length);
		for (i = 0 ; i < v1.length ; i++) {
			System.out.println("v1[" + i + "] = " + v1[i]);
		}
		System.out.println("La lunghezza di v2 è " + v2.length);
		for (i = 0 ; i < v2.length ; i++) {
			System.out.println("v2[" + i + "] = " + v2[i]);
		}
		System.out.println("La lunghezza di w è " + w.length);
		for (i = 0 ; i < w.length ; i++) {
			System.out.println("w[" + i + "] = " + w[i]);
		}
	}
	
	static void esercizioConcatenazione() {
		// Dati due vettori di interi, anche di lunghezze diverse, create un
		// terzo vettore con la loro concatenazione.
		int[] v1 = new int[] { 1,2,3,4,5,6,7,8 };
		int[] v2 = new int[] { 10,20,30,40 };
		
		int i;
		int[] w = new int[v1.length+v2.length];
		for (i = 0 ; i < v1.length ; i++) {
			w[i] = v1[i];
		}
		for (i = 0 ; i < v2.length ; i++) {
			w[v1.length + i] = v2[i];
		}
		
		System.out.println("La lunghezza di v1 è " + v1.length);

		for (i = 0 ; i < v1.length ; i++) {
			System.out.println("v1[" + i + "] = " + v1[i]);
		}
		System.out.println("La lunghezza di v2 è " + v2.length);
		for (i = 0 ; i < v2.length ; i++) {
			System.out.println("v2[" + i + "] = " + v2[i]);
		}
		System.out.println("La lunghezza di w è " + w.length);
		for (i = 0 ; i < w.length ; i++) {
			System.out.println("w[" + i + "] = " + w[i]);
		}		
	}
	
	static void esercizioOrdinato() {
		// Dato un vettore di interi, si calcoli se è ordinato in
		// modo crescente.		
		int[] v = new int[] { 1,2,3,4,5,6,7,8 };
		
		boolean ordinato = true;
		
		int i;
		for (i = 0 ; i < v.length - 1 ; i++) {
			if (v[i] > v[i+1]) {
				ordinato = false;
			}
		}
		
		System.out.println("La lunghezza di v è " + v.length);
		for (i = 0 ; i < v.length ; i++) {
			System.out.println("v[" + i + "] = " + v[i]);
		}
		if (ordinato) {
			System.out.println("v è ordinato in modo crescente");			
		} else {
			System.out.println("v NON è ordinato in modo crescente");			
		}
	}
	
	static void esercizioOrdinamentoPerSelezione() {
		// (impegnativo)
		//
		// Dato un vettore di interi, lo si permuti in modo da renderlo
		// ordinato in modo debolmente crescente.
		//
		// Per farlo, si proceda in questo modo:
		// - Si trovi la posizione i del minimo elemento del vettore. Si
		//   scambi l'elemento in posizione i con quello in posizione 0.
		// - Si trovi la posizione i del minimo elemento tra quelli in
		//   posizione 1..length-1. Si scambi l'elemento in posizione i
		//   con quello in posizione 1.
		// - Si trovi la posizione i del minimo elemento tra quelli in
		//   posizione 2..length-1. Si scambi l'elemento in posizione i
		//   con quello in posizione 2.
		// - Si proceda analogamente col resto del vettore, fino a renderlo
		//   ordinato.
		//
		// Questo algoritmo è noto come ordinamento per selezione
		// (selection sort) ed effettua O(n^2) operazioni, dove n è la
		// lunghezza del vettore. Non è l'algoritmo più veloce, ma è uno tra
		// i più semplici.
		
		int[] v = new int[] { 10,4,72,34,2,99,64 };
		
		int i;
		for (i = 0 ; i < v.length ; i++) {
			// Cerca posizione minimo da i in poi
			int pos_min = i;
			int j;
			for (j = i+1 ; j < v.length ; j++) {
				if (v[j] < v[pos_min]) {
					pos_min = j;
				}
			}
			
			// Scambia gli elementi in posizione i e pos_min
			int tmp = v[i];
			v[i] = v[pos_min];
			v[pos_min] = tmp;
		}
		
		System.out.println("La lunghezza di v è " + v.length);
		for (i = 0 ; i < v.length ; i++) {
			System.out.println("v[" + i + "] = " + v[i]);
		}
	}
}
