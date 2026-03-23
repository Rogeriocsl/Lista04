package lista04.musica;

public class Musica {
    String titulo;
    String artista;
    int duracaoSegundos;
    String prioridade;

    public Musica (String titulo, String artista, int duracaoSegundos, String prioridade) {

        if (titulo == null || titulo.trim().isEmpty()) {
            throw new IllegalArgumentException("Titulo não pode ser nulo ou vazio.");
        }

        if (artista == null || artista.trim().isEmpty()) {
            throw new IllegalArgumentException("Artista não pode ser nulo ou vazio.");
        }
        if(duracaoSegundos <= 0){
            throw new IllegalArgumentException("Valor Invalido.");
        }

        this.titulo = titulo;
        this.artista = artista;
        this.duracaoSegundos = duracaoSegundos;
        this.prioridade = prioridade;

    }

    public void setPrioridade(String valor) {
        if (valor == null || valor.trim().isEmpty()) {
            throw new IllegalArgumentException("Valor não pode ser nulo ou vazio.");
        }
        if (!valor.equals("NORMAL") && !valor.equals("URGENTE")) {
            throw new IllegalArgumentException("Valor Inválido: " + valor);
        }
        this.prioridade = valor;
    }

    public String getPrioridade(){
        return prioridade;
    }

    public String getTitulo(){
        return titulo;
    }

}
