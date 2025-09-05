package formageometrica;

public class FormaGeometrica {

    public static void main(String[] args) {
        FormaGeometrica f1 = new Circulo(5);
        FormaGeometrica f2 = new Retangulo(4, 6);
        FormaGeometrica f3 = new Triangulo(3, 8);

        System.out.println("Área do círculo: " + f1.CalcularArea());
        System.out.println("Área do retângulo: " + f2.CalcularArea());
        System.out.println("Área do triângulo: " + f3.CalcularArea());

    }

    public double CalcularArea() {
        int altura = 0;
        int base = 0;
        return (base * altura) / 2;
    }

}
