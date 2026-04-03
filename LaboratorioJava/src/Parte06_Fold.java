
public class Parte06_Fold {

	public static void main(String[] args) {
		// Un uso molto comune del ciclo while è quello di calcolare il
		// valore di  una funzione definita sulle sequenze finite di zero o
		// più dati.
		//
		//		f(x1, x2, x3, ..., xN)   con N >= 0
		//
		// Per calcolare questo valore, è possibile procedere come segue.
		// L'idea è quella di usare una variabile risultato, e modificarla
		// nel ciclo while in modo che assuma i seguenti valori:
		//
		//		risultato = f()
		//		risultato = f(x1)
		//		risultato = f(x1, x2)
		//		risultato = f(x1, x2, x3)
		//      ...
		//		risultato = f(x1, x2, x3, ..., xN)
		//
		// Spesso, è possibile trovare una semplice funzione g(-,-) che
		// trasformi il precedente risultato in quello successivo:
		//
		//		f(x1, ..., xI, y) = g(f(x1, ..., xI), y) per ogni x1,...,xI,y
		//
		// In tal caso basta eseguire gli assegnamenti sotto, in sequenza:
		// 
		//		risultato = f()
		//		risultato = g(risultato, x1)
		//		risultato = g(risultato, x2)
		//		risultato = g(risultato, x3)
		//      ...
		//		risultato = g(risultato, xN)
		// 
		// Questo modo di procedere viene chiamato "fold".
		// Vediamo alcuni esempi.
		
		somma();
		prodotto();
	}

	static void somma() {
		// Sommiamo x^2 per x tra 1 e 20:
		//		1^2 + 2^2 + ... + 20^2
		//
		// Qui, la funzione f è data da:
		//		f(x1, ..., xN) = x1 + ... + xN
		// Poniamo f() = 0 come la somma di zero addendi.
		//
		// La funzione g(a,b) darà quindi a+b
		
		int somma = 0; // risultato = f()
		
		int i = 1;
		while (i <= 20) {
			somma = somma + i*i;  // risultato = g(risultato, xI)
			i++;
		}
		
		System.out.println("La somma dei primi 20 quadrati è " + somma);
	}
	
	static void prodotto() {
		// Moltiplichiamo x^2 per x tra 1 e 6:
		//		1^2 * 2^2 * ... * 6^2
		//
		// Qui, la funzione f è data da:
		//		f(x1, ..., xN) = x1 * ... * xN
		// Poniamo f() = 1 come il prodotto di zero termini.
		//
		// La funzione g(a,b) darà quindi a*b
		
		int prodotto = 1; // risultato = f()
		
		int i = 1;
		while (i <= 6) {
			prodotto = prodotto * i*i;  // risultato = g(risultato, xI)
			i++;
		}
		
		System.out.println("Il prodotto dei primi 10 quadrati è " + prodotto);
	}	
	
	static void minimo() {
		// Dati due interi a, b con a<b, calcoliamo il minimo assunto dal
		// polinomio
		// 	   10 x^2 - 5 x + 7
		// per x intero con a<=x<=b.
	
		// Qui f(x1, ..., xN) = min { x1, ..., xN }.
		// Ovviamente g(a,b) = min(a,b).
		//
		// In questo caso, f() non è definito, quindi facciamo partire il ciclo
		// da f(x1).
			
		int a = 0;
		int b = 10;
		
		int minimo = a;  // f(a)
		int x = a+1;
		while (x <= b) {
			// risultato = g(risultato, polinomio(x))
			int y = 10*x*x - 5*x + 7;
			if (y < minimo) {
				minimo = y;
			}
			
			x++;
		}
		
		System.out.println("minimo di p(" + a + "), ..., p(" + b + ") = " + minimo);
	}

	static void esercizio1() {
		// Dati due interi a, b con a<b, calcolate il *massimo* assunto dal
		// polinomio
		// 	   - 10 x^2 + 5 x - 7
		// per x intero con a<=x<=b.
		int a = 0;
		int b = 10;
		
		int massimo = +10000;  // Bozza da correggere!
		
		System.out.println("minimo di p(" + a + "), ..., p(" + b + ") = " + massimo);			
	}
	
	static void esercizio2() {
		// Modificate gli esercizi di sopra su minimo / massimo in modo da
		// stampare anche il valore di x che causa il minimo / massimo.
	}
	
	static void esercizio3() {
		// Dato n>=0 e m qualunque, calcolate con un ciclo m*n senza
		// usare la moltiplicazione, ma sommando m per n volte.
		int n = 4;
		int m = -3;
		
		System.out.println("Il prodotto " + m + "*" + n + " è uguale a ...");
	}
	
}
