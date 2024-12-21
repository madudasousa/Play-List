package Play_List;

public class Lista {
    private NoDuplo inicio;
    private NoDuplo fim;

   public Lista(NoDuplo inicio, NoDuplo fim){
   }
   
   public NoDuplo getInicio() {
    return inicio;
    }

    public void setInicio(NoDuplo inicio) {
        this.inicio = inicio;
    }

    public NoDuplo getFim() {
        return fim;
    }

    public void setFim(NoDuplo fim) {
        this.fim = fim;
    }

    //método adicionar dados em sequencia
    public void adicionar(Music musica)  {
        NoDuplo novoNoD =  new NoDuplo(musica);
        if (inicio == null) {
            inicio = fim = novoNoD;
        } else {
            fim.setProximo(novoNoD);
            novoNoD.setAnterior(fim);
            fim = novoNoD;
        }
    }
    

    //método remover dados
    public void remover(String titulo){
        NoDuplo aux = inicio;
        if(aux == null){System.out.println("A lista está vazia!");}

        while (aux != null){
        if (aux.getMusica().getTitulo().equals(titulo)){
            if (aux == inicio) {
                inicio = aux.getProximo();
                if (inicio != null) {
                    inicio.setAnterior(null);
                }
            } else if (aux == fim){
                fim = aux.getAnterior();
                if (fim!= null) {
                    fim.setProximo(null);
                }
            } else {
                aux.getAnterior().setProximo(aux.getProximo());
                aux.getProximo().setAnterior(aux.getAnterior());
            }
            System.out.println("Música removida da PlayList");
            return;
        }
        aux = aux.getProximo();
    }
}

    //método exibir lista 
    public void exibir() {
        NoDuplo aux = inicio;
        if (aux == null){System.out.println("LISTA VAZIADA");}
        
        while (aux!= null) {
            System.out.println(aux.getMusica());

            aux = aux.getProximo();
        }
    }

    //método buscar musica pelo titulo
    public Music buscar(String titulo){
        NoDuplo aux = inicio;

        while (aux!= null) {
            if (aux.getMusica().getTitulo().equals(titulo)) {
                return aux.getMusica();
            } else {
                aux = aux.getProximo();
            }
        }
        return null;
    }

    //Exibir musica anterior
    public void antecessor(NoDuplo atual) {
       if (atual == null || atual.anterior == null) {
            System.out.println("Não tem musica anterior");
       } else {
            System.out.println("Musica Anterior: \n" +atual.anterior.getMusica());
       }
    }

    //Exibir proxima musica
    public void posterior(NoDuplo atual){
        if (atual == null || atual.proximo == null) {
            System.out.println("Não tem proxima musica");
       } else {
            System.out.println("Proxima musica: \n" + atual.proximo.getMusica());
       }
    }

    //Método para obter um nó específico
    public NoDuplo obterNo(int index) {
        NoDuplo aux = inicio;
        int cont = 1;
        while (aux != null && cont < index) {
            aux = aux.getProximo();
            cont++;
        }
        return (aux != null && cont == index) ? aux : null;
    }
}