
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
		//		f(x1, ..., xI, y) = g(f(x1, ..., xI), y)
		//			per ogni x1, ..., xI, y
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
		// prodotto();
	}

	static void somma() {
		// Sommiamo x^2 per x tra 1 e 20:
		//		1^2 + 2^2 + ... + 20^2
		//
		// Qui, la funzione f è data da:
		//		f(x1, ..., xN) = x1 + ... + xN
		// Poniamo f() = 0 come la somma di zero addendi.
		//
		// La funzione g(a,b) sarà quindi a+b
		
		int somma = 0; // risultato = f()
		
		int i = 1;
		while (i <= 20) {
			somma = somma + i*i;  // risultato = g(risultato, xI)
			i++;
		}
		
		System.out.println("La somma dei primi 20 quadrati è " + somma);
	}
	
	static void esercizioSommaFinoN() {
		// Dato n>=0, sommate 1+2+...+n.
		// Confrontate il risultato con la formula n*(n+1)/2 .
		
		int n = 100;
		
		int somma = 42; // Bozza, da correggere
	
		// TODO
		
		System.out.println("La somma 1+2+...+" + n + " è " + somma);
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
		
		System.out.println("Il prodotto dei primi 6 quadrati è " + prodotto);
	}
	
	static void esercizioFattoriale() {
		// Dato n>=0, calcolate il fattoriale n! = 1*2*...*n.
		
		int n = 7;
		
		int fattoriale = 42; // Bozza, da correggere
		
		// TODO

		System.out.println("Il fattoriale " + n + "! è uguale a " + fattoriale);
	}
	
	static void minimo() {
		// Dati due interi a, b con a<b, calcoliamo il minimo assunto dal
		// polinomio
		// 	   10 x^2 - 5 x + 7
		// per x intero con a<=x<=b.
	
		// Qui f(x1, ..., xN) = min { x1, ..., xN }.
		// Ovviamente g(a,b) = min(a,b).
		//
		// In questo caso, f() non è definito, quindi facciamo partire il
		// ciclo da f(x1).
			
		int a = -10;
		int b = 10;
		
		int minimo = 10*a*a-5*a+7;  // f(polinomio(a))
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

	static void esercizioMassimo() {
		// Dati due interi a, b con a<b, calcolate il *massimo* assunto dal
		// polinomio
		// 	   - 10 x^2 + 5 x - 7
		// per x intero con a<=x<=b.
		int a = -10;
		int b = 10;
		
		int massimo = +10000;  // Bozza da correggere!

		// TODO

		System.out.println("massimo di p(" + a + "), ..., p(" + b + ") = " + massimo);			
	}
	
	static void esercizioMinimoArgomento() {
		// Modificate gli esercizi di sopra su minimo / massimo in modo da
		// stampare anche il valore di x che causa il minimo / massimo.
		
		// TODO
	}
	
	static void esercizioSommaRipetuta() {
		// Dato n>=0 e m qualunque, calcolate con un ciclo m*n senza
		// usare la moltiplicazione, ma sommando m per n volte.
		int n = 4;
		int m = -3;

		// TODO

		System.out.println("Il prodotto " + m + "*" + n + " è uguale a ...");
	}

	static void esercizioNumeroDivisori() {
		// Dato n>=2 calcolate il numero di divisori interi non banali
		// (1 < divisore < n).
		// Per capire se a è divisibile per b basta controllare il resto
		// della divisione:
		//		a % b == 0
		
		int n = 123456;
		
		int divisori = 42; // Bozza da correggere
		
		// TODO

		System.out.println("Il numero " + n + " ha " + divisori + " divisori.");
	}
	
	static void esercizioPrimalità() {
		// Dato n>=0 stabilire se è un numero primo.
		// Potete adattare la soluzione all'esercizio precedente.
		// Non vi serve una variabile contatore ma basta un booleano. 
		
		int n = 123456;
		
		boolean primo = true; // Bozza da correggere

		// TODO

		if (primo) {
			System.out.println("Il numero " + n + " è primo.");
		} else {
			System.out.println("Il numero " + n + " non è primo.");			
		}
		
		// Bonus 1: nel caso non primo, stampate anche il più piccolo dei
		// divisori non banali di n.
		// Bonus 2: nel caso non primo, stampate anche il più grande dei
		// divisori non banali di n.
	}
	
	static void esercizioPari() {
		// Stampate i numeri pari da 0 a 20.
		//
		// Potete fare scorrere i da 0 a 20 e usare un if per scartare
		// i dispari. Per controllare se un numero è pari potete usare
		//		n%2 == 0
		//
		// Alternativamente, potete incrementare di due i ad ogni
		// iterazione.
		
		// TODO
	}
	
	static void esercizioQuadrato() {
		// Dato n>=0, verificate se n è un quadrato.
		// Per farlo, provate a confrontarlo con m*m per ogni m<=n.
		int n = 144;

		// Usate una variabile booleana per memorizzare se n è un quadrato
		// oppure no.
		boolean quadrato = false; // Bozza, da correggere
		
		// Nel caso n sia un quadrato, memorizzate la radice in questa
		// variabile.
		int radice = 0;

		// TODO

		if (quadrato) {
			System.out.println("Il numero " + n + " è il quadrato di " + radice + ".");
		} else {
			System.out.println("Il numero " + n + " non è un quadrato.");			
		}
		
		// Bonus: quando nel ciclo si trova la radice, non serve proseguire
		// col ciclo while. Modificate la guardia del ciclo in modo che si
		// fermi subito quando questo accade.
	}	
}
