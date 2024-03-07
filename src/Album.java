import java.util.ArrayList;

public class Album {
    String genero;
    int ano;
    String nome;
    String artista;
    ArrayList<Musica> musicas;

    // Construtor
    public Album() {
        this.genero = genero;
        this.ano = ano;
        this.nome = nome;
        this.artista = artista;
        this.musicas = new ArrayList<>();
    }

    // Adiciona uma música ao álbum
    public void adicionarMusica(Musica musica) {
        musicas.add(musica);
    }

    // Método para mostrar todos os dados do álbum
    public void mostraTodosOsDados() {
        System.out.println("Informações do Álbum:");
        System.out.println("Gênero: " + genero);
        System.out.println("Ano: " + ano);
        System.out.println("Nome: " + nome);
        System.out.println("Artista: " + artista);

        System.out.println("Lista de Músicas:");
        for (Musica musica : musicas) {
            System.out.println("  - " + musica.getTitulo());
        }
    }
}
