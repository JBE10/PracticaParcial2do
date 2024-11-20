package negocios;


import java.io.Serializable;

public class Circulo extends Forma implements Serializable {
    private static final long serialVersionUID = 1L;
    private double radio;
    private double area;
    private double circunferencia;
    public Circulo(){
        super();
        this.radio=0;
        this.area=0;
        this.circunferencia=0;
        this.tipo=CIRCULO;
    }
    public Circulo(int id, double radio){
        super(id);
        this.radio=radio;
        this.area=calcularArea();
        this.circunferencia=calcularCircunferencia();
        this.tipo=CIRCULO;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public double getCircunferencia() {
        return circunferencia;
    }

    public void setCircunferencia(double circunferencia) {
        this.circunferencia = circunferencia;
    }
    public double calcularArea(){
        return Math.PI*Math.pow(this.radio,2);
    }
    public double calcularCircunferencia(){
        return 2*Math.PI*this.radio;
    }

}
