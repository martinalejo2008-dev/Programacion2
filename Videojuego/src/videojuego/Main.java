package videojuego;

public class Main {
    public static void main(String[] args) {
        // Crear tres objetos diferentes usando 'new'
        Videojuego juego1 = new Videojuego();
        Videojuego juego2 = new Videojuego();
        Videojuego juego3 = new Videojuego();

        // Asignar valores diferentes a cada objeto
        juego1.nombre = "The Legend of Zelda";
        juego1.genero = "Aventura";
        juego1.version = "1.0.5";
        juego1.activo = false;

        juego2.nombre = "Super Mario Bros";
        juego2.genero = "Plataformas";
        juego2.version = "2.1.0";
        juego2.activo = true;

        juego3.nombre = "Minecraft";
        juego3.genero = "Sandbox";
        juego3.version = "1.20.4";
        juego3.activo = false;

        // Comprobar que cada objeto mantiene sus propios valores
        System.out.println("=== ESTADO INICIAL DE LOS VIDEOJUEGOS ===");
        juego1.mostrarInformacion();
        juego2.mostrarInformacion();
        juego3.mostrarInformacion();

        // Probar la independencia de los objetos modificando su estado
        System.out.println("=== PRUEBA DE ACCIONES (INICIAR/CERRAR) ===");
        juego1.iniciar();  // Cambia su estado a true
        juego2.cerrar();   // Cambia su estado a false
        juego3.iniciar();  // Cambia su estado a true

        // Verificar que los cambios solo afectaron a cada objeto individualmente
        System.out.println("\n=== ESTADO FINAL DE LOS VIDEOJUEGOS ===");
        juego1.mostrarInformacion();
        juego2.mostrarInformacion();
        juego3.mostrarInformacion();

        // Probar un método de acceso por defecto
        juego1.mostrarVersion();
    }
}
