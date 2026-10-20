public class PruebaFactura {

    private String numeropieza;
    private String descripcionpieza;
    private int cantidadproducto;
    private double precioproducto;

    public PruebaFactura(String numeropieza) {
        this.numeropieza = numeropieza;
    }

    public PruebaFactura(String numeropieza, String descripcionpieza,
                         int cantidadproducto, double precioproducto) {
        this.numeropieza = numeropieza;
        this.descripcionpieza = descripcionpieza;
        setCantidadproducto(cantidadproducto);
        setprecioproducto(precioproducto);
    }

    public String getNumeropieza() {
        return numeropieza;
    }

    public void setNumeropieza(String numeropieza) {
        this.numeropieza = numeropieza;
    }

    public String getDescripcionpieza() {
        return descripcionpieza;
    }

    public void setDescripcionpieza(String descripcionpieza) {
        this.descripcionpieza = descripcionpieza;
    }

    public int getCantidadproducto() {
        return cantidadproducto;
    }

    public void setCantidadproducto(int cantidadproducto) {
        if (cantidadproducto > 0) {
            this.cantidadproducto = cantidadproducto;
        } else {
            this.cantidadproducto = 0;
        }
    }

    public double getPrecioproducto() {
        return precioproducto;
    }

    public void setprecioproducto(double precioproducto) {
        if (precioproducto > 0.0) {
            this.precioproducto = precioproducto;
        } else {
            this.precioproducto = 0.0;
        }
    }

    public double obtenerMontoFactura() {
        return cantidadproducto * precioproducto;
    }
}





