package esercizio3;

public class Banca {
    public static void main(String args[]){
        ContoCorrente conto1= new ContoCorrente("Grossi Mario", 20000.0);
        System.out.println("saldo conto: " + conto1.restituisciSaldo());
        try {
            conto1.preleva(1750.5);
        }
    }
}
