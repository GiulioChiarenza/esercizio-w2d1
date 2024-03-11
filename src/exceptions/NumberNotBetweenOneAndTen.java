package exceptions;

public class NumberNotBetweenOneAndTen extends RuntimeException{
    public NumberNotBetweenOneAndTen(int wrongNumber){
        super("il numero " + wrongNumber + " non è compresto tra 1 e 10");
    }
}
