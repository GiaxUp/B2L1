package Esercizio2;

import java.util.Scanner;

public class Es2 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double kmPercorsi, litriConsumati, kmPerLitro;

		try {
			System.out.print("Inserisci il numero di KM percorsi: ");
			kmPercorsi = input.nextDouble();

			System.out.print("Inserisci il numero di litri di carburante consumati: ");
			litriConsumati = input.nextDouble();

			if (litriConsumati == 0) {
				throw new ArithmeticException("Non è possibile dividere i KM per zero.");
			}

			kmPerLitro = kmPercorsi / litriConsumati;

			System.out.println("Numero di KM/litro percorsi: " + kmPerLitro);
		} catch (Exception e) {
			System.out.println("Errore: " + e.getMessage());
		} finally {
			input.close();
		}
	}

}
