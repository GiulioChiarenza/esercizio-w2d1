package exceptions;

public class NumberLessThanZeroException extends RuntimeException{
    public NumberLessThanZeroException(int wrongNumber){

        super("Il numero " + wrongNumber + " è minore di zero!");
    }
}
