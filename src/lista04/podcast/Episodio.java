package lista04.podcast;

import java.util.ArrayList;

public class Episodio {
    String titulo;
    int numero;
    int duracaoMinutos;
    String status;

    public Episodio (String titulo, int numero, int duracaoMinutos) {
        if (titulo == null || titulo.trim().isEmpty()) {
            throw new IllegalArgumentException("Titulo não pode ser nulo ou vazio.");
        }

        if (numero <= 0) {
            throw new IllegalArgumentException("Numero deve ser maior que zero.");
        }

        if (duracaoMinutos <= 0) {
            throw new IllegalArgumentException("Duração de minutos deve ser maior que zero.");
        }

        this.titulo = titulo;
        this.numero = numero;
        this.duracaoMinutos = duracaoMinutos;
        this.status = "RASCUNHO";
    }

    public void setDuracaoMinutos(int duracaoMinutos) {
        if (duracaoMinutos <= 0) {
            throw new IllegalArgumentException("A Duração deve ser maior que zero.");
        }
        this.duracaoMinutos = duracaoMinutos;
    }

    public String getTitulo(){
        return titulo;
    }

    public int getNumero(){
        return numero;
    }

    public int getDuracaoMinutos(){
        return duracaoMinutos;
    }

    public String getStatus(){
        return status;
    }

    public void publicar(){
        if(getStatus().equals("RASCUNHO")){
            this.status = "PUBLICADO";
        }
    }

    public void arquivar(){
        if(getStatus().equals("PUBLICADO")){
            this.status = "ARQUIVADO";
        }
    }

    public void restaurar(){
        if(getStatus().equals("ARQUIVADO")){
            this.status = "RASCUNHO";
        }
    }
}
