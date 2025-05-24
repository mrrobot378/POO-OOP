public class ProdutoEstadual {
    String descricao;
    float valor,imposto;
    public ProdutoEstadual(String descricao,float valor,float imposto)
    {
        this.descricao = descricao;
        this.valor = valor;
        this.imposto = imposto;
    }
    @Override
    public String toString() {
        return "Descrição: " + descricao +
                ", Valor: " + valor +
                ", Imposto: " + imposto +
                ", Valor Final: " + (valor + imposto);
    }
}

