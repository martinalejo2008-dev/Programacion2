package Modulo;

public class Main {
    public static void main(String[] args) {
        // Crear tres objetos diferentes: Login, Inventario y Reportes
        Modulo login = new Modulo();
        Modulo inventario = new Modulo();
        Modulo reportes = new Modulo();

        // Asignar valores diferentes a cada objeto
        login.nombre = "Login";
        login.lenguaje = "Java";
        login.version = "1.0.0";
        login.terminado = false;

        inventario.nombre = "Inventario";
        inventario.lenguaje = "Python";
        inventario.version = "2.3.1";
        inventario.terminado = false;

        reportes.nombre = "Reportes";
        reportes.lenguaje = "C#";
        reportes.version = "3.0.2";
        reportes.terminado = false;

        // Mostrar estado inicial
        System.out.println("=== ESTADO INICIAL DE LOS MÓDULOS ===");
        login.mostrarInformacion();
        inventario.mostrarInformacion();
        reportes.mostrarInformacion();

        // Marcar solo uno como terminado
        System.out.println("=== MARCANDO EL MÓDULO 'LOGIN' COMO TERMINADO ===");
        login.marcarTerminado();

        // Verificar que los cambios solo afectaron a 'login'
        System.out.println("\n=== ESTADO FINAL DE LOS MÓDULOS ===");
        login.mostrarInformacion();
        inventario.mostrarInformacion();
        reportes.mostrarInformacion();

        // Probar métodos de acceso por defecto
        login.mostrarEstado();
        inventario.mostrarEstado();
        reportes.mostrarVersion();
    }
}
