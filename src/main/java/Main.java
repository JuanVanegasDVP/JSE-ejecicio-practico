import Libro.ListaLibros;
import SAM.VerificarEdad;

public class Main {
    public static void main(String[] args) {

        System.out.println("Prueba de PersonaMutable:");
        PersonaMutable personaMutable = new PersonaMutable("Juan", 18);
        System.out.println("Nombre inicial: " + personaMutable.getNombre());
        System.out.println("Edad inicial: " + personaMutable.getEdad());

        personaMutable.setNombre("diana");
        personaMutable.setEdad(25);

        System.out.println("Nombre modificado: " + personaMutable.getNombre());
        System.out.println("Edad modificada: " + personaMutable.getEdad());

        System.out.println("\nPrueba de PersonaInmutable:");
        PersonaInmutable personaInmutable = new PersonaInmutable("Jorge", 40);
        System.out.println("Nombre: " + personaInmutable.getNombre());
        System.out.println("Edad: " + personaInmutable.getEdad());



        System.out.println("\n------------------Ejercicio 2 y 3----------------");

        int numero = 2;
        Potencia potencia = new Potencia(numero);

        System.out.println("\n-----------------------Ejercicio 4--------------------");
        ListaLibros.main(args);

        System.out.println("\n-------------------Ejercicio 5-------------------------");
        division.main(args);

        System.out.println("\n ----------------------Ejercicio 6----------------------");
        VerificarEdad.main(args);

        System.out.println("\n ---------------------Ejercicio 7----------------------");
        ListaDeFechas.main(args);

        System.out.println("\n ---------------------Ejercicio 8------------------------");
        Calculadora.main(args);

        System.out.println("\n-------------------Ejercicio 9-----------------------");
        Optionals.main(args);

    }
}

