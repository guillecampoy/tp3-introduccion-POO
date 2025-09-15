package ar.edu.utn.progra2.tp3.features;

import ar.edu.utn.progra2.tp3.core.Ejecutable;
import ar.edu.utn.progra2.tp3.domain.Mascota;
import ar.edu.utn.progra2.tp3.util.ContextColor;
import ar.edu.utn.progra2.tp3.util.UtilsColor;

import java.util.Scanner;

public class RegistroMascota implements Ejecutable {
    @Override
    public void execute() {
        // Definición de variables
        Scanner scanner = new Scanner(System.in);
        String nombre, especie;
        int edad;

        // Lectura de datos
        UtilsColor.imprimirBloque(ContextColor.WARNING, "Registro de Mascotas");
        UtilsColor.imprimirBloque(ContextColor.INFO, "Ingrese nombre de la mascota: ",'n');
        nombre = scanner.nextLine();
        UtilsColor.imprimirBloque(ContextColor.INFO, "Ingrese la especie de la mascota: ",'n');
        especie = scanner.nextLine();
        UtilsColor.imprimirBloque(ContextColor.INFO, "Ingrese la edad de la mascota: ",'n');
        edad = scanner.nextInt();
        scanner.nextLine();

        Mascota mascota = new Mascota(nombre, especie, edad);

        //Mostrar información inicial
        UtilsColor.imprimirBloque(ContextColor.INFO, "\nInformación de la macota");
        mascota.mostrarInfo();

        // uso de método incrementar edad
        mascota.cumplirAnios();

        // Estado final
        UtilsColor.imprimirEncabezado();
        UtilsColor.imprimirBloque(ContextColor.SUCCESS, "\nInformación Final de la mascota");
        mascota.mostrarInfo();
    }
}
