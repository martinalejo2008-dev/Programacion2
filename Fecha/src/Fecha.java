public class Fecha {
    private int dia;
    private int mes;
    private int año;

    public Fecha(int dia, int mes, int año) {
        this.año=año;

        if(mes<1){
            mes=1;
        }else if(mes>12){
            mes=12;
        }
        this.mes=mes;

        if(dia<1){
            dia=1;
        }else if((mes==1 || mes==3 || mes==5 || mes==7 || mes==8 || mes==10 || mes ==12) && dia>31){
            dia=31;
        }else if(mes==2 && año%4==0 && dia>29){
            dia=29;
        }else if(mes==2 && dia>28){
            dia=28;
        }else if((mes==4 || mes==6 || mes==9 || mes==11) && dia>30){
            dia=30;
        }
        this.dia=dia;
    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        if(dia<1){
            dia=1;
        }else if((mes==1 || mes==3 || mes==5 || mes==7 || mes==8 || mes==10 || mes ==12) && dia>31){
            dia=31;
        }else if(mes==2 && año%4==0 && dia>29){
            dia=29;
        }else if(mes==2 && dia>28){
            dia=28;
        }else if((mes==4 || mes==6 || mes==9 || mes==11) && dia>30){
            dia=30;
        }
        this.dia=dia;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        if(mes<1){
            mes=1;
        }else if(mes>12){
            mes=12;
        }
        this.mes=mes;
    }

    public int getAño() {
        return año;
    }

    public void setAño(int año) {
        this.año = año;
    }

    public void mostrarFecha(){
        System.out.println(dia+"/"+mes+"/"+año);
    }
}
