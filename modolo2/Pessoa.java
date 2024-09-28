classe pública Pessoa {
    String protegida nome;
    Livro protegido[] livros;

    public Pessoa(String nome) {
        this.nome = nome;
        this.livros = new Livro[0]; // inicialmente, sem livros
    }

    pública String getNome() {
        retornar nome;
    }

    público Livro[] getLivros() {
        retornar livros;
    }
}
