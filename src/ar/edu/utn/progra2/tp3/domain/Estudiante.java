package ar.edu.utn.progra2.tp3.domain;

import ar.edu.utn.progra2.tp3.util.ContextColor;
import ar.edu.utn.progra2.tp3.util.UtilsColor;

public class Estudiante {
    private String nombre;
    private String apellido;
    private String curso;
    private int calificacion;

    public Estudiante(String nombre, String apellido, String curso, int calificacion) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.curso = curso;
        setCalificacion(calificacion);
    }

    public void mostrarInfo(){
        UtilsColor.imprimirBloque(ContextColor.INFO, "Nombre: "+nombre
                +"\nApellido: "+apellido + "\nCurso: "+curso+"\nCalificación: "+calificacion );
    }

    // Sube con validación reutilizando el setter
    public void subirCalificacion(int puntos) {
        if (puntos < 0) {
            UtilsColor.imprimirBloque(ContextColor.WARNING,
                    "Puntos negativos en 'subir'; no se modifica la calificación.");
            return;
        }
        int previa = calificacion;
        setCalificacion(calificacion + puntos);

        UtilsColor.imprimirBloque(ContextColor.SUCCESS,
                "Se subió calificación. Antes: " + previa + " | Ahora: " + calificacion);
    }


    // Baja con validación reutilizando el setter
    public void bajarCalificacion(int puntos) {
        if (puntos < 0) {
            UtilsColor.imprimirBloque(ContextColor.WARNING,
                    "Puntos negativos en 'bajar'; no se modifica la calificación.");
            return;
        }
        int previa = calificacion;
        setCalificacion(calificacion - puntos);

        UtilsColor.imprimirBloque(ContextColor.ERROR,
                "Se bajó calificación. Antes: " + previa + " | Ahora: " + calificacion);
    }

    // Setter centralizado con clamp 0..10 con esto evitamos calificaciones con lógica errónea, es una estretegia simple
    // pero efectiva para el caso práctico

    public void setCalificacion(int nueva) {
        int anterior = this.calificacion;
        this.calificacion = Math.max(0, Math.min(10, nueva));

        if (this.calificacion != nueva) {
            UtilsColor.imprimirBloque(ContextColor.WARNING,
                    "La calificación solicitada (" + nueva + ") fue ajustada al rango [0..10]. Actual: " + this.calificacion);
        } else if (anterior != this.calificacion) {
            UtilsColor.imprimirBloque(ContextColor.INFO,
                    "Calificación actualizada a: " + this.calificacion);
        }
    }
}
