package datos;

import negocios.AlmacenDeFormas;

import java.io.*;

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
        File file = new File(archivo);
        if (!file.exists()) {
            return null;
        }
        try (FileInputStream archivoEntrada = new FileInputStream(archivo);
             ObjectInputStream entrada = new ObjectInputStream(archivoEntrada)) {
            return (AlmacenDeFormas) entrada.readObject();
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}

