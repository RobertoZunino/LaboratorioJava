
public class Soluzioni02_VariabiliIntere {

	public static void main(String[] args) {
		int x;
		x = 10;
		x = x + 100;
		// All'inizio x è impostato a 10. Poi viene calcolato x+100, con
		// risultato 110, e questo nuovo valore viene assegnato a x.
		
		// Esercizio 1.
		// Verificate che ora x vale davvero 110, stampandola.
		
		System.out.println("x ora vale " + x); // Stampa 110
		
		// Esercizio 2.
		// Provate anche gli altri operatori aritmetici: + - * /
		// Eseguite degli assegnamenti usando delle espressioni a vostra
		// scelta.
		int a = 10;
		int b = 20;
		x = 3*a+b; // 50
		System.out.println("x ora vale " + x); // Stampa 50
		x = a/3 - 1; // Nota: 10/3 ha quoziente 3
		System.out.println("x ora vale " + x); // Stampa 2
		x = a*(b + a*(b + 1)); // Parentesi annidate
		System.out.println("x ora vale " + x); // Stampa 2300
		
		// Esercizio 3.
		// Il comando
		x++;
		// è equivalente a x=x+1, ovvero incrementa di uno x. 
		// Verificatelo.
		System.out.println("x ora vale " + x); // Stampa 2301
		
		// Esercizio 4.
		// Provate a stampare il valore del polinomio
		//   10 x^2 - 5 x + 7
		// per x = 1, 7, 9
		// Nota: in Java non c'è l'operatore potenza x^2, ma potete usare
		// l'espressione x*x per il quadrato di x.
		
		x = 1;
		int y = 10*x*x - 5*x + 7;
		System.out.println("p(" + x + ") = " + y); // Stampa 12
		x = 7;
		y = 10*x*x - 5*x + 7;
		System.out.println("p(" + x + ") = " + y); // Stampa 462
		x = 9;
		y = 10*x*x - 5*x + 7;
		System.out.println("p(" + x + ") = " + y); // Stampa 772
		
		// Esercizio 5.
		// Provate a dividere per zero e vedere cosa succede.
		
		x = 1;
		// x = 5 / (x - 1); // Divisione per zero
		// Exception java.lang.ArithmeticException: / by zero
	}
}
