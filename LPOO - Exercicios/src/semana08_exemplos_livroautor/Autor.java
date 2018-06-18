package semana08_exemplos_livroautor;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class Autor {

    private int id;
    private String nome;
    private List<Livro> livros;

    public Autor(String nome) {
        this.nome = nome;
        this.livros = new ArrayList();
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setLivros(List<Livro> livros) {
        Iterator iterator = livros.iterator();
        while (iterator.hasNext()) {
            Livro livro = (Livro) iterator.next();
            this.adicionarLivro(livro);
        }
    }

    public List<Livro> getLivros() {
        return this.livros;
    }

    public void adicionarLivro(Livro livro) {
        if (!this.getLivros().contains(livro)) {
            this.livros.add(livro);
            livro.adicionarAutor(this);
        }
    }

    public void removerLivro(Livro livro) {
        if (!this.getLivros().contains(livro)) {
            this.livros.remove(livro);
            livro.removerAutor(this);
        }
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
