package negocio;

public class Main {
    static void main(){
        Carro c1 = new Carro();
        Carro c2 = new Carro();
        Carro c3 = new Carro();
        Carro c4 = new Carro();

        c1.potencia=2;
        c1.velocidad=60;

        c2.potencia=2;
        c2.velocidad=100;

        c3.potencia=2;
        c3.velocidad=60;

        System.out.println("La potencia del carro es "+c1.potencia+" y la velocidad es "+c1.velocidad);

        c1.acelerar();
        c1.acelerar();
        c1.frenar();

        System.out.println("La cantidad de carros existentes en el sistema es: "+Carro.getNumCarros()+" y la velocidad es "+c1.velocidad);
    }
}
