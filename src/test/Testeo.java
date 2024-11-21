package test;
import static org.junit.Assert.*;

import exepciones.YaExisteEx;
import negocios.AlmacenDeFormas;
import negocios.Circulo;
import negocios.Forma;
import org.junit.Before;
import org.junit.Test;


public class Testeo {
    private AlmacenDeFormas almacen;

    @Before
    public void setUp() throws YaExisteEx {
        almacen=new AlmacenDeFormas();
        Forma f1=new Circulo(1, 5);
        almacen.agregarForma(f1);
    }
    @Test
    public void testAgregarForma() throws YaExisteEx {
        Forma f2=new Circulo(2, 5);
        almacen.agregarForma(f2);
        assertEquals(almacen.getFormas().size(), 2);
    }
    @Test
    public void testEliminarForma() {
        almacen.eliminarForma(1);
        assertEquals(almacen.getFormas().size(), 0);
    }

}
