package ar.edu.utn.progra2.tp3.domain;

import ar.edu.utn.progra2.tp3.util.ContextColor;
import ar.edu.utn.progra2.tp3.util.UtilsColor;

public class Mascota {
    private String nombre;
    private String especie;
    private int edad;

    public String getEspecie() {
        return especie;
    }
    public int getEdad() {
        return edad;
    }
    public String getNombre() {
        return nombre;
    }

    private void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setEspecie(String especie) {
        this.especie = especie;
    }
    public void setEdad(int edad) {
        this.edad = edad;
    }

    public Mascota(String nombre, String especie, int edad) {
        setNombre(nombre);
        setEspecie(especie);
        setEdad(edad);
    }

    public void mostrarInfo(){
        UtilsColor.imprimirBloque(ContextColor.INFO, "Nombre: "+nombre + "\nEspecie: "+especie+"\nEdad: "+edad );
    }

    public void cumplirAnios()  {
        setEdad(getEdad()+1);
    }

}
