package br.com.digitalhouse;

import java.util.ArrayList;
import java.util.List;

public class Sistema {
    private int x = 0;
    private int estoque;

    List <Livro> livros = new ArrayList();
        public void cadastrarLivro(Livro novoLivro){

    }

        public void conaulrar(int novoCodigo) {
            for (int i = 0; i < livros.size(); i++) {
                if(livros.get(i).getCodigo() == novoCodigo ){
                    System.out.println("codigo: " + livros.get(i).getCodigo());
                    System.out.println("titulo: " + livros.get(i).getCodigo());
                    System.out.println("autor: " + livros.get(i).getCodigo());
                    System.out.println("lançamento: " + livros.get(i).getCodigo());
                    System.out.println("isbn: " + livros.get(i).getCodigo());
                    System.out.println("estoque: " + livros.get(i).getCodigo());
                    System.out.println("preço: " + livros.get(i).getCodigo());

                    i = livros.size();
                    x = i;


                }
                if(x == 0){
                    System.out.println("Livro não encontrado");
                }

                for (Livro livro : livros) {
                    if (livro.getCodigo() == novoCodigo){
                        if (livro.getEstoque() > 0) {
                            estoque = livro.getEstoque() - 1;
                            livro.setEstoque(estoque);
                        }else {
                            System.out.println("Estoque Esgotado");
                        }
                }
            }
        }

        }

}
