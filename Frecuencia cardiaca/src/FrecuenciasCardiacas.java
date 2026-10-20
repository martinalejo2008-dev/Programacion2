import java.time.LocalDate;
import java.time.Period;

public class FrecuenciasCardiacas {
    private String primerNombre;
    private String apellido;
    private int mesNacimiento;
    private int diaNacimiento;
    private int añoNacimiento;

    public FrecuenciasCardiacas(String primerNombre, String apellido, int diaNacimiento, int mesNacimiento, int añoNacimiento) {
        this.primerNombre = primerNombre;
        this.apellido = apellido;
        this.diaNacimiento = diaNacimiento;
        this.mesNacimiento = mesNacimiento;
        this.añoNacimiento = añoNacimiento;
    }

    public void setPrimerNombre(String primerNombre) {
        this.primerNombre = primerNombre;
    }

    public String getPrimerNombre() {
        return primerNombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getApellido() {
        return apellido;
    }

    public void setDiaNacimiento(int diaNacimiento) {
        this.diaNacimiento = diaNacimiento;
    }

    public int getDiaNacimiento() {
        return diaNacimiento;
    }

    public void setMesNacimiento(int mesNacimiento) {
        this.mesNacimiento = mesNacimiento;
    }

    public int getMesNacimiento() {
        return mesNacimiento;
    }

    public void setAñoNacimiento(int añoNacimiento) {
        this.añoNacimiento = añoNacimiento;
    }

    public int getAñoNacimiento() {
        return añoNacimiento;
    }

    public int calcularEdad() {
        LocalDate fechaNacimiento = LocalDate.of(añoNacimiento, mesNacimiento, diaNacimiento);
        LocalDate fechaActual = LocalDate.now();
        return Period.between(fechaNacimiento, fechaActual).getYears();
    }

    public int calcularFrecuenciaCardiacaMaxima() {
        return 220 - calcularEdad();
    }

    public String getFrecuenciaCardiacaEsperada() {
        int fcMaxima = calcularFrecuenciaCardiacaMaxima();
        int limiteInferior = (int) (fcMaxima * 0.50);
        int limiteSuperior = (int) (fcMaxima * 0.85);

        return String.format("%d - %d bpm (pulsos por minuto)", limiteInferior, limiteSuperior);
    }
}