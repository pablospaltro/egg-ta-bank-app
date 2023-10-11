package org.example.servicios;

import org.example.entidades.Usuario;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UsuarioServicioTest {

    @Test
    public void pruebaRegistro(){
        UsuarioServicio usuarioServicio = new UsuarioServicio();
        assertTrue(usuarioServicio.registrarse("contrasenia"));
    }
}