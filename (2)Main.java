/*
    Controle remoto com interação em uma TV
*/
import java.util.Scanner;

public class Main
{

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Controle controle_remoto = new Controle();
        TV minha_tv = new TV();
        int i = 0, j = 0, opcao;

        do {
            System.out.println("\n\t-----------MENU-----------\n\t0-Sair\n\t1-Ligar TV\n\t2-Desligar TV\n\t3-Aumentar volume\n\t4-Diminuir volume\n\t5-Mudar de canal\n\t6-Contratar planos de Streaming(aumenta a quantidade de canais disponíveis)\n\t7-Obter volume atual da TV\n\t--------------------------\t");
            System.out.print("Insira sua opção: ");
            opcao = scan.nextInt();

            switch (opcao)
            {
                case 1:
                    minha_tv.ligada = controle_remoto.ligar();
                    break;
                case 2:
                    minha_tv.ligada = controle_remoto.desligar();
                    break;
                case 3:
                    if (minha_tv.ligada)
                    {
                        controle_remoto.a_volume(minha_tv);
                    }else
                    {
                        System.out.println("Ação indísponivel, TV desligada");
                    }
                    break;
                case 4:
                    if (minha_tv.ligada)
                    {
                        controle_remoto.d_volume(minha_tv);
                    }else
                    {
                        System.out.println("Ação indísponivel, TV desligada");
                    }

                    break;
                case 5:
                    controle_remoto.mudar_canal(minha_tv,j);
                    j++;
                    if (j >= minha_tv.canais.length || minha_tv.canais[j] == null) {
                        System.out.println("(Mais nenhum canal disponível...Voltando ao início)");
                        j = 0;
                    }
                    break;
                case 6:
                    if (minha_tv.ligada)
                    {
                        System.out.println("\nSugestões:\n-Netflix\n-AppleTV\n-Amazon");
                        String canal;
                        System.out.println("Insira o serviço de Streaming que deseja: ");
                        scan.nextLine();
                        canal = scan.nextLine();
                        minha_tv.adicionar_canal(canal,i);
                        i++;
                    }else
                    {
                        System.out.println("Ação indísponivel, TV desligada");
                    }

                    break;
                case 7:
                    if (minha_tv.ligada)
                    {
                        minha_tv.getVolume();
                    }else
                    {
                        System.out.println("Ação indísponivel, TV desligada");
                    }

                    break;
            }

        }while(opcao != 0);

    }
}

class Controle implements Controlador
{
    public boolean ligar()
    {
        System.out.println("A TV está ligada!");
        return true;
    }
    public boolean desligar()
    {
        System.out.println("A TV está desligada!");
        return false;
    }
    public void a_volume(TV tv_alvo)
    {
        System.out.println("Volume aumentado..");
        tv_alvo.volume += 5;
    }
    public void d_volume(TV tv_alvo)
    {
        System.out.println("Volume diminuido...");
        tv_alvo.volume -= 5;
    }
    public void mudar_canal(TV tv_alvo, int j)
    {
            if (tv_alvo.canais[j] != null)
            {
                System.out.println("Canal atual: " + tv_alvo.canais[j]);
            }
    }
}


class TV
{
    int volume = 0;
    boolean ligada;
    String[] canais = new String[20];

    void adicionar_canal(String canal, int i)
    {
        this.canais[i] = canal;
    }

    public void getVolume()
    {
        System.out.println("O volume atual é: " + this.volume);
    }
}
