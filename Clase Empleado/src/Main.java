import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ClaseEmpleado empleado1= new ClaseEmpleado("mario", "Mendez",1000);
        ClaseEmpleado empleado2= new ClaseEmpleado("Alejandro","Jimenz",1500);

        System.out.println("Nombre:" + empleado1.getPrimernombre());
        System.out.println("Nombre paterno:" + empleado1.getApellidopaterno());
        System.out.println("Mensual:" + empleado1.getSalariomensual());
        System.out.println("Anual:"  + (empleado1.getSalariomensual() *12 ));

        System.out.println("Nombre:" + empleado2.getPrimernombre());
        System.out.println("Nombre paterno:" + empleado2.getApellidopaterno());
        System.out.println("Mensual:"  + empleado2.getSalariomensual());
        System.out.println("Anual:"  + (empleado2.getSalariomensual() *12 ));








    }
}