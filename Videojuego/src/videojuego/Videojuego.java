package videojuego;

public class Videojuego {
    public String nombre;
    public String genero;

    // Atributos con acceso por defecto (sin modificador de acceso)
    String version;
    boolean activo;

    // --- Métodos públicos ---
    public void mostrarInformacion() {
        System.out.println("Título: " + nombre);
        System.out.println("Género: " + genero);
        System.out.println("Versión: " + version);
        System.out.println("¿Está activo?: " + activo);
        System.out.println("---------------------------");
    }

    public void iniciar() {
        if (!activo) {
            activo = true;
            System.out.println("▶ Iniciando el videojuego: " + nombre);
        } else {
            System.out.println("⚠ El videojuego '" + nombre + "' ya está activo.");
        }
    }

    // --- Métodos con acceso por defecto (sin la palabra 'public' ni 'default') ---
    void cerrar() {
        if (activo) {
            activo = false;
            System.out.println("⏹ Cerrando el videojuego: " + nombre);
        } else {
            System.out.println("⚠ El videojuego '" + nombre + "' ya estaba cerrado.");
        }
    }

    void mostrarVersion() {
        System.out.println("ℹ La versión actual de '" + nombre + "' es: " + version);
    }
}
