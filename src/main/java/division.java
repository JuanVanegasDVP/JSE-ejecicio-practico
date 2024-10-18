import java.math.BigDecimal;
import java.util.function.BinaryOperator;

public class division {
    public static void main(String[] args) {
        BinaryOperator<BigDecimal> dividir = (a, b) -> a.divide(b);

        BigDecimal num1 = new BigDecimal("20.0");
        BigDecimal num2 = new BigDecimal("4.0");

        BigDecimal resultado = dividir.apply(num1, num2);

        System.out.println("Resultado de la división exacta: " + resultado);
    }
}
