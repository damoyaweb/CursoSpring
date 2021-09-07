package com.cursojava.curso.controllers;

import com.cursojava.curso.models.Usuario;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UsuarioController {
    @RequestMapping(value = "usuario/{id}")
    public Usuario mostrarUsuario(@PathVariable long id){
        Usuario usuario = new Usuario();
        usuario.setId(id);
        usuario.setNombre("Diego");
        usuario.setApellido("Moya");
        usuario.setEmail("diegomoya86@gmail.com");
        usuario.setTelefono("3164469418");
        usuario.setContrasena("Sarita");
        return usuario;
    }
    @RequestMapping(value = "usuario/modificar")
    public Usuario modificarUsuario(){
        Usuario usuario = new Usuario();
        usuario.setNombre("Diego");
        usuario.setApellido("Moya");
        usuario.setEmail("diegomoya86@gmail.com");
        usuario.setTelefono("3164469418");
        usuario.setContrasena("Sarita");
        return usuario;
    }
    @RequestMapping(value = "usuario/eliminar")
    public Usuario eliminarUsuario(){
        Usuario usuario = new Usuario();
        usuario.setNombre("Diego");
        usuario.setApellido("Moya");
        usuario.setEmail("diegomoya86@gmail.com");
        usuario.setTelefono("3164469418");
        usuario.setContrasena("Sarita");
        return usuario;
    }
    @RequestMapping(value = "usuario/buscar")
    public Usuario buscarUsuario(){
        Usuario usuario = new Usuario();
        usuario.setNombre("Diego");
        usuario.setApellido("Moya");
        usuario.setEmail("diegomoya86@gmail.com");
        usuario.setTelefono("3164469418");
        usuario.setContrasena("Sarita");
        return usuario;
    }
}