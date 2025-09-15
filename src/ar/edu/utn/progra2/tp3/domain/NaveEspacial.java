package ar.edu.utn.progra2.tp3.domain;

import ar.edu.utn.progra2.tp3.util.ContextColor;
import ar.edu.utn.progra2.tp3.util.UtilsColor;

public class NaveEspacial {
    private String nombre;
    private double combustible;

    // Constante arbitraria capacidad máxima de combustible
    // Como no se indica que es un atributo, lo quitamos de la construcción del objeto
    // se impone de forma arbitraria esta cantidad para todos los objetos
    // utilizamos un booleando que se inicia en FALSO hasta que no se ejecuta el método despegue

    private final double maxCombustible = 100;
    private boolean enVuelo = false;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getCombustible() {
        return combustible;
    }

    public void setCombustible(double combustible) {
        if (getCombustible()+combustible>maxCombustible){
            UtilsColor.imprimirBloque(ContextColor.ERROR, "Exceso de combustible, se establece máximo");
            this.combustible = maxCombustible;
        } else {
            this.combustible += combustible;
        }
    }

    public NaveEspacial(String nombre, double combustible) {
        setNombre(nombre);
        setCombustible(combustible);
    }

    public void despegar(){
        if (getCombustible()>0){
            UtilsColor.imprimirBloque(ContextColor.SUCCESS, "DESPEGUE!!!!");
            enVuelo = true;
        } else {
            UtilsColor.imprimirBloque(ContextColor.ERROR, "No hay combustible :'(");
        }
    }

    // Se asume que se gasta el mismo combustible en proporción de avance
    // ejemplo una unidad de combustible cada una unidad de distancia
    // valida que la nave se encuentre en vuelo

    public void avanzar(double distancia) {
        if (getCombustible()>=distancia && enVuelo ){
            this.combustible = getCombustible() - distancia;
            UtilsColor.imprimirBloque(ContextColor.SUCCESS, "Suficiente combustible, avanzando la distancia de "+distancia);
        } else if (!enVuelo) {
            UtilsColor.imprimirBloque(ContextColor.ERROR, "Nave no está en vuelo");
        } else {
            UtilsColor.imprimirBloque(ContextColor.ERROR, "No hay suficeinte combustible para recorrer la distancia "+distancia);
        }
    }

    public void recargarCombustible(double cantidad) {
       setCombustible(cantidad);
    }

    public void mostrarEstado(){
        UtilsColor.imprimirBloque(ContextColor.INFO, "Nombre nave: "+getNombre() + "\nCombustible: "+getCombustible());
    }
}
