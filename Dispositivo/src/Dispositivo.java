public class Dispositivo {
    private int id;
    private String nombre;
    private String tipo;
    private boolean activo;
    private static int contador = 0;

    public Dispositivo(String nombre, String tipo) {
        contador++;
        this.id = contador;
        setNombre(nombre);
        this.tipo = tipo;
        this.activo = false;
    }

    public static int getTotalCreados() {
        return contador;
    }

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public boolean isActivo() {
        return activo;
    }

    public void setNombre(String nombre) {
        if (nombre != null && !nombre.trim().isEmpty()) {
            this.nombre = nombre;
        } else {
            System.out.println("Error: Nombre inválido.");
        }
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void setActivo(boolean activo) {
        this.activo = activo;
    }
}
