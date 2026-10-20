public class LuzInteligente {
    private String idLuz;
    private int nivelBrillo;
    private boolean encendida;

    public void setidLuz(String idLuz){
        if(idLuz != null && !idLuz.isBlank()){
            this.idLuz=idLuz;
        }
    }

    public String getidLuz(){
        return idLuz;
    }

    public void setnivelBrillo(int nivelBrillo){

        if (encendida && nivelBrillo >= 0 && nivelBrillo <= 100) {
            this.nivelBrillo = nivelBrillo;
        }
    }

    public int getnivelBrillo(){
        return nivelBrillo;
    }

    public void encender(){
        if(!encendida){
            encendida=true;
        }
    }

    public void apagar(){
        if(encendida){
            encendida=false;
        }
    }

    public void mostrarEstado(){
        if(encendida){
            System.out.println("La luz está encendida");
        }else{
            System.out.println("La luz está apagada");
        }
    }
}
