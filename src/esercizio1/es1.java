package esercizio1;

import exceptions.NumberNotBetweenOneAndTen;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class es1 {
public static void main(String[] args) {
    int[] array= new int[5];
    Random random= new Random();

    for (int i = 0; i < array.length; i++) {
        array[i] = random.nextInt(10) + 1;
    }
    System.out.println("Array originale:");

    Scanner scanner= new Scanner(System.in);
    int posizione;
    int valore;


    while (true) {
        try {
            System.out.print("Inserisci il numero da aggiungere (0 per uscire): ");
            valore = scanner.nextInt();
            if (valore == 0) {
                break;
            }

            if (valore < 1 || valore > 10) {
                throw new NumberNotBetweenOneAndTen(valore);
            }

            System.out.print("Inserisci la posizione (0-4): ");
            posizione = scanner.nextInt();

            if (posizione < 0 || posizione >= array.length) {
                throw new ArrayIndexOutOfBoundsException("Posizione non valida");
            }

            array[posizione] = valore;

            System.out.println("Nuovo stato dell'array:");
            stampaArray(array);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Errore: Posizione non valida. Inserisci una posizione compresa tra 0 e " + (array.length - 1));
            scanner.nextLine();
        } catch (InputMismatchException ex) {
            System.err.println("Non hai inserito un numero!");
            scanner.close();
        }
    }

    System.out.println("Programma terminato.");
}

    private static void stampaArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }
}