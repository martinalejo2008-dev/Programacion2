package negocio;

public class Carro {

    int potencia;
    double velocidad;
    private static int numCarros=0;

    public void acelerar(){
        velocidad += potencia;
    }

    void frenar(){
        velocidad /=2;
    }

    public void setPotencia(int potencia){
        if(potencia>0){
            this.potencia=potencia;
        }
    }

    public void setVelocidad(double velocidad){
        this.velocidad = velocidad;
        if(velocidad<0) {
            velocidad=0;
        }
    }

    public double getVelocidad(){
        return velocidad;
    }

    public int getPotencia(){
        return potencia;

    }
    public int getNumCarros(){

    }

}