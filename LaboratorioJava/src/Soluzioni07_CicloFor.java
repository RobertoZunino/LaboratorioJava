
public class Soluzioni07_CicloFor {

	public static void main(String[] args) {
	}
	
	static void esercizioQuadrati() {
		// Usate un for per stampare i primi 20 quadrati.
		// 0 1 4 9 ...
		
		int i;
		for (i = 0 ; i  < 20 ; i++) {
			System.out.println("Il quadrato di " + i + " è " + i*i);
		}
	}
			
	static void esercizioPrimalità() {
		// Dato n>=2, verificate se n è un primo, provando
		// a dividerlo per tutti gli m tra 2 e n-1.
		//
		// Potete imitare il precedente esercizio che usava il while,
		// ma provate a usare un ciclo for al suo posto.
		
		int n = 144;
		int i;
		boolean primo = true;
		
		for (i = 2 ; i < n ; i++) {
			if (n % i == 0) {
				primo = false;
			}
		}
		
		if (primo) {
			System.out.println("Il numero " + n + " è primo.");
		} else {
			System.out.println("Il numero " + n + " non è primo.");
		}
	}
	
	static void esercizioTabellaPrimi() {
		// Per ogni intero n tra 2 e 100 stampate se è primo o no.
		//
		// Bonus: se n è composto, stampate anche un suo divisore.
		
		int n = 2;
		while (n <= 100) {
			int i;
			boolean primo = true;
			int divisore = 0; // Per il bonus
			
			for (i = 2 ; i < n ; i++) {
				if (n % i == 0) {
					primo = false;
					divisore = i;
				}
			}
			
			if (primo) {
				System.out.println("Il numero " + n + " è primo.");
			} else {
				System.out.println("Il numero " + n + " non è primo.");
				System.out.println("Il numero " + n + " è divisibile per " + divisore);
			}
			n++;
		}
	}
	
	static void esercizioCifre() {
		// Le equazioni seguenti sono vere:
		//   radice quadrata di 2025 = 20 + 25
		//   radice quadrata di 2035 = 20 + 35
		//   radice quadrata di 9801 = 98 + 01
		//
		// Cercate numeri naturali con 6 e con 8 cifre che soddisfano
		// equazioni analoghe.
		// Non vi serve veramente calcolare la radice quadrata: vi basta
		// sapere come calcolare il quadrato.
		
		int max = 1000; // metà di 6 cifre
		int a;
		int b;
		for (a = 0 ; a < max ; a++) {
			for (b = 0 ; b < max ; b++) {
				if (a*max+b == (a+b)*(a+b)) {
					System.out.println("Trovato: " + a + "+" + b + " al quadrato = " + (a*max+b));
				}
			}
		}
		max = 10000; // metà di 8 cifre
		for (a = 0 ; a < max ; a++) {
			for (b = 0 ; b < max ; b++) {
				if (a*max+b == (a+b)*(a+b)) {
					System.out.println("Trovato: " + a + "+" + b + " al quadrato = " + (a*max+b));
				}
			}
		}
	}
}
