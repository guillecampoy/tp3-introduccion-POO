package java.ar.edu.utn.progra2.tp3.app;

import java.ar.edu.utn.progra2.tp3.core.Ejecutable;
import java.ar.edu.utn.progra2.tp3.features.*;
import java.util.Scanner;

/*
Clase main, menú utilizada en el resto de las entregas
 */

public class Menu {
    public static class Main {
        private static final Scanner scanner = new Scanner(System.in);
        public static void main(String[] args) {
            int opcion;
            do {
                mostrarMenu();
                opcion = leerOpcion();
                Ejecutable ejercicio = obtenerEjercicio(opcion);
                if (ejercicio != null) {
                    ejercicio.execute();
                } else if (opcion != 0) {
                    System.out.println("Opción no válida");
                }
                if (opcion != 0) {
                    System.out.println("Presiona Enter para continuar...");
                    scanner.nextLine();
                }

            }
            while (opcion != 0);
            System.out.println("Chau!");
            scanner.close();
        }

        private static void mostrarMenu() {
            System.out.println("\n===============================================");
            System.out.println("   Trabajo Práctico 3 - Introducción a la POO");
            System.out.println("=================================================");
            System.out.println("1. Registro de estudiantes");
            System.out.println("2. Registro de mascotas");
            System.out.println("3. Encapsulamiento con clase Libro");
            System.out.println("4. Gestión de gallinas en granja digital");
            System.out.println("5. Simulación de nave espacial");
            System.out.println("0. Salir");
            System.out.print("Seleccione una opción: ");
        }

        private static int leerOpcion () {
            try {
                return Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                return -1;
            }
        }

        private static Ejecutable obtenerEjercicio(int opcion) {
            return switch (opcion) {
                case 1  -> new RegistroEstudiante();
                case 2  -> new RegistroMascota();
                case 3  -> new EncapsulamientoClaseLibro();
                case 4  -> new GestionGallinas();
                case 5  -> new SimulaciónNaveEspacial();
                default -> null;
            };
        }
    }
}
