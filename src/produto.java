public class produto {
    private String nome;
    private String valorVenda;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getValorVenda() {
        return valorVenda;
    }

    public void setValorVenda(String valorVenda) {
        this.valorVenda = valorVenda;
    }

    public produto(String nome, String valorVenda) {
        this.nome = nome;
        this.valorVenda = valorVenda;
    }
}
