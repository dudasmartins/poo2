public class cupom {
    private String id;
    private double venda;

    public double getVenda() {
        return venda;
    }

    public void setVenda(double venda) {
        this.venda = venda;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public cupom (String id) {
        this.id = id;
    }
}
