package negocios;

import java.io.Serializable;

public class Cuadrado extends Forma implements Serializable {
    private static final long serialVersionUID = 1L;
    private double lado;
    private double area;
    private double perimetro;
    public Cuadrado(){
        super();
        this.lado=0;
        this.area=0;
        this.perimetro=0;
        this.tipo=CUADRADO;
    }
    public Cuadrado(int id, double lado){
        super(id);
        this.lado=lado;
        this.area=calcularArea();
        this.perimetro=calcularPerimetro();
        this.tipo=CUADRADO;
    }
    public double getLado(){
        return this.lado;
    }
    public void setLado(double lado){
        this.lado=lado;
    }
    public double getArea(){
        return this.area;
    }
    public void setArea(double area){
        this.area=area;
    }
    public double getPerimetro(){
        return this.perimetro;
    }
    public void setPerimetro(double perimetro){
        this.perimetro=perimetro;
    }
    public double calcularArea(){
        return this.lado*this.lado;
    }
    public double calcularPerimetro(){
        return this.lado*4;
    }

}
