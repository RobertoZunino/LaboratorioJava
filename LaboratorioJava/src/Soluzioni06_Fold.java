
public class Soluzioni06_Fold {

	public static void main(String[] args) {
	}

	static void esercizioSommaFinoN() {
		// Dato n>=0, sommate 1+2+...+n.
		// Confrontate il risultato con la formula n*(n+1)/2 .
		
		int n = 100;
		
		int somma = 0;
		int i = 1;
		while (i <= n) {
			somma = somma + i;
			i++;
		}
		
		System.out.println("La somma 1+2+...+" + n + " è " + somma);
		int somma_bis = n*(n+1)/2;
		System.out.println("La formula dà " + somma_bis);
		
	}
		
	static void esercizioFattoriale() {
		// Dato n>=0, calcolate il fattoriale n! = 1*2*...*n.
		
		int n = 5;
		
		int fattoriale = 1;
		int i = 1;
		while (i <= n) {
			fattoriale = fattoriale * i;
			i++;
		}

		System.out.println("Il fattoriale " + n + "! è uguale a " + fattoriale);
	}
	
	static void esercizioMassimo() {
		// Dati due interi a, b con a<b, calcolate il *massimo* assunto dal
		// polinomio
		// 	   - 10 x^2 + 5 x - 7
		// per x intero con a<=x<=b.
		int a = 0;
		int b = 10;
		
		int massimo = - 10*a*a + 5*a - 7;
		int x = a+1;
		while (x <= b) {
			int y = - 10*x*x + 5*x - 7;
			if (y > massimo) {
				massimo = y;
			}			
			x++;
		}
		
		System.out.println("massimo di p(" + a + "), ..., p(" + b + ") = " + massimo);			
	}
	
	static void esercizioMinimoArgomento() {
		// Modificate gli esercizi di sopra su minimo / massimo in modo da
		// stampare anche il valore di x che causa il minimo / massimo.

		// Per il minimo si procede così:
		
		int a = -10;
		int b = 10;
		
		int minimo = 10*a*a-5*a+7;
		int x_minimo = a; // La x che rende minimo il polinomio.
		int x = a+1;
		while (x <= b) {
			int y = 10*x*x - 5*x + 7;
			if (y < minimo) {
				minimo = y;
				x_minimo = x;
			}
			x++;
		}
		
		System.out.println("minimo di p(" + a + "), ..., p(" + b + ") = " + minimo);
		System.out.println("  ottenuto per x = " + x_minimo);
		
		// Per il massimo si procede analogamente.
	}
	
	static void esercizioSommaRipetuta() {
		// Dato n>=0 e m qualunque, calcolate con un ciclo m*n senza
		// usare la moltiplicazione, ma sommando m per n volte.
		int n = 4;
		int m = -3;

		int prodotto = 0;
		int i = 0;
		while (i < n) {
			prodotto = prodotto + m;
			i++;
		}

		System.out.println("Il prodotto " + m + "*" + n + " è uguale a " + prodotto);
	}
	
	static void esercizioNumeroOccorrenze() {
		// Sia p(x) il polinomio
		//		x^4 - 10 x^3 + 35 x^2 - 50 x + 24
		// Dati tre interi a,b,y calcolate il numero di valori interi di x
		// compresi tra a e b per cui p(x) = y.
		
		int a = -100;
		int b = 100;
		int y = 0;
		
		int numeroX = 0; // Bozza da correggere
		int x = a;
		
		while (x <= b) {
			int v = x*x*x*x - 10*x*x*x + 35*x*x - 50*x + 24;
			if (v == y) {
				numeroX++;
			}
			x++;
		}
		
		System.out.println("Il polinomio assume valore " + y + " per " + numeroX + " volte.");
	}
	
	static void esercizioControlloOccorrenze() {
		// Sia p(x) il polinomio
		//		x^4 - 10 x^3 + 35 x^2 - 50 x + 24
		// Dati tre interi a,b,y calcolate se esiste almeno un valore
		// intero x compreso tra a e b per cui si ha p(x) = y.
		
		int a = -100;
		int b = 100;
		int y = 0;
		
		boolean esisteX = false; // Bozza da correggere
		int x = a;
		
		while (x <= b) {
			int v = x*x*x*x - 10*x*x*x + 35*x*x - 50*x + 24;
			if (v == y) {
				esisteX = true;
			}
			x++;
		}
		
		if (esisteX) {
			System.out.println("Il polinomio assume valore " + y + " in almeno un punto");
		} else {
			System.out.println("Il polinomio NON assume mai il valore " + y);
		}
	}
	
	static void esercizioNumeroDivisori() {
		// Dato n>=2 calcolate il numero di divisori interi non banali
		// (1 < divisore < n).
		// Per capire se a è divisibile per b basta controllare il resto
		// della divisione:
		//		a % b == 0
		
		int n = 123456;
		
		int divisori = 0;
		
		int i = 2;
		while (i < n) {
			if (n % i == 0) {
				divisori++;
			}
			i++;
		}
		
		System.out.println("Il numero " + n + " ha " + divisori + " divisori.");
	}
	
	static void esercizioPrimalità() {
		// Dato n>=0 stabilire se è un numero primo.
		// Potete adattare la soluzione all'esercizio precedente.
		// Non vi serve una variabile contatore ma basta un booleano. 
		
		int n = 123456;
		
		boolean primo = true;
		int min_divisore = 0;
		int max_divisore = 0;
		
		int i = 2;
		while (i < n) {
			if (n % i == 0) {
				max_divisore = i;	// Bonus 1
				if (primo) {		// Bonus 2
					min_divisore = i;
				}
				primo = false;
			}
			i++;
		}
		
		if (primo) {
			System.out.println("Il numero " + n + " è primo.");
		} else {
			System.out.println("Il numero " + n + " non è primo.");
			System.out.println("Minimo divisore non banale : " + min_divisore);
			System.out.println("Massimo divisore non banale: " + max_divisore);
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
		
		int i = 0;
		while (i <= 20) {
			if (i % 2 == 0) {
				System.out.println(i);
			}
			i++;
		}
		
		// Alternativa:
		System.out.println("--------- Soluzione alternativa:");
		i = 0;
		while (i <= 20) {
			System.out.println(i);
			i = i + 2;
		}
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

		int i = 0;
		while (i <= n) {
			if (n == i*i) {
				quadrato = true;
				radice = i;
			}
			i++;
		}

		if (quadrato) {
			System.out.println("Il numero " + n + " è il quadrato di " + radice + ".");
		} else {
			System.out.println("Il numero " + n + " non è un quadrato.");			
		}
		
		// Bonus: quando nel ciclo si trova la radice, non serve proseguire
		// col ciclo while. Modificate la guardia del ciclo in modo che si
		// fermi subito quando questo accade.
		
		// Basta usare while "(i <= n && !quadrato)"
	}	
}
