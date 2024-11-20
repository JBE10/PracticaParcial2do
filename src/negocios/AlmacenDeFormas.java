package negocios;

import exepciones.*;

import java.io.Serializable;
import java.util.ArrayList;

public class AlmacenDeFormas implements Serializable {
    private static final long serialVersionUID = 1L;
    private ArrayList<Forma> formas;
    public AlmacenDeFormas(){
        this.formas=new ArrayList<Forma>();
    }
    public ArrayList<Forma> getFormas(){
        return this.formas;
    }
    public void agregarForma(Forma forma)throws YaExisteEx{
        for (Forma f:formas){
            if (f.getId()==forma.getId()){
                throw new YaExisteEx();
            }
        }
        this.formas.add(forma);
    }
    public void eliminarForma(int id){
        for (Forma f:formas){
            if (f.getId()==id){
                formas.remove(f);
                return;
            }
        }
    }
    public Forma obtenerForma(int id) throws NoExisteEx{
        for (Forma f:formas){
            if (f.getId()==id){
                return f;
            }
        }
        throw new NoExisteEx();
    }


}
