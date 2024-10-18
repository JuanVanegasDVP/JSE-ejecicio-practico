package Libro;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;

public class ListaLibros {
    public static void main(String[] args) {
        Supplier<List<Libros>> librosSupplier = () -> Arrays.asList(
                new Libros("Libro 1", "cristiano", 10),
                new Libros("Libro 2", "ronaldo", 9),
                new Libros("Libro 3", "messi ", 8),
                new Libros(" Libro 4", "Orozco", 6)
        );


        List<Libros> listaLibros = librosSupplier.get();

        Predicate<Libros> esRecomendado = libro -> libro.getPuntaje() >= 7;

        UnaryOperator<Libros> mostrarMensaje = libro -> {
            if (esRecomendado.test(libro)) {
                System.out.println("El libro " + libro.getNombre() + " es recomendado 😊");
            }else {
                System.out.println("El libro " + libro.getNombre() + " no es recomendado");
            }
            return libro;
        };

        Consumer<List<Libros>> procesarLibros = lista -> {
            for (Libros libros : lista) {
                mostrarMensaje.apply(libros);
            }
        };

        procesarLibros.accept(listaLibros);
    }
}


