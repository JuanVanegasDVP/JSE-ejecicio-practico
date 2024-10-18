import SAM.VerificarEdad;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class ListaDeFechas {

    public static void main(String[] args) {

        Function<Integer, String> addCeros = x -> x < 10 ? "0" + x : String.valueOf(x);

        VerificarEdad.TriFunction<Integer, Integer, Integer, LocalDate> parseDate =
                (day, month, year) -> LocalDate.parse(year + "-" +
                        addCeros.apply(month) + "-" + addCeros.apply(day));

        List<LocalDate> fechas = Arrays.asList(
                LocalDate.of(2024, 9, 17),
                LocalDate.of(2024, 1, 1),
                LocalDate.of(2024, 5, 21)
        );

        fechas.forEach(ListaDeFechas::mostrarFecha);
    }

    public static void mostrarFecha(LocalDate fecha) {
        String mensaje = "La fecha es " + fecha.getDayOfMonth() + " de " +
                fecha.getMonth() + " del " + fecha.getYear() + ".";
        System.out.println(mensaje);
    }
}
