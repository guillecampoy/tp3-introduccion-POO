# 📘 Trabajo Práctico 3 – Introducción a la Programación Orientada a Objetos

> **Cátedra:** Programación II  
> **Alumno:** Guillermo Campoy  
> **Docente:** Giuliano Espejo  
> **Año/Cuat.**: 2025 / 2C  
> **Lenguaje:** Java (>= 21)

---

## 🎯 Objetivo General
Comprender los fundamentos de la **Programación Orientada a Objetos (POO)** en Java, aplicando conceptos como:
- Clases y objetos
- Atributos y métodos
- Estado e identidad
- Encapsulamiento
- Modificadores de acceso
- Getters y setters
- Reutilización de código

---

## 📚 Marco Teórico
- **Clases y Objetos:** Representación de entidades (Ej: Estudiante, Mascota, Libro, Gallina, NaveEspacial).
- **Atributos y Métodos:** Propiedades y comportamientos.
- **Estado e Identidad:** Cada objeto mantiene su propio estado.
- **Encapsulamiento:** Uso de `private`, `public`, `protected` y métodos de acceso.
- **Getters y Setters:** Acceso controlado a atributos privados.
- **Reutilización de código:** Definición de clases reutilizables en múltiples contextos.

---

## 📝 Ejercicios Prácticos

### 1. Registro de Estudiantes
- Clase: `Estudiante`
- Atributos: `nombre`, `apellido`, `curso`, `calificacion`
- Métodos:
    - `mostrarInfo()`
    - `subirCalificacion(puntos)`
    - `bajarCalificacion(puntos)`
- **Tarea:** Instanciar un estudiante, mostrar info y modificar calificaciones.

---

### 2. Registro de Mascotas
- Clase: `Mascota`
- Atributos: `nombre`, `especie`, `edad`
- Métodos:
    - `mostrarInfo()`
    - `cumplirAnios()`
- **Tarea:** Crear mascota, mostrar información, simular paso del tiempo.

---

### 3. Encapsulamiento con la Clase Libro
- Clase: `Libro`
- Atributos privados: `titulo`, `autor`, `anioPublicacion`
- Métodos:
    - Getters para todos los atributos.
    - Setter con validación para `anioPublicacion`.
- **Tarea:** Crear libro, probar valores inválidos/válidos y mostrar info final.

---

### 4. Gestión de Gallinas en Granja Digital
- Clase: `Gallina`
- Atributos: `idGallina`, `edad`, `huevosPuestos`
- Métodos:
    - `ponerHuevo()`
    - `envejecer()`
    - `mostrarEstado()`
- **Tarea:** Crear dos gallinas, simular acciones y mostrar estado.

---

### 5. Simulación de Nave Espacial
- Clase: `NaveEspacial`
- Atributos: `nombre`, `combustible`
- Métodos:
    - `despegar()`
    - `avanzar(distancia)`
    - `recargarCombustible(cantidad)`
    - `mostrarEstado()`
- **Reglas:**
    - Validar combustible antes de avanzar.
    - Evitar sobrecarga al recargar.
- **Tarea:** Crear nave con 50 unidades de combustible, simular fallos y recargas.

---

## ✅ Conclusiones Esperadas
- Diferenciar **clases** y **objetos**.
- Aplicar **encapsulamiento** para proteger datos.
- Utilizar **getters/setters** para atributos privados.
- Implementar **métodos** que definan comportamientos.
- Gestionar correctamente **estado e identidad** de los objetos.
- Aplicar **buenas prácticas de POO** y reforzar el **pensamiento modular**.

---

✍️ **Autor:** Guillermo Campoy  
📅 **Año:** 2025