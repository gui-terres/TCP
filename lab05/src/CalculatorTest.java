import org.junit.jupiter.api.*;

/*
*   OBS: Não entendi o que devo alterar
*   no código para evitar o erro identi-
*   ficado pelo JUnit, por isso deixei
*   a implementação com erro.
*/

public class CalculatorTest
{
    Calculator calc;

    @BeforeAll
    public static void start() {
        System.out.println("Os testes estão iniciando...");
    }

    @BeforeEach
    public void init() {
        calc = new Calculator();
    }

    @Test
    public void addTest() {
        double testA = calc.add(2, 5);
        double testB = calc.add(2425, 24324);
        double testC = calc.add(12412.4, 9864.5);
        Assertions.assertEquals(7, testA);
        Assertions.assertEquals(26749, testB);
        Assertions.assertEquals(22276.9, testC);
    }

    @Test
    public void divideTest() {
        double testA = calc.divide(6, 2);
        double testB = calc.divide(100, 25);
        double testC = calc.divide(12783.6, 0);
        Assertions.assertEquals(3, testA);
        Assertions.assertEquals(4, testB);
        Assertions.assertEquals(22276.9, testC);         // Divisão por zero - ERRO
    }

    @Test
    public void sqrtTest() {
        double testA = calc.sqrt(16);
        double testB = calc.sqrt(-2);
        double testC = calc.sqrt(0);
        Assertions.assertEquals(4, testA);
        Assertions.assertEquals(0, testB);              // Raiz de negativo - ERRO
        Assertions.assertEquals(0, testC);
    }

    @AfterAll
    public static void close() {
        System.out.println("Fim dos testes!");
    }
}
