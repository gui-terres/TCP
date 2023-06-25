package poligonos;

public abstract class Triangulo implements IPoligono {
    private float base, altura, lado1, lado2, lado3;

    public Triangulo(float base, float altura) {
        this.base = base;
        this.altura = altura;
    }
    public Triangulo(float lado1, float lado2, float lado3) {
        this.lado1 = lado1;
        this.lado2 = lado2;
        this.lado3 = lado3;
    }

    public static float calculaArea(float base, float altura) {
        return (base * altura)/2;
    }

    @Override
    public float calculaArea() {
        return (this.base * this.altura)/2;
    }

    @Override
    public abstract void imprimeTipoPoligono();

    public float getBase() {
        return this.base;
    }

    public float getAltura() {
        return this.altura;
    }

    public float getLado1() {
        return this.lado1;
    }

    public float getLado2() {
        return this.lado2;
    }

    public float getLado3() {
        return this.lado3;
    }
}
