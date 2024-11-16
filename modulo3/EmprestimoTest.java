package com.mycompany.app;

import org.junit.Test;

import static org.junit.Assert.*;

public class EmprestimoTest {

    private Date dataRetirada;
    private Date dataDevolucao;
    private Livro livro;
    private Usuario usuario;
    private Emprestimo emprestimo;

    @BeforeEach
    public void setUp() {
        dataRetirada = new Date();
        dataDevolucao = new Date();
        livro = new Livro("Java Basics", new Autor("Alan Turing", "Inglês"), "Tecnologia", true);
        usuario = new Usuario("Gabriel", 21);
        emprestimo = new Emprestimo(dataRetirada, dataDevolucao, livro, usuario);
    }

    @Test
    public void testGetDataRetirada() {
        assertEquals(dataRetirada, emprestimo.getDataRetirada());
    }

    @Test
    public void testGetDataDevolucao() {
        assertEquals(dataDevolucao, emprestimo.getDataDevolucao());
    }

    @Test
    public void testGetLivro() {
        assertEquals(livro, emprestimo.getLivro());
    }

    @Test
    public void testGetUsuario() {
        assertEquals(usuario, emprestimo.getUsuario());
    }
}
