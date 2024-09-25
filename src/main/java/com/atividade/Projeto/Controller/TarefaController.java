package com.atividade.Projeto.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.atividade.Projeto.model.Usuario;
import com.atividade.Projeto.repository.UsuarioRepository;

import java.util.List;

@RestController
@RequestMapping("/usuarios")
public class TarefaController {

    @Autowired
    private UsuarioRepository usuarioRepository;

    @PostMapping
    public void addUsuario(@RequestBody Usuario usuario) {
        usuarioRepository.save(usuario);
    }

    @GetMapping("/{id}")
    public Usuario getUsuario(@PathVariable String id) {
        return usuarioRepository.findById(id);
    }

    @GetMapping
    public List<Usuario> getAllUsuarios() {
        return usuarioRepository.findAll();
    }

    @PutMapping("/{id}")
    public void updateUsuario(@PathVariable String id, @RequestBody Usuario usuario) {
        usuario.setId(id);
        usuarioRepository.update(usuario);
    }

    @DeleteMapping("/{id}")
    public void deleteUsuario(@PathVariable String id) {
        usuarioRepository.deleteById(id);
    }
}
