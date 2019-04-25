package br.com.digitalhouse;

public class Livro {
    private int codigo;
    private String titulo;
    private String autor;
    private int lançamento;
    private int isbn;
    private int estoque;
    private float preço;

    public Livro() {
    }

    public Livro(int codigo, String titulo, String autor, int lançamento, int isbn, int estoque, float preço) {

        this.codigo = codigo;
        this.titulo = titulo;
        this.autor = autor;
        this.lançamento = lançamento;
        this.isbn = isbn;
        this.estoque = estoque;
        this.preço = preço;
    }

    public int getCodigo() {

        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getLançamento() {
        return lançamento;
    }

    public void setLançamento(int lançamento) {
        this.lançamento = lançamento;
    }

    public int getIsbn() {
        return isbn;
    }

    public void setIsbn(int isbn) {
        this.isbn = isbn;
    }

    public int getEstoque() {
        return estoque;
    }

    public void setEstoque(int estoque) {
        this.estoque = estoque;
    }

    public float getPreço() {
        return preço;
    }

    public void setPreço(float preço) {
        this.preço = preço;
    }
}
