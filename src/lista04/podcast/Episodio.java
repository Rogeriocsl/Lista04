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


    }

}
