package formageometrica;

public class Retangulo extends FormaGeometrica {
 
    private final double largura;
    private final double altura;
    
    public Retangulo(double largura, double altura) {
        this.largura = largura;
        this.altura = altura;
    }

    @Override
    public double CalcularArea() {
        return largura * altura;
    }
}
       