package lista04.musica;

public class Musica {
    String titulo;
    String artista;
    int duracaoSegundos;
    String prioridade;

    public Musica (String titulo, String artista, int duracaoSegundos) {

        if (titulo == null || titulo.trim().isEmpty()) {
            throw new IllegalArgumentException("Titulo não pode ser nulo ou vazio.");
        }

        if (artista == null || artista.trim().isEmpty()) {
            throw new IllegalArgumentException("Artista não pode ser nulo ou vazio.");
        }
        if(duracaoSegundos <= 0){
            throw new IllegalArgumentException("Valor invalido.");
        }

        this.titulo = titulo;
        this.artista = artista;
        this.duracaoSegundos = duracaoSegundos;

    }
}
