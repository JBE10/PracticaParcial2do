package exepciones;

public class NoExisteEx extends Exception {
    public NoExisteEx() {
        super("No existe el elemento");
    }
}
