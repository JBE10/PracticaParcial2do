package datos;

import negocios.AlmacenDeFormas;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Seria {
    public static void serializarAlmacen(AlmacenDeFormas almacen, String archivo) {
        try (FileOutputStream archivoSalida = new FileOutputStream(archivo);
             ObjectOutputStream salida = new ObjectOutputStream(archivoSalida)) {
            salida.writeObject(almacen);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public static AlmacenDeFormas deserializarAlmacen(String archivo) {
        try (FileInputStream archivoEntrada = new FileInputStream(archivo);
             ObjectInputStream entrada = new ObjectInputStream(archivoEntrada)) {
            return (AlmacenDeFormas) entrada.readObject();
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}

