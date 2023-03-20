package Esercizio1;

import java.util.Scanner;
import java.util.Random;

public class Es1 {
	public static void main(String[] args) {
		int[] array = new int[5];
		Random random = new Random();

		for (int i = 0; i < array.length; i++) {
			array[i] = random.nextInt(10) + 1;
		}

		System.out.println("Array iniziale:");
		printArray(array);

		Scanner scanner = new Scanner(System.in);
		int index, value;

		while (true) {
			try {
				System.out.print("Inserisci un indice (0-4) o 5 per uscire: ");
				index = scanner.nextInt();

				if (index == 5) {
					break;
				}

				if (index < 0 || index >= array.length) {
					throw new IndexOutOfBoundsException("L'indice deve essere compreso tra 0 e 4.");
				}

				System.out.print("Inserisci un valore (1-10): ");
				value = scanner.nextInt();

				if (value < 1 || value > 10) {
					throw new IllegalArgumentException("Il valore deve essere compreso tra 1 e 10.");
				}

				array[index] = value;

				System.out.println("Nuovo array:");
				printArray(array);
			} catch (IndexOutOfBoundsException e) {
				System.out.println("Errore: " + e.getMessage());
			} catch (IllegalArgumentException e) {
				System.out.println("Errore: " + e.getMessage());
			} catch (Exception e) {
				System.out.println("Errore: inserisci un numero intero.");
				scanner.nextLine();
			}
		}
	}

	private static void printArray(int[] array) {
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}

		System.out.println();
	}
}
