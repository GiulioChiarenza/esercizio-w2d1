package esercizio2;

import exceptions.NumberLessThanZeroException;

import java.util.InputMismatchException;
import java.util.Scanner;

public class es2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.print("Inserisci il numero di km percorsi: ");
            double kmPercorsi = scanner.nextDouble();

            System.out.print("Inserisci i litri di carburante consumati: ");
            double litriCarburante = scanner.nextDouble();

            if (litriCarburante == 0) {
                throw new NumberLessThanZeroException(0);
            }

            double kmPerLitro = kmPercorsi / litriCarburante;

            System.out.println("Km/litro percorsi: " + kmPerLitro);
        } catch (InputMismatchException ex) {
            System.err.println("Non hai inserito un numero!");
        } finally {
            scanner.close();
        }
    }
}
