/*
    Construa um programa com entrada e saída de dados para representar três tipos de produtos,
    os quais são vendidos em três níveis: Estadual, Nacional e Importado. Cada nível possui um
    tipo diferente de tributação e taxas, as quais deverão ser levadas em conta para calcular o valor
    final do produto que será exibido no relatório.
 */
import  java.util.Scanner;

public class Main {
    static int opcao,i = 0, j = 0, k = 0;
    static ProdutoEstadual[] p_est = new ProdutoEstadual[20];
    static ProdutoNacional[] p_nac = new ProdutoNacional[20];
    static ProdutoImportado[] p_imp = new ProdutoImportado[20];

    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        do {
            System.out.print("\n\t1-Cadastrar Produto Estadual\n\t2-Cadastrar Produto Nacional\n\t3-Cadastrar Produto Importado\n\t4-Exibir Produtos Estaduais\n\t5-Exibir produtos Nacionais\n\t6-Exibir produtos Importados\n\t7-Exibir Todos Produtos\n\t9-Sair\nOpção: ");
            opcao = scan.nextInt();

            switch (opcao)
            {
                case 1:
                    if (i < p_est.length) {
                        scan.nextLine(); // Limpa buffer
                        System.out.print("Descrição: ");
                        String descE = scan.nextLine();
                        System.out.print("Valor: ");
                        float valE = scan.nextFloat();
                        System.out.print("Imposto: ");
                        float impE = scan.nextFloat();
                        cadastrar_estadual(descE, valE, impE);
                        scan.nextLine(); // Limpa buffer após o cadastro
                    } else {
                        System.out.println("Limite de produtos estaduais atingido!");
                    }
                    break;

                case 2:
                    if (j < p_nac.length) {
                        scan.nextLine();
                        System.out.print("Descrição: ");
                        String descN = scan.nextLine();
                        System.out.print("Valor: ");
                        float valN = scan.nextFloat();
                        System.out.print("Imposto: ");
                        float impN = scan.nextFloat();
                        System.out.print("Taxa Nacional: ");
                        float taxaN = scan.nextFloat();
                        cadastrar_nacional(descN, valN, impN, taxaN);
                        scan.nextLine(); // Limpa buffer após o cadastro
                    } else {
                        System.out.println("Limite de produtos nacionais atingido!");
                    }
                    break;

                case 3:
                    if (k < p_imp.length) {
                        scan.nextLine();
                        System.out.print("Descrição: ");
                        String descI = scan.nextLine();
                        System.out.print("Valor: ");
                        float valI = scan.nextFloat();
                        System.out.print("Imposto: ");
                        float impI = scan.nextFloat();
                        System.out.print("Taxa Nacional: ");
                        float taxaNI = scan.nextFloat();
                        System.out.print("Taxa Importação: ");
                        float taxaImp = scan.nextFloat();
                        cadastrar_importado(descI, valI, impI, taxaNI, taxaImp);
                        scan.nextLine(); // Limpa buffer após o cadastro
                    } else {
                        System.out.println("Limite de produtos importados atingido!");
                    }
                    break;

                case 4:
                    System.out.println("\nProdutos Estaduais:");
                    for (int idx = 0; idx < i; idx++) {
                        System.out.println(p_est[idx]);
                    }
                    break;

                case 5:
                    System.out.println("\nProdutos Nacionais:");
                    for (int idx = 0; idx < j; idx++) {
                        System.out.println(p_nac[idx]);
                    }
                    break;

                case 6:
                    System.out.println("\nProdutos Importados:");
                    for (int idx = 0; idx < k; idx++) {
                        System.out.println(p_imp[idx]);
                    }
                    break;

                case 7:
                    System.out.println("\nProdutos Estaduais:");
                    for (int idx = 0; idx < i; idx++) {
                        System.out.println(p_est[idx]);
                    }
                    System.out.println("\nProdutos Nacionais:");
                    for (int idx = 0; idx < j; idx++) {
                        System.out.println(p_nac[idx]);
                    }
                    System.out.println("\nProdutos Importados:");
                    for (int idx = 0; idx < k; idx++) {
                        System.out.println(p_imp[idx]);
                    }
                    break;

                case 9:
                    System.out.println("Saindo...");
                    break;

                default:
                    System.out.println("Opção inválida!");
            }

        } while (opcao != 9);
    }

     static void cadastrar_estadual(String descricao,float valor,float imposto)
    {
        p_est[i] = new ProdutoEstadual(descricao,valor,imposto);
        i++;
    }

    static void cadastrar_nacional(String descricao,float valor,float imposto,float taxa)
    {
        p_nac[j] = new ProdutoNacional(descricao,valor,imposto,taxa);
        j++;
    }

    static void cadastrar_importado(String descricao,float valor,float imposto,float taxa,float taxaImp)
    {
        p_imp[k] = new ProdutoImportado(descricao,valor,imposto,taxa,taxaImp);
        k++;
    }
}
