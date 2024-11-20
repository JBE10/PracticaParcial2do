package usuario;

import exepciones.NoExisteEx;
import exepciones.YaExisteEx;
import negocios.*;

import java.util.Scanner;

public class Main {
    static AlmacenDeFormas almacenDeFormas;
    public static void main(String[] args) {
        almacenDeFormas = datos.Seria.deserializarAlmacen("almacen.ser");
        try{
            if (almacenDeFormas == null) {
                almacenDeFormas = new AlmacenDeFormas();
            }
            Scanner sp= new Scanner(System.in);
            int op;
            do{
                System.out.println("1. Agregar forma, 2. Informar forma, 3. Informar perimetro, 4. Mostrar suma de area total, 5. Salir");
                switch (op=sp.nextInt())
                {
                    case 1:
                        agregarForma(sp);
                        break;
                    case 2:
                        informarForma(sp);
                        break;
                    case 3:
                        informarPerimetro(sp);
                        break;
                    case 4:
                        mostrarSumaAreaTotal();
                        break;
                    case 5:
                        datos.Seria.serializarAlmacen(almacenDeFormas, "almacen.ser");
                        break;
                    default:
                        System.out.println("Opcion invalida");
                        break;
                }
            }while(op!=5);
        }
        catch (Exception e){
            System.out.println("Error");
        }

    }
    public static void agregarForma(Scanner sp){
        try{
            System.out.println("Ingrese el id de la forma");
            int id = sp.nextInt();
            System.out.println("Ingrese el tipo de la forma (1. Circulo, 2. Cuadrado, 3. Triangulo)");
            int tipo = sp.nextInt();
            Forma forma = null;
            switch (tipo) {
                case 1:
                    System.out.println("Ingrese el radio del circulo");
                    forma = new Circulo(id, sp.nextDouble());
                    break;
                case 2:
                    System.out.println("Ingrese el lado del cuadrado");
                    forma = new Cuadrado(id, sp.nextDouble());
                    break;
                case 3:
                    System.out.println("Ingrese la base y la altura del triangulo, seguido el lado diferente y el lado doble");
                    forma = new Triangulo(id, sp.nextDouble(), sp.nextDouble(), sp.nextDouble(), sp.nextDouble());
                    break;
                default:
                    System.out.println("Tipo invalido");
                    return;
            }
            almacenDeFormas.agregarForma(forma);
        } catch (YaExisteEx e) {
            System.out.println(e.getMessage());
        } catch (Exception e) {
            System.out.println("Error");
        }
    }
    public static void informarForma(Scanner sp){
        try{
            System.out.println("Ingrese el id de la forma");
            Forma forma = almacenDeFormas.obtenerForma(sp.nextInt());
            if (forma == null) {
                System.out.println("No existe la forma");
                return;
            }
            System.out.println(forma.getId());
            System.out.println(forma.getTipo());
            System.out.println(forma.getArea());

        }
        catch (NoExisteEx e){
            System.out.println(e.getMessage());
        }
        catch (Exception e){
            System.out.println("Error");
        }
    }
    public static void informarPerimetro(Scanner sp){
        try{
            System.out.println("Ingrese el id de la forma");
            Forma forma = almacenDeFormas.obtenerForma(sp.nextInt());
            if (forma == null) {
                System.out.println("No existe la forma");
                return;
            } else if (forma.getTipo() == 3) {
                System.out.println("No se puede calcular el perimetro de un circulo");
                System.out.println(forma.calcularCircunferencia());
                return;
            }
            System.out.println(forma.calcularPerimetro());
        }
        catch (NoExisteEx e){
            System.out.println(e.getMessage());
        }
        catch (Exception e){
            System.out.println("Error");
        }
    }
    public static void mostrarSumaAreaTotal(){
        double suma = 0;
        for (Forma forma: almacenDeFormas.getFormas()) {
            suma += forma.getArea();
        }
        System.out.println(suma);
    }
}