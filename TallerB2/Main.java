package TallerB2;

public class Main {
    public static void main(String[] args) {
        
        Cuadrado cuadrado = new Cuadrado(5);
        System.out.println("Cuadrado:");
        System.out.println("Área: " + cuadrado.AreaC());
        System.out.println("Perímetro: " + cuadrado.perimetro());
        System.out.println(cuadrado);

        Circulo circulo = new Circulo(3);
        System.out.println("\nCírculo:");
        System.out.println("Área: " + circulo.calcularArea());
        System.out.println("Perímetro: " + circulo.calcularPerimetro());
        System.out.println(circulo);

        Triangulo triangulo = new Triangulo(3, 4, 5);
        System.out.println("\nTriángulo:");
        System.out.println("Área: " + triangulo.calcularArea());
        System.out.println("Perímetro: " + triangulo.calcularPerimetro());
        System.out.println("Hipotenusa: " + triangulo.calcularHipotenusa());
        System.out.println(triangulo);
    }
}
