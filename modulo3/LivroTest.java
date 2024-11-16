package com.mycompany.app;

import org.junit.Test;

import static org.junit.Assert.*;

public class LivroTest {

    private Autor autor;
    private Livro livro1;
    private Livro livro2;

    @BeforeEach
    public void setUp() {
        autor = new Autor("Jess", "Brasileira");
        livro1 = new Livro("Java Basico", autor, "tecnologia", true);
        livro2 = new Livro("Java Avançado", autor, "tecnologia", false);
    }

    @Test
    public void testGetTitulo() {
        assertEquals("Java Basico", livro1.getTitulo());
        assertEquals("Java Avançado", livro2.getTitulo());
    }

    @Test
    public void testGetAutor() {
        assertEquals(autor, livro1.getAutor());
    }

    @Test
    public void testIsDisponivel() {
        assertTrue(livro1.isDisponivel());
        assertFalse(livro2.isDisponivel());
    }

    @Test
    public void testValidarDisponibilidade() {
        livro1.validarDisponibilidade();
        livro2.validarDisponibilidade();
        assertTrue(livro1.isDisponivel());
        assertFalse(livro2.isDisponivel());
    }
}
