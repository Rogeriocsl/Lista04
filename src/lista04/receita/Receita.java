package lista04.receita;

import java.util.ArrayList;
import java.util.List;

public class Receita {
    String nome;
    int tempoPreparo;
    int rendimentoPorcoes;
    List<String> ingredientes = new ArrayList<>();

    public Receita(String nome, int tempoPreparo, int rendimentoPorcoes) {
        if (nome == null || nome.trim().isEmpty()) {
            throw new IllegalArgumentException("Nome não pode ser nulo ou vazio.");
        }

        if (tempoPreparo <= 0) {
            throw new IllegalArgumentException("Tempo de preparo deve ser maior que zero.");
        }

        if (rendimentoPorcoes <= 0) {
            throw new IllegalArgumentException("Rendimento deve ser maior que zero.");
        }

        this.nome = nome;
        this.tempoPreparo = tempoPreparo;
        this.rendimentoPorcoes = rendimentoPorcoes;
        this.ingredientes = new ArrayList<>();
    }


    public String getNome(){
        return nome;
    }

    public int getTempoPreparo(){
        return tempoPreparo;
    }

    public int getRendimentoPorcoes(){
        return rendimentoPorcoes;
    }

    public List<String> getIngredientes(){
        return new ArrayList<>(this.ingredientes);
    }


    public void setTempoPreparo(int tempoPreparo) {
        if (tempoPreparo <= 0) {
            throw new IllegalArgumentException("O tempo de preparo deve ser maior que zero.");
        }
        this.tempoPreparo = tempoPreparo;
    }

    public void setRendimentoPorcoes(int rendimentoPorcoes) {
        if (rendimentoPorcoes <= 0) {
            throw new IllegalArgumentException("O rendimento deve ser maior que zero.");
        }
        this.rendimentoPorcoes = rendimentoPorcoes;
    }

    public void adicionarIngrediente(String ingrediente) {
        if (ingrediente != null && !ingrediente.trim().isEmpty()) {
            this.ingredientes.add(ingrediente);
        }
    }

    public void removerIngrediente(String ingrediente) {
        this.ingredientes.remove(ingrediente);
    }

}
