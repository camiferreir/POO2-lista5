package formageometrica;

public class Circulo extends FormaGeometrica {
    private final double raio;

    public Circulo(double raio) {
        this.raio = raio;
    }

    @Override
    public double CalcularArea() {
        return Math.PI * raio * raio;
    }
}

