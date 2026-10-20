public class CanalTelemetria {
    private int identificador;
    private String nombre;
    private double valormedido;
    private static int contador=0;

    public CanalTelemetria(int identificador, String nombre){
        if(identificador>=0 && !nombre.isBlank() && nombre==null){
            this.identificador=identificador;
            this.nombre=nombre;
            this.valormedido=-1;
            contador+=1;
        }
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String obtenerEstadoMedicion() {
        if(this.valormedido>=0 && this.valormedido<=100){
            return "Última medición: "+this.valormedido;
        }
        return "Sin medidciones";
    }

    public boolean registrarMedicion(double valormedido) {
        if(valormedido>=0 && valormedido<=100) {
            this.valormedido = valormedido;
            return true;
        }
        return false;
    }

    public int getIdentificador() {
        return identificador;
    }

    public int getContador() {
        return contador;
    }
}
