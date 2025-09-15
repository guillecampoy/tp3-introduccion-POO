package ar.edu.utn.progra2.tp3.features;

import ar.edu.utn.progra2.tp3.core.Ejecutable;
import ar.edu.utn.progra2.tp3.domain.NaveEspacial;
import ar.edu.utn.progra2.tp3.util.ContextColor;
import ar.edu.utn.progra2.tp3.util.UtilsColor;

import java.util.Scanner;

public class SimulaciónNaveEspacial implements Ejecutable {
    @Override
    public void execute() {

        // Definición de variables
        Scanner scanner = new Scanner(System.in);
        String nombre;
        double combustible;

        UtilsColor.imprimirBloque(ContextColor.WARNING, "Simulación de nave espacial");

        // Construcción inicial de la nave
        UtilsColor.imprimirBloque(ContextColor.INFO, "\nIngrese el nombre de la nave: ",'n');
        nombre = scanner.nextLine();
        UtilsColor.imprimirBloque(ContextColor.INFO, "Ingrese cantidad de combustible: ",'n');
        combustible = scanner.nextDouble();
        scanner.nextLine();

        NaveEspacial nave = new NaveEspacial(nombre, combustible);

        // Pruebas de estados

        // Prueba despegue

        // Intento avance sin despegar
        UtilsColor.imprimirBloque(ContextColor.INFO, "\nIntento avanzar 10, sin despegar");
        nave.avanzar(10);

        // Despegue sin combustible suficiente
        UtilsColor.imprimirBloque(ContextColor.INFO, "\nIntento avanzar 50, sin combustible suficiente");
        nave.mostrarEstado();
        nave.despegar();
        nave.avanzar(50);

        // Recarga y avance (el objeto ya contiene estado despegue = true)
        UtilsColor.imprimirBloque(ContextColor.INFO, "\nRecarga (40) + Avance");
        nave.recargarCombustible(40);
        nave.mostrarEstado();
        nave.avanzar(50);

        // Estado actual de la nave
        UtilsColor.imprimirBloque(ContextColor.SUCCESS, "\nEstado actual de la nave");
        nave.mostrarEstado();



    }
}
