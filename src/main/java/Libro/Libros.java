package Libro;

public class Libros {
    public String nombre;
    public String autor;
    public int puntaje;



    public Libros(String nombre, String autor, int puntaje){
        this.nombre = nombre;
        this.autor = autor;
        this.puntaje = puntaje;
    }

    public String getAutor() {
        return autor;
    }

    public  String getNombre() {
        return nombre;
    }

    public int getPuntaje() {
        return puntaje;
    }

}
