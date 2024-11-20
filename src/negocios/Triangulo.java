package negocios;

import java.io.Serializable;

public class Triangulo extends Forma implements Serializable {
    private static final long serialVersionUID = 1L;
    private double base;
    private double altura;
    private double ladoDoble;
    private double lado;
    private double perimetro;
    private double area;
    public Triangulo(){
        super();
        this.base=0;
        this.altura=0;
        this.lado=0;
        this.ladoDoble=0;
        this.tipo=TRIANGULO;
        this.perimetro=0;
        this.area=0;
    }
    public Triangulo(int id, double base, double altura, double lado, double ladoDoble){
        super(id);
        this.base=base;
        this.altura=altura;
        this.tipo=TRIANGULO;
        this.lado=lado;
        this.ladoDoble=ladoDoble;
        this.perimetro=calcularPerimetro();
        this.area=calcularArea();
    }
    public double getBase(){
        return this.base;
    }
    public void setBase(double base){
        this.base=base;
    }
    public double getAltura(){
        return this.altura;
    }
    public void setAltura(double altura){
        this.altura=altura;
    }


    public double getLado(){
        return this.lado;
    }
    public void setLado(double lado){
        this.lado=lado;
    }
    public double getLadoDoble(){
        return this.ladoDoble;
    }
    public void setLadoDoble(double ladoDoble){
        this.ladoDoble=ladoDoble;
    }
    public double calcularPerimetro(){
        return this.lado+this.ladoDoble;
    }
    public double calcularArea(){
        return (this.base*this.altura)/2;
    }
    public double getPerimetro(){
        return this.perimetro;
    }
    public void setPerimetro(double perimetro){
        this.perimetro=perimetro;
    }
    public double getArea(){
        return this.area;
    }
    public void setArea(double area){
        this.area=area;
    }
}
