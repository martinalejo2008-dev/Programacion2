public class Dispositivo {
    private String nombre;
    private String tipo;
    private boolean activo;

    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public void setTipo(String tipo){
        this.tipo = tipo;
    }

    public void isActivo(boolean activo){
        this.activo = activo;
    }

    public String getNombre(){
        return nombre;
    }

    public String getTipo(){
        return tipo;
    }

    public boolean getActivo(){
        return activo;
    }
}
