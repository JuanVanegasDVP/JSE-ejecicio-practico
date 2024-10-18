package SAM;

import java.time.LocalDate;
import java.time.Period;
import java.util.function.BiFunction;
import java.util.function.Function;

public class VerificarEdad {

    public static void main(String[] args) {
        Function<Integer, String> addCeros = x -> x < 10 ? "0" + x : String.valueOf(x);

        TriFunction<Integer, Integer, Integer, LocalDate> parseDate =
                (day, month, year) -> LocalDate.parse(year + "-" +
                        addCeros.apply(month) + "-" + addCeros.apply(day));

        TriFunction<Integer, Integer, Integer, Integer> calculateAge =
                (day, month, year) -> Period.between(
                        parseDate.apply(day, month, year), LocalDate.now()
                ).getYears();

        BiFunction<Integer, Integer, Boolean> validateAge =
                (inputAge, calculatedAge) -> inputAge.equals(calculatedAge);

        Verificar verificarEdad = (nombre, edad, fechaNacimiento) -> {
            int edadCalculada = calculateAge.apply(fechaNacimiento.getDayOfMonth(),
                    fechaNacimiento.getMonthValue(),
                    fechaNacimiento.getYear());

            boolean esCorrecta = validateAge.apply(edad, edadCalculada);

            if (esCorrecta) {
                return "La fecha de nacimiento de " + nombre + " corresponde a la edad ingresada.";
            } else {
                return "La fecha de nacimiento de " + nombre + " no corresponde a la edad ingresada.";
            }
        };

        LocalDate fechaJuan = parseDate.apply(26, 3, 2006);
        String resultadoJuan = verificarEdad.verificar("Juan", 18, fechaJuan);
        System.out.println(resultadoJuan);

        LocalDate fechaAna = parseDate.apply(5, 1, 1993);
        String resultadoAna = verificarEdad.verificar("Jose", 40, fechaAna);
        System.out.println(resultadoAna);
    }

    // Definición de TriFunction como interfaz funcional
    @FunctionalInterface
    public interface TriFunction<T, U, V, R> {
        R apply(T t, U u, V v);
    }

    // Definición de la interfaz Verificar como SAM
    @FunctionalInterface
    public interface Verificar {
        String verificar(String nombre, int edad, LocalDate fechaNacimiento);
    }
}
