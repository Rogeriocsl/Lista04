package lista04.musica;

import java.util.LinkedList;

public class Playlist {
    String nome;
    LinkedList<Musica> fila;

    public Playlist(String nome) {
        if (nome == null || nome.trim().isEmpty()) {
            throw new IllegalArgumentException("O nome da playlist não pode ser nulo ou vazio.");
        }
        this.nome = nome;
        this.fila = new LinkedList<>();
    }

    public int tamanho(){
        return this.fila.size();
    }

    public void adicionar(Musica m) {
        if (m == null) {
            throw new IllegalArgumentException("Musica nao pode ser nula");
        }
        if ("URGENTE".equals(m.getPrioridade())) {
            int index = 0;
            for (Musica musicaNaFila : fila) {
                if ("NORMAL".equals(musicaNaFila.getPrioridade())) {
                    break;
                }
                index++;
            }
            this.fila.add(index, m);
        } else {
            this.fila.addLast(m);
        }
    }

    public Musica proximaMusica(){
        return this.fila.peek();
    }

    public  Musica reproduzirProxima(){
        return this.fila.pollFirst();
    }

    public Musica remover(String titulo) {
        if (!fila.isEmpty()) {
            if (fila.getFirst().getTitulo().equals(titulo)) {
                return fila.removeFirst();
            }
        }
        return null;
    }
}
