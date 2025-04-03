package com.example.api_user.controller;

import com.example.api_user.model.Usuario;
import com.example.api_user.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/usuarios")// localhost:8080/api/usuarios
public class UsuarioController { // Fizer a requisição, vai bater aqui
    @Autowired // Injetar a classe UsuarioService
    private UsuarioService usuarioService;

    @GetMapping
    public List<Usuario> listarUsuarios() {
        return usuarioService.listarUsuarios();
    }

    @PostMapping
    public Usuario criarUsuario(@RequestBody Usuario usuario) {
        return usuarioService.criarUsuario(usuario);
    }


}
