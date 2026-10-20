package Modulo;

public class Modulo {
    // Atributos públicos
    public String nombre;
    public String lenguaje;

    // Atributos con acceso por defecto
    String version;
    boolean terminado;

    // --- Métodos públicos ---
    public void mostrarInformacion() {
        System.out.println("Módulo: " + nombre);
        System.out.println("Lenguaje: " + lenguaje);
        System.out.println("Versión: " + version);
        System.out.println("¿Terminado?: " + terminado);
        System.out.println("---------------------------");
    }

    public void marcarTerminado() {
        if (!terminado) {
            terminado = true;
            System.out.println("✅ El módulo '" + nombre + "' ha sido marcado como terminado.");
        } else {
            System.out.println("⚠ El módulo '" + nombre + "' ya estaba terminado.");
        }
    }

    // --- Métodos con acceso por defecto ---
    void mostrarEstado() {
        if (terminado) {
            System.out.println("📌 Estado del módulo '" + nombre + "': FINALIZADO");
        } else {
            System.out.println("🔧 Estado del módulo '" + nombre + "': EN DESARROLLO");
        }
    }

    void mostrarVersion() {
        System.out.println("ℹ La versión del módulo '" + nombre + "' es: " + version);
    }
}
