import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Optionals {
    public static void main(String[] args) {
        List<String> nombres = getNames();

        List<String> nombresFiltrados = filtrarNombres(nombres, "Juan");
        imprimirNombres(nombresFiltrados);
    }

    public static List<String> getNames() {
        List<String> nombres = new ArrayList<>();
        nombres.add("Juan");
        nombres.add("María");
        nombres.add("Pedro");
        nombres.add("Ana");
        nombres.add("Juanita");
        return nombres;
    }

    public static List<String> filtrarNombres(List<String> nombres, String nombreBuscado) {
        return nombres.stream()
                .filter(nombre -> nombre.equals(nombreBuscado))
                .toList();
    }

    public static void imprimirNombres(List<String> nombres) {
        Optional<List<String>> optionalNombres = Optional.ofNullable(nombres);

        optionalNombres.ifPresent(n -> n.forEach(System.out::println));
    }
}
