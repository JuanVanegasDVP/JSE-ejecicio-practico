import java.util.function.Function;
import java.util.function.Predicate;

public class Potencia {
    Function<Integer, Integer> calcularPotencia = x -> x * x;

    Predicate<Integer> esPar = numero -> numero % 2 == 0;


    public Potencia(int numero) {

        int resultado = calcularPotencia.apply(numero);
        System.out.println("La potencia de " + numero + " es: " + resultado);

        if (esPar.test(resultado)) {
            System.out.println("El resultado " + resultado + " es: Par");
        } else {
            System.out.println("El resultado " + resultado + " es: Impar");
        }
    }
}
