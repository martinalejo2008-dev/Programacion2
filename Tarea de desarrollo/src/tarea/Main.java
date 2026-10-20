package tarea;

public class Main {
    public static void main(String[] args) {
        // Crear tres tareas diferentes
        Tarea tarea1 = new Tarea();
        Tarea tarea2 = new Tarea();
        Tarea tarea3 = new Tarea();

        // Asignar valores diferentes a cada objeto
        tarea1.titulo = "Diseñar base de datos";
        tarea1.responsable = "Ana López";
        tarea1.horasEstimadas = 8.5;
        tarea1.completada = false;

        tarea2.titulo = "Crear interfaz de usuario";
        tarea2.responsable = "Carlos Ruiz";
        tarea2.horasEstimadas = 12.0;
        tarea2.completada = false;

        tarea3.titulo = "Implementar autenticación";
        tarea3.responsable = "María García";
        tarea3.horasEstimadas = 6.0;
        tarea3.completada = false;

        // Mostrar estado inicial
        System.out.println("=== ESTADO INICIAL DE LAS TAREAS ===");
        tarea1.mostrarInformacion();
        tarea2.mostrarInformacion();
        tarea3.mostrarInformacion();

        // Completar SOLAMENTE UNA tarea (la tarea1)
        System.out.println("=== COMPLETANDO SOLO LA TAREA 1 ===");
        tarea1.completar();

        // Verificar que los cambios solo afectaron a tarea1
        System.out.println("\n=== ESTADO FINAL DE LAS TAREAS ===");
        tarea1.mostrarInformacion();
        tarea2.mostrarInformacion();
        tarea3.mostrarInformacion();

        // Probar métodos de acceso por defecto
        tarea1.mostrarEstado();
        tarea2.mostrarEstado();
        tarea3.mostrarResponsable();
    }
}
