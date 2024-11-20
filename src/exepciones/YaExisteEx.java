package exepciones;

public class YaExisteEx extends Exception {
    public YaExisteEx() {
        super("Ya existe el elemento");
    }
}
