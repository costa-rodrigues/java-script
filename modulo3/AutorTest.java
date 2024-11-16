package com.mycompany.app;

import org.junit.Test;

import static org.junit.Assert.*;

public class AutorTest {

    private Autor autor;

    @BeforeEach
    public void setUp() {
        autor = new Autor("Jess", "Brasileira");
    }

    @Test
    public void testGetNome() {
        assertEquals("Jess", autor.getNome());
    }

    @Test
    public void testGetNacionalidade() {
        assertEquals("Brasileira", autor.getNacionalidade());
    }
}
