package negocios;

import java.io.Serializable;

public abstract class Forma implements Serializable {
    private static final long serialVersionUID = 1L;
    protected int id;
    protected int tipo;
    protected final static int TRIANGULO=1;
    protected final static int CUADRADO=2;
    protected final static int CIRCULO=3;
    protected final static int SINFORMA=0;
    private double area;
    public Forma(){
        this.id=SINFORMA;
        this.area=0;
    }
    public Forma(int id){
        this.id=id;
        this.area=calcularArea();
    }
    public int getId(){
        return this.id;
    }
    public void setId(int id){
        this.id=id;
    }
    public int getTipo(){
        return this.tipo;
    }
    public void setTipo(int tipo){
        this.tipo=tipo;
    }
    public double getArea(){
        return this.area;
    }
    public void setArea(double area){
        this.area=area;
    }
    public double calcularArea(){
        return 0;
    }
    public double calcularPerimetro(){
        return 0;
    }
    public double calcularCircunferencia(){
        return 0;
    }
}
