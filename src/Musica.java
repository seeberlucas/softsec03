public class Musica {
    String titulo;
    double duracao;
    String compositor;

    // Construtor
    public Musica() {
        this.titulo = titulo;
        this.duracao = duracao;
        this.compositor = compositor;
    }

    // Método para tocar a música
    public void tocarMusica() {
        System.out.println("Tocando a música: " + titulo);
    }

    // Métodos para acessar informações da música
    public String getTitulo() {
        return titulo;
    }

    public double getDuracao() {
        return duracao;
    }

    public String getCompositor() {
        return compositor;
    }
}
