package tarea;

public class Tarea {
    // Atributos públicos
    public String titulo;
    public String responsable;

    // Atributos con acceso por defecto
    double horasEstimadas;
    boolean completada;

    // --- Métodos públicos ---
    public void mostrarInformacion() {
        System.out.println("Tarea: " + titulo);
        System.out.println("Responsable: " + responsable);
        System.out.println("Horas estimadas: " + horasEstimadas);
        System.out.println("¿Completada?: " + completada);
        System.out.println("---------------------------");
    }

    public void completar() {
        if (!completada) {
            completada = true;
            System.out.println("✔ La tarea '" + titulo + "' ha sido completada.");
        } else {
            System.out.println("⚠ La tarea '" + titulo + "' ya estaba completada.");
        }
    }

    // --- Métodos con acceso por defecto ---
    void mostrarResponsable() {
        System.out.println("👤 Responsable de '" + titulo + "': " + responsable);
    }

    void mostrarEstado() {
        if (completada) {
            System.out.println("✅ La tarea '" + titulo + "' está COMPLETADA.");
        } else {
            System.out.println("⏳ La tarea '" + titulo + "' está PENDIENTE.");
        }
    }
}
