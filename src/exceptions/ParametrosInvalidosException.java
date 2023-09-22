package exceptions;

public class ParametrosInvalidosException extends RuntimeException {

    public ParametrosInvalidosException(String messagem) {
        super(messagem);
    }
}