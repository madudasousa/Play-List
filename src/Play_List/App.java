package Play_List;

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Lista list = new Lista(null, null);
        Scanner info = new Scanner(System.in);
        int opcao, escolherMusic;
        

        do {
            System.out.println("\n ====PLAYLIST=== ");
            System.out.println("1. Adicionar música");
            System.out.println("2. Exibir playlist");
            System.out.println("3. Remover música");
            System.out.println("4. Buscar Música");
            System.out.println("5. Música anterior");
            System.out.println("6. Música posterior");
            System.out.println("0. SAIR");
            System.out.println("Escolha uma opção: ");
            opcao = info.nextInt();
            info.nextLine(); //Quebrar uma linha

           
            switch (opcao) {
                case 1:
                    Music musica = criarMusic(info);
                    list.adicionar(musica);
                    System.out.println("Música adicionada a PlayList!");
                    break;
                case 2:
                    list.exibir();
                    break;
                case 3:
                        System.out.println("Digite o TITULO da música que deseja remover: ");
                        String nomeRemove = info.nextLine();
                        list.remover(nomeRemove);
                    break;
                case 4:
                    System.out.println("Digite o TITULO da música a ser buscada: ");
                    String busc = info.nextLine();
                    Music buscar = list.buscar(busc);
                    if (buscar != null) {
                        System.out.println("Música encontrada: \n" + buscar.toString());
                    }else {
                        System.out.println("Música não encotrada.");
                    }
                    break;

                case 5:
                    System.out.println("Você quer ver a MÚSICA ANTERIOR de qual faixa? (digite o número da faixa):");
                    escolherMusic = info.nextInt();
                    info.nextLine(); 
                    NoDuplo musicaEscolhida = list.obterNo(escolherMusic);
                    if (musicaEscolhida != null) {
                        list.antecessor(musicaEscolhida);
                    } else {
                        System.out.println("Música não encontrada.");
                    }
                    break;
                case 6:
                    System.out.println("Você quer ver a PRÓXIMA MÚSICA de qual faixa? (digite o número da faixa): ");
                    escolherMusic = info.nextInt();
                    info.nextLine(); 
                    NoDuplo musicEscolhida = list.obterNo(escolherMusic);
                    if (musicEscolhida != null) {
                        list.posterior(musicEscolhida);
                    } else {
                        System.out.println("Música não encontrada.");
                    }
                    break;

                case 0:
                    System.out.println("Saindo da Playlist...");
                    break;    
                default:
                    System.out.println("Opção invalida. Tente novamente");
            }

        } while (opcao != 0);
        info.close();
    }


    //método para receber os dados da musica
    public static Music criarMusic(Scanner info){
        System.out.println("Informe o número da faixa: ");
        int faixa = info.nextInt();
        info.nextLine();

        System.out.println("Digite o titulo da música: ");
        String titulo = info.nextLine();

        System.out.println("Digite o nome do artista: ");
        String artista = info.nextLine();

        System.out.println("Digite de qual ano é a música: ");
        int periodo = info.nextInt();
        info.nextLine();

        System.out.println("Digite o link da música: ");
        String link = info.nextLine();

        return new Music(faixa, titulo, artista, periodo, link);
    }
}
