package Play_List;

public class Music {
    private int Faixa;
    private String titulo;
    private String Artista;
    private int Período;
    private String link;

    public Music(int faixa, String titulo, String artista, int período, String link) {
        this.Faixa = faixa;
        this.titulo = titulo;
        this.Artista = artista;
        this.Período = período;
        this.link = link;
    }
    public int getFaixa() {
        return Faixa;
    }
    public void setFaixa(int faixa) {
        Faixa = faixa;
    }
    
    public String getTitulo() {
        return titulo;
    }
   
    public String getArtista() {
        return Artista;
    }
    public void setArtista(String artista) {
        Artista = artista;
    }
    
    public int getPeríodo() {
        return Período;
    }
    public void setPeríodo(int período) {
        Período = período;
    }
    
    public String getLink() {
        return link;
    }
    public void setLink(String link) {
        this.link = link;
    }

    @Override
    public String toString() {
        return "Music-> " +
                "Faixa=" + Faixa +
                " Título='" + titulo + '\'' +
                " Artista='" + Artista + '\'' +
                " Período=" + Período +
                " link='" + link + '\'' +
                '}';
    }
    
}
