public class Main{
    public static void main(){
        Fecha fecha1 = new Fecha(21,8,2015);
        Fecha fecha2 = new Fecha(19,4,2027);
        Fecha fecha3 = new Fecha(8,12,1935);

        System.out.println("Fecha 1");
        System.out.println("dia "+fecha1.getDia());
        System.out.println("mes "+fecha1.getMes());
        System.out.println("año "+fecha1.getAño());

        System.out.println("Fecha 2");
        System.out.println("dia "+fecha2.getDia());
        System.out.println("mes "+fecha2.getMes());
        System.out.println("año "+fecha2.getAño());


        System.out.println("Fecha 3");
        System.out.println("dia "+fecha3.getDia());
        System.out.println("mes "+fecha3.getMes());
        System.out.println("año "+fecha3.getAño());


        fecha1.setDia(15);
        fecha1.setMes(3);
        fecha1.setAño(2020);

        fecha2.setDia(17);
        fecha2.setMes(6);
        fecha2.setAño(2018);

        fecha3.setDia(1);
        fecha3.setMes(1);
        fecha3.setAño(1990);

        System.out.println("Fecha 1 modificada");
        fecha1.mostrarFecha();

        System.out.println("Fecha 2 modificada");
        fecha2.mostrarFecha();

        System.out.println("Fecha 3 modificada");
        fecha3.mostrarFecha();
    }
}