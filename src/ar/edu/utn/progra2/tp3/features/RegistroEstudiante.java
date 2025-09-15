package ar.edu.utn.progra2.tp3.features;

import ar.edu.utn.progra2.tp3.core.Ejecutable;
import ar.edu.utn.progra2.tp3.domain.Estudiante;
import ar.edu.utn.progra2.tp3.util.ContextColor;
import ar.edu.utn.progra2.tp3.util.UtilsColor;
import java.util.Scanner;

public class RegistroEstudiante implements Ejecutable {
    @Override
    public void execute() {
        // Definición de variables
        Scanner scanner = new Scanner(System.in);
        String nombre, apellido, curso;
        int calificacion, puntos;

        UtilsColor.imprimirBloque(ContextColor.WARNING, "Registro Estudiante");
        UtilsColor.imprimirBloque(ContextColor.INFO, "Ingrese nombre del estudiante: ",'n');
        nombre = scanner.nextLine();
        UtilsColor.imprimirBloque(ContextColor.INFO, "Ingrese apellido del estudiante: ",'n');
        apellido = scanner.nextLine();
        UtilsColor.imprimirBloque(ContextColor.INFO, "Ingrese curso del estudiante: ",'n');
        curso = scanner.nextLine();
        UtilsColor.imprimirBloque(ContextColor.INFO, "Ingrese calificación del estudiante: ",'n');
        calificacion = scanner.nextInt();
        scanner.nextLine();

        Estudiante estudiante = new Estudiante(nombre, apellido, curso, calificacion);

        //Mostrar info inicial
        UtilsColor.imprimirBloque(ContextColor.INFO, "\nInformación inicial del estudiante");
        estudiante.mostrarInfo();

        //Subir
        UtilsColor.imprimirBloque(ContextColor.INFO, "\nIngrese calificación para SUBIR nota: ",'n');
        puntos = scanner.nextInt();
        estudiante.subirCalificacion(puntos);

        //Bajar
        UtilsColor.imprimirBloque(ContextColor.INFO, "\nIngrese calificación para BAJAR nota: ",'n');
        puntos = scanner.nextInt();
        estudiante.bajarCalificacion(puntos);

        //Mostrado estado final
        UtilsColor.imprimirEncabezado();
        UtilsColor.imprimirBloque(ContextColor.SUCCESS, "\nInformación Final del estudiante");
        estudiante.mostrarInfo();
    }
}
