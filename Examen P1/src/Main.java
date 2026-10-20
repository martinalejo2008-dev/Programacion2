public class Main{
    public static void main(){
        CanalTelemetria canal1= new CanalTelemetria(1,"Temperatura");
        System.out.println(canal1.obtenerEstadoMedicion());

        canal1.registrarMedicion(45);
        System.out.println(canal1.obtenerEstadoMedicion());

        canal1.registrarMedicion(120);
        System.out.println(canal1.obtenerEstadoMedicion());

        canal1.registrarMedicion(0);
        System.out.println(canal1.obtenerEstadoMedicion());
    }
}