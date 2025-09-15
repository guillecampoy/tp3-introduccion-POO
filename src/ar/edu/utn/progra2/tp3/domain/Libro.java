package ar.edu.utn.progra2.tp3.domain;

import ar.edu.utn.progra2.tp3.util.ContextColor;
import ar.edu.utn.progra2.tp3.util.UtilsColor;

import java.time.Year;

public class Libro {
    private String titulo;
    private String autor;
    private int anioPublicacion;


    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getAnioPublicacion() {
        return anioPublicacion;
    }

    // Validación básica para año de edición
    // en este caso puede poner 1 y sería "válido"
    // Se podría indicar por ejemplo año > a 1440 año aproximado donde se creó la imprenta moderna (Gutenberg)
    // funete: https://es.wikipedia.org/wiki/Imprenta

    public void setAnioPublicacion(int anioPublicacion) {

        // año actual del sistema
        int actual = Year.now().getValue();

        int previo = this.anioPublicacion;

        if (anioPublicacion < 0 || anioPublicacion > actual) {
            UtilsColor.imprimirBloque(
                    ContextColor.ERROR,
                    "Año inválido: " + anioPublicacion +
                            ". Debe estar entre 0 y " + actual + ". Se conserva: " + previo
            );
            //Si hay error no lo reemplaza
            return;
        }

        this.anioPublicacion = anioPublicacion;
        UtilsColor.imprimirBloque(
                ContextColor.INFO,
                "Año de publicación actualizado a: " + this.anioPublicacion
        );
    }

    public Libro(String titulo, String autor, int anioPublicacion) {
        this.titulo = titulo;
        this.autor = autor;
        setAnioPublicacion(anioPublicacion);
    }

    public void mostrarInfo(){
        UtilsColor.imprimirBloque(ContextColor.INFO, "Título: "+titulo + "\nAutor: "+autor+"\nAño publicación: "+anioPublicacion );
    }
}
