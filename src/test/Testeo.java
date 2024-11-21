package test;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

import exepciones.YaExisteEx;
import negocios.AlmacenDeFormas;
import negocios.Circulo;
import negocios.Forma;


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
    @Test
    public void testCirculo() throws YaExisteEx {
        Forma f3=new Circulo(5,6);
        almacen.agregarForma(f3);

        assertEquals(f3.calcularCircunferencia(), 37.69911184307752, 0.1);
    }

}
