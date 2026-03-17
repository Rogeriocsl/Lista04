package lista04.musica;

import java.util.ArrayList;
import java.util.List;

public class Playlist {
    String nome;
    List<String> ingredientes = new ArrayList<>();

    public Playlist (String nome) {

        if (nome.trim().isEmpty()) {
            throw new IllegalArgumentException("Nome não pode ser nulo ou vazio.");
        }

        this.nome = nome;


    }
}
