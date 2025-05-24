public class ProdutoImportado {
    String descricao;
    float valor,imposto,taxa,taxaImportacao;
    public ProdutoImportado(String descricao,float valor,float imposto,float taxa, float taxaImp)
    {
        this.descricao = descricao;
        this.valor = valor;
        this.imposto = imposto;
        this.taxa = taxa;
        this.taxaImportacao = taxaImp;
    }
    @Override
    public String toString() {
        return "Descrição: " + descricao +
                ", Valor: " + valor +
                ", Imposto: " + imposto +
                ", Valor Final: " + (valor + imposto);
    }
}
