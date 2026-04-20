
public class Soluzioni03_CondizionaleIf {

	public static void main(String[] args) {
		int x = 34;
		
		// Esercizio 1.
		// Controllate con un if se 10 < x < 50.
		// Per farlo, dovete usare un AND.
		if (10 < x && x < 50) {
			System.out.println("Il valore x=" + x+ " soddisfa 10 < x < 50");
		} else {
			System.out.println("Il valore x=" + x+ " NON soddisfa 10 < x < 50");
		}
		
		// Esercizio 2.
		// Dati x,y,z controllate se sono ordinati in modo debolmente
		// crescente o no.
		x = 5;
		int y = 5;
		int z = 10;
		
		if (x <= y && y <= z) {
			System.out.println("I numeri " + x + ", " + y + ", " + z + " sono ordinati");
		} else {
			System.out.println("I numeri " + x + ", " + y + ", " + z + " NON sono ordinati");
		}
		
		// Esercizio 3.
		// Dati tre interi x, y, z calcolate il minimo tra loro.
		x = 30;
		y = 5;
		z = 7;
		int minimo = -10000;
		
		minimo = x;
		if (y < minimo) {
			minimo = y;
		}
		if (z < minimo) {
			minimo = z;
		}
		
		System.out.println("Il minimo tra " + x + ", " + y + ", " + z + " è " + minimo);
	}
}
