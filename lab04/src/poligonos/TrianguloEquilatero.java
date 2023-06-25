package poligonos;

public class TrianguloEquilatero extends Triangulo {
    private final float multiplicador = (float)Math.sqrt(3)/4;

    public TrianguloEquilatero(float lado1, float lado2, float lado3) {
        super(lado1, lado2, lado3);
    }
    @Override
    public float calculaArea() {
        return (float)(multiplicador * Math.pow(super.getLado1(), 2));
    }

    @Override
    public void imprimeTipoPoligono() {
        System.out.println("Tipo de polígono: triângulo equilátero.");
    }
}
