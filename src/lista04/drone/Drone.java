package lista04.drone;

public class Drone {
    String identificador;
    int bateria;
    int altitude;
    boolean emVoo;

    public Drone (String identificador) {
        if (identificador == null || identificador.trim().isEmpty()) {
            throw new IllegalArgumentException("identificador não pode ser nulo ou vazio.");
        }

        this.identificador = identificador;

    }
    public int getBateria(){
        return bateria;
    }

    public void setBateria(int valor) {
        if (valor < 0 || valor > 100) {
            throw new IllegalArgumentException("Valor fora do intervalo 0-100.");
        }
        this.bateria = valor;
    }

    public int getAltitude(){
        return altitude;
    }

    public void decolar(){
        if(getBateria()  <= 20){

        }else{
            this.emVoo = true;

        }
    }

    public void pousar(){
        this.emVoo = false;
        this.altitude = 0;
    }

    public boolean isEmVoo(){
        return emVoo;
    }

    public void setAltitude(int metros){
        if(isEmVoo() == true){
            if(metros <=0 || metros > 120){
                throw new IllegalArgumentException("");
            }else{
                this.altitude = metros;
            }
        }
    }

    public String getIdentificador(){
        return identificador;
    }
}
