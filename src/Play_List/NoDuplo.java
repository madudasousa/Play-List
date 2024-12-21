package Play_List;

public class NoDuplo {

    private Music musica;
    public String titulo;
    public NoDuplo proximo;
    public NoDuplo anterior;
    public NoDuplo atual;
   
    public NoDuplo(Music musica) {
        this.musica = musica;
    }

    public String getTitulo(){return titulo;}

    public Music getMusica() {
        return musica;
    }
    
    public void setMusica(Music musica) {
        this.musica = musica;
    }

    public NoDuplo getProximo() {
        return proximo;
    }

    public void setProximo(NoDuplo proximo) {
        this.proximo = proximo;
    }
    
    public NoDuplo getAnterior() {
        return anterior;
    }

    public void setAnterior(NoDuplo anterior) {
       this.anterior = anterior;
    }

}
