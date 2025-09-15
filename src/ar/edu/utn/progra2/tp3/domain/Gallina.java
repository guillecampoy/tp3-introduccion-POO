package ar.edu.utn.progra2.tp3.domain;

import ar.edu.utn.progra2.tp3.util.ContextColor;
import ar.edu.utn.progra2.tp3.util.UtilsColor;

public class Gallina {
    private String idGallina;
    private int huevosPuestos, edad;


    public String getIdGallina() {
        return idGallina;
    }

    public void setIdGallina(String idGallina) {
        this.idGallina = idGallina;
    }

    public int getHuevosPuestos() {
        return huevosPuestos;
    }

    public void setHuevosPuestos(int huevosPuestos) {
        this.huevosPuestos = huevosPuestos;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void mostrarEstado(){
        UtilsColor.imprimirBloque(ContextColor.INFO, "Id gallina: "+idGallina + "\nEdad: "+edad+"\nHuevos puestos: "+huevosPuestos );
    }

    public Gallina(String idGallina, int huevosPuestos, int edad) {
        this.idGallina = idGallina;
        this.huevosPuestos = huevosPuestos;
        this.edad = edad;
    }

    public void ponerHuevo (int cantHuevos) {
        this.setHuevosPuestos(this.getHuevosPuestos() + cantHuevos);
    }

    public void envejecer(int cantAnios) {
        this.setEdad(this.getEdad() + cantAnios);
    }
}
