package exercicio;

public class Invoice {
    private int codigoProduto;
    private String descricao;
    private int qtdComprada;
    private double precoUnitario;

    public int getCodigoProduto() {
        return codigoProduto;
    }

    public void setCodigoProduto(int codigoProduto) {
        this.codigoProduto = codigoProduto;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getQtdComprada() {
        return qtdComprada;
    }

    public void setQtdComprada(int qtdComprada) {
        this.qtdComprada = qtdComprada;
    }

    public double getPrecoUnitario() {
        return precoUnitario;
    }

    public void setPrecoUnitario(double precoUnitario) {
        this.precoUnitario = precoUnitario;
    }

    public Invoice(int code, String descricao, int qtd, double preco){
        this.descricao = descricao;
        this.codigoProduto = code;

        if (0>qtd) {
            this.qtdComprada = 0;
        } else {
            this.qtdComprada = qtd;
        }

        if (0> preco) {
            this.precoUnitario = 0.0d;
        } else {
            this.precoUnitario = preco;
        }
    }

    public double getInvoiceAmount(){
        return this.precoUnitario * this.qtdComprada;
    }
}
