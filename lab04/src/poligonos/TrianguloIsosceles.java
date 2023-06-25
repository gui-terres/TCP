package poligonos;

public class TrianguloIsosceles extends Triangulo {
    public TrianguloIsosceles(float lado1, float lado2, float lado3) {
        super(lado1, lado2, lado3);
    }

    private float calculaAltura() {
        float alturaQuadrada = (float)(Math.pow(super.getLado2(), 2) - Math.pow(super.getLado1()/2, 2));
        return (float)Math.sqrt(alturaQuadrada);
    }

    @Override
    public float calculaArea() {
        return super.calculaArea(super.getLado1(), calculaAltura());
    }

    @Override
    public void imprimeTipoPoligono() {
        System.out.println("Tipo de polígono: triângulo isosceles.");
    }
}
