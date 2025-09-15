package ar.edu.utn.progra2.tp3.features;

import ar.edu.utn.progra2.tp3.core.Ejecutable;
import ar.edu.utn.progra2.tp3.domain.Libro;
import ar.edu.utn.progra2.tp3.util.ContextColor;
import ar.edu.utn.progra2.tp3.util.UtilsColor;

import java.util.Scanner;

public class EncapsulamientoClaseLibro implements Ejecutable {
    @Override
    public void execute() {

        // Definición de variables
        Scanner scanner = new Scanner(System.in);
        String titulo, autor;
        int anioPublicacion;

        // Lectura de datos
        UtilsColor.imprimirBloque(ContextColor.WARNING, "Registro de Libros - Encapsulamiento");
        UtilsColor.imprimirBloque(ContextColor.INFO, "Ingrese el título del libro: ",'n');
        titulo = scanner.nextLine();
        UtilsColor.imprimirBloque(ContextColor.INFO, "Ingrese el autor del libro: ",'n');
        autor = scanner.nextLine();
        UtilsColor.imprimirBloque(ContextColor.INFO, "Ingrese año de publicación del libro: ",'n');
        anioPublicacion = scanner.nextInt();
        scanner.nextLine();

        Libro libro = new Libro(titulo, autor, anioPublicacion);

        UtilsColor.imprimirBloque(ContextColor.INFO, "Prueba de valores válidos para año de publicación");

        //Caso inválido
        UtilsColor.imprimirBloque(ContextColor.INFO, "Ingrese un año INVALIDO de publicación: ",'n');
        anioPublicacion = scanner.nextInt();
        libro.setAnioPublicacion(anioPublicacion);

        //Caso válido
        UtilsColor.imprimirBloque(ContextColor.INFO, "Ingrese un año VALIDO de publicación: ",'n');
        anioPublicacion = scanner.nextInt();
        libro.setAnioPublicacion(anioPublicacion);

        //Listar estado interno del libro
        libro.mostrarInfo();
    }
}
