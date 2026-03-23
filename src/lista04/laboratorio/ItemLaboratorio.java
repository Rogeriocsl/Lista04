package lista04.laboratorio;

public class ItemLaboratorio {
    private final String codigo;
    private String nome;
    private int quantidadeDisponivel;
    private int quantidadeMinima;
    private String status;

    public ItemLaboratorio(String codigo, String nome, int quantidadeDisponivel, int quantidadeMinima) {

        if (codigo == null || codigo.trim().isEmpty()) {
            throw new IllegalArgumentException("Codigo não pode ser nulo ou vazio.");
        }
        if (nome == null || nome.trim().isEmpty()) {
            throw new IllegalArgumentException("Nome não pode ser nulo ou vazio.");
        }
        if (quantidadeDisponivel < 0) {
            throw new IllegalArgumentException("Quantidade Disponivel nao pode ser negativa.");
        }
        if (quantidadeMinima <= 0) {
            throw new IllegalArgumentException("Quantidade Minima deve ser maior que zero.");
        }

        this.codigo = codigo;
        this.nome = nome;
        this.quantidadeDisponivel = quantidadeDisponivel;
        this.quantidadeMinima = quantidadeMinima;

        atualizarStatus();
    }

    public String getCodigo() { return codigo; }
    public String getNome() { return nome; }
    public int getQuantidadeDisponivel() { return quantidadeDisponivel; }
    public int getQuantidadeMinima() { return quantidadeMinima; }
    public String getStatus() { return status; }

    public void setNome(String nome) { this.nome = nome; }
    public void setQuantidadeMinima(int quantidadeMinima) {
        if (quantidadeMinima <= 0) throw new IllegalArgumentException("Minima deve ser > 0");
        this.quantidadeMinima = quantidadeMinima;
        atualizarStatus();
    }

    private void atualizarStatus() {
        if (this.quantidadeDisponivel == 0) {
            this.status = "ESGOTADO";
        } else if (this.quantidadeDisponivel <= this.quantidadeMinima) {
            this.status = "ALERTA";
        } else {
            this.status = "NORMAL";
        }
    }

    public void entrada(int qtd) {
        if (qtd <= 0) {
            throw new IllegalArgumentException("Quantidade de entrada deve ser positiva.");
        }
        this.quantidadeDisponivel += qtd;
        atualizarStatus();
    }

    public void saida(int qtd) {
        if (qtd <= 0) {
            throw new IllegalArgumentException("Quantidade de saida deve ser positiva.");
        }

        if (this.quantidadeDisponivel - qtd >= 0) {
            this.quantidadeDisponivel -= qtd;
            atualizarStatus();
        }
    }
}