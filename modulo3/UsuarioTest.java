package com.mycompany.app;

import org.junit.Test;

import static org.junit.Assert.*;

public class UsuarioTest {

    private Usuario usuario;

    @BeforeEach
    public void setUp() {
        usuario = new Usuario("Gabriel", 21);
    }

    @Test
    public void testGetNome() {
        assertEquals("Gabriel", usuario.getNome());
    }

    @Test
    public void testGetIdade() {
        assertEquals(21, usuario.getIdade());
    }
}
