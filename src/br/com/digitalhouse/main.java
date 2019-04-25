package br.com.digitalhouse;

import java.util.ArrayList;
import java.util.List;

public class main {
    public static void main(String[] args) {
        List<Livro> livros = new ArrayList();

        Livro senhor = new Livro(01, "Senhor dos Aneis", "JRR Tolkien", 1980, 300,
                10, 40);
        Livro silencio = new Livro(02, "Silencio dos Inocentes", "Fulaninho1", 1970, 240,
                50, 60);
        Livro revolta = new Livro(03, "Revolta dos Animais", "Gabriel Garcia", 1950, 120,
                10, 40);
        Livro crepusculo = new Livro(04, "crepusculo", "fulaninho3", 2010, 400,
                30, 40);

        livros.add(senhor);
        livros.add(silencio);
        livros.add(revolta);
        livros.add(crepusculo);


        }

    }
}
