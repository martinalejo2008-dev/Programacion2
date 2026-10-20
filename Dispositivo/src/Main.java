public class Main {
    public static void main(String[] args) {
        System.out.println("Objetos creados al inicio: " + Dispositivo.getTotalCreados());

        Dispositivo d1 = new Dispositivo("Servidor", "Infraestructura");
        System.out.println("Objetos creados tras d1: " + Dispositivo.getTotalCreados());

        Dispositivo d2 = new Dispositivo("Router", "Redes");
        Dispositivo d3 = new Dispositivo("Monitor", "Periférico");

        System.out.println("Total final de objetos creados: " + Dispositivo.getTotalCreados());

        System.out.println("\n--- Lista de Dispositivos ---");
        System.out.println("Objeto 1 -> ID: " + d1.getId() + " | Nombre: " + d1.getNombre());
        System.out.println("Objeto 2 -> ID: " + d2.getId() + " | Nombre: " + d2.getNombre());
        System.out.println("Objeto 3 -> ID: " + d3.getId() + " | Nombre: " + d3.getNombre());
    }
}