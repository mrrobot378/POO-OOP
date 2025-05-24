public class ProdutoNacional {
    String descricao;
    float valor,imposto,taxa;
    public ProdutoNacional(String descricao,float valor,float imposto,float taxa)
    {
        this.descricao = descricao;
        this.valor = valor;
        this.imposto = imposto;
        this.taxa = taxa;
    }
    @Override
    public String toString() {
        return "Descrição: " + descricao +
                ", Valor: " + valor +
                ", Imposto: " + imposto +
                ", Valor Final: " + (valor + imposto);
    }
}
