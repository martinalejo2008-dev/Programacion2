public class ClaseEmpleado {

    private String Primernombre;
    private String Apellidopaterno;
    private double Salariomensual;

    public ClaseEmpleado(String Primernombre) {
        this.Primernombre = Primernombre;
    }

    public ClaseEmpleado(String Primernombre,String Apellidopaterno,double Salariomensual) {
        this.Primernombre = Primernombre;
        this.Apellidopaterno=Apellidopaterno;
        setSalariomensual(Salariomensual);
    }

    public String getPrimernombre() {
        return Primernombre;
    }

    public void setPrimernombre(String primernombre) {
        Primernombre = primernombre;
    }

    public String getApellidopaterno() {
        return Apellidopaterno;
    }

    public void setApellidopaterno(String apellidopaterno) {
        Apellidopaterno = apellidopaterno;
    }

    public double getSalariomensual() {
        return Salariomensual;
    }

    public void setSalariomensual(double salariomensual) {
        if (salariomensual > 0){
            Salariomensual = salariomensual;
        }

    }
}
