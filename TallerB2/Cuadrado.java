package TallerB2;

public class Cuadrado {
    private double lado;

    public Cuadrado(){

    }

    public Cuadrado(double lado){
        this.lado = lado;
    }

    public double AreaC(){
        return lado * lado;
    }

    public double perimetro(){
        return 4 * lado;
    }

    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }

    @Override
    public String toString() {
        return "Cuadrado [lado=" + lado + ", AreaC()=" + AreaC() + ", perimetro()=" + perimetro() + "]";
    }
}
