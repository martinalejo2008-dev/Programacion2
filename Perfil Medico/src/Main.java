import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Ingrese el primer nombre: ");
        String primerNombre = entrada.nextLine();

        System.out.print("Ingrese el apellido: ");
        String apellido = entrada.nextLine();

        System.out.print("Ingrese el sexo: ");
        String sexo = entrada.nextLine();

        System.out.print("Ingrese el día de nacimiento: ");
        int dia = entrada.nextInt();

        System.out.print("Ingrese el mes de nacimiento: ");
        int mes = entrada.nextInt();

        System.out.print("Ingrese el año de nacimiento: ");
        int anioNac = entrada.nextInt();

        System.out.print("Ingrese el año actual: ");
        int anioActual = entrada.nextInt();

        System.out.print("Ingrese la altura en centímetros: ");
        double altura = entrada.nextDouble();

        System.out.print("Ingrese el peso en kilogramos: ");
        double peso = entrada.nextDouble();


        PerfilMedico miPerfil = new PerfilMedico(primerNombre, apellido, sexo, dia, mes, anioNac, altura, peso);

        // Imprimir información personal
        System.out.println("\n--- INFORMACIÓN DEL PERFIL MÉDICO ---");
        System.out.println("Primer nombre: " + miPerfil.getPrimerNombre());
        System.out.println("Apellido: " + miPerfil.getApellido());
        System.out.println("Sexo: " + miPerfil.getSexo());
        System.out.println("Fecha de nacimiento: " + miPerfil.getDiaNacimiento() + "/" + miPerfil.getMesNacimiento() + "/" + miPerfil.getAnioNacimiento());
        System.out.println("Altura: " + miPerfil.getAltura() + " cm");
        System.out.println("Peso: " + miPerfil.getPeso() + " kg");


        System.out.println("\n--- RESULTADOS DE SALUD ---");
        System.out.println("Edad: " + miPerfil.calcularEdad(anioActual) + " años");
        System.out.println("Frecuencia cardiaca máxima: " + miPerfil.calcularFrecuenciaCardiacaMaxima(anioActual) + " lpm");
        System.out.println("Rango de frecuencia cardiaca esperada: " + miPerfil.calcularRangoFrecuenciaCardiaca(anioActual));
        System.out.printf("Índice de Masa Corporal (BMI): %.2f%n", miPerfil.calcularBMI());


        System.out.println("\n--- VALORES DE BMI ---");
        System.out.println("Bajo peso: menos de 18.5");
        System.out.println("Normal: entre 18.5 y 24.9");
        System.out.println("Sobrepeso: entre 25 y 29.9");
        System.out.println("Obeso: 30 o más");

        entrada.close();
    }
}
