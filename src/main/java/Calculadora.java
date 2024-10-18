import java.util.function.DoubleUnaryOperator;

public class Calculadora {
    private double acumulado;

    public Calculadora(double valorInicial) {
        this.acumulado = valorInicial;
    }

    private Calculadora aplicarOperacion(DoubleUnaryOperator operacion) {
        acumulado = operacion.applyAsDouble(acumulado);
        System.out.println("Acumulado: " + acumulado);
        return this;
    }

    public Calculadora sumar(double valor) {
        return aplicarOperacion(ac -> ac + valor);
    }

    public Calculadora restar(double valor) {
        return aplicarOperacion(ac -> ac - valor);
    }

    public Calculadora multiplicar(double valor) {
        return aplicarOperacion(ac -> ac * valor);
    }

    public double valor() {
        System.out.println("Valor final: " + acumulado);
        return acumulado;
    }

    public static void main(String[] args) {
        new Calculadora(10)
                .sumar(5)
                .restar(2)
                .multiplicar(3)
                .valor();
    }
}
