import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Introduce tu primer nombre: ");
        String nombre = entrada.nextLine();

        System.out.print("Introduce tu apellido: ");
        String apellido = entrada.nextLine();

        System.out.println("Introduce tu fecha de nacimiento:");
        System.out.print("Día (DD): ");
        int dia = entrada.nextInt();

        System.out.print("Mes (MM): ");
        int mes = entrada.nextInt();

        System.out.print("Año (AAAA): ");
        int anio = entrada.nextInt();

        FrecuenciasCardiacas persona = new FrecuenciasCardiacas(nombre, apellido, dia, mes, anio);

        System.out.println("\n========================================");
        System.out.println("   REPORTE DE FRECUENCIA CARDIACA       ");
        System.out.println("========================================");
        System.out.printf("Nombre completo: %s %s%n", persona.getPrimerNombre(), persona.getApellido());
        System.out.printf("Fecha de nacimiento: %02d/%02d/%d%n",
                persona.getDiaNacimiento(), persona.calcularEdad());
        System.out.printf("Frecuencia cardiaca máxima: %d bpm%n", persona.calcularFrecuenciaCardiacaMaxima());
        System.out.printf("Rango de frecuencia cardiaca esperada: %s%n", persona.getFrecuenciaCardiacaEsperada());
        System.out.println("========================================");

        entrada.close();
    }
}