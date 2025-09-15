package ar.edu.utn.progra2.tp3.features;

import ar.edu.utn.progra2.tp3.core.Ejecutable;
import ar.edu.utn.progra2.tp3.domain.Gallina;
import ar.edu.utn.progra2.tp3.util.ContextColor;
import ar.edu.utn.progra2.tp3.util.UtilsColor;

import java.util.Scanner;

public class GestionGallinas implements Ejecutable {
    @Override
    public void execute() {
        // Definición de variables
        Scanner scanner = new Scanner(System.in);
        String idGallina;
        int huevosPuestos, edad;

        UtilsColor.imprimirBloque(ContextColor.WARNING, "Registro de Gallinas virtuales");

        // primer gallina
        UtilsColor.imprimirBloque(ContextColor.INFO, "Ingrese el ID de la PRIMERA gallina: ",'n');
        idGallina = scanner.nextLine();
        UtilsColor.imprimirBloque(ContextColor.INFO, "Ingrese la edad de la gallina: ",'n');
        edad = scanner.nextInt();
        UtilsColor.imprimirBloque(ContextColor.INFO, "Ingrese la cantidad de huevos puestos: ",'n');
        huevosPuestos = scanner.nextInt();
        scanner.nextLine();
        Gallina primerGallina = new Gallina(idGallina, huevosPuestos, edad);
        UtilsColor.imprimirBloque(ContextColor.INFO, "Estado inicial gallina UNO");
        primerGallina.mostrarEstado();

        // segunda gallina
        UtilsColor.imprimirBloque(ContextColor.INFO, "Ingrese el ID de la SEGUNDA gallina: ",'n');
        idGallina = scanner.nextLine();
        UtilsColor.imprimirBloque(ContextColor.INFO, "Ingrese la edad de la gallina: ",'n');
        edad = scanner.nextInt();
        UtilsColor.imprimirBloque(ContextColor.INFO, "Ingrese la cantidad de huevos puestos: ",'n');
        huevosPuestos = scanner.nextInt();
        scanner.nextLine();
        Gallina segundaGallina = new Gallina(idGallina, huevosPuestos, edad);
        UtilsColor.imprimirBloque(ContextColor.INFO, "Estado inicial gallina DOS");
        segundaGallina.mostrarEstado();

        // Simulación de acciones

        // Gallina UNO envejecer +2 poner huevos +3
        primerGallina.envejecer(2);
        primerGallina.ponerHuevo(3);

        // Gallina DOS envejecer +4 poner huevos +8
        segundaGallina.envejecer(4);
        segundaGallina.ponerHuevo(8);

        // Presentación resultados actualizados
        UtilsColor.imprimirEncabezado();
        UtilsColor.imprimirBloque(ContextColor.SUCCESS, "Estado FINAL gallina UNO");
        primerGallina.mostrarEstado();

        UtilsColor.imprimirBloque(ContextColor.SUCCESS, "Estado FINAL gallina DOS");
        segundaGallina.mostrarEstado();
    }
}
