import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese numero de pieza: ");
        String numeropieza = scanner.nextLine();

        System.out.println("Ingrese la descripcion de la pieza: ");
        String descripcionpieza = scanner.nextLine();

        System.out.println("Ingrese cantidad de profucto: ");
        int cantidadproducto= scanner.nextInt();

        System.out.println("Ingrse el precio del producto");
        double precioproducto=scanner.nextDouble();

        PruebaFactura factura1= new PruebaFactura(numeropieza,descripcionpieza,cantidadproducto,precioproducto);


        System.out.println("numero de pieza:" + factura1.getNumeropieza());
        System.out.println("la pieza es:" + factura1.getDescripcionpieza());
        System.out.println("la cantidad es: $" + factura1.getCantidadproducto());
        System.out.println("el precio es:$ " + factura1.getPrecioproducto());

        scanner.close();

    }

}
