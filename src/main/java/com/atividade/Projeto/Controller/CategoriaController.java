package com.atividade.Projeto.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.atividade.Projeto.model.Categoria;
import com.atividade.Projeto.repository.CategoriaRepository;

import java.util.List;

@RestController
@RequestMapping("/categorias")
public class CategoriaController {

    @Autowired
    private CategoriaRepository categoriaRepository;

    @PostMapping
    public void addCategoria(@RequestBody Categoria categoria) {
        categoriaRepository.save(categoria);
    }

    @GetMapping("/{id}")
    public Categoria getCategoria(@PathVariable String id) {
        return categoriaRepository.findById(id);
    }

    @GetMapping
    public List<Categoria> getAllCategorias() {
        return categoriaRepository.findAll();
    }

    @PutMapping("/{id}")
    public void updateCategoria(@PathVariable String id, @RequestBody Categoria categoria) {
        categoria.setId(id);
        categoriaRepository.update(categoria);
    }

    @DeleteMapping("/{id}")
    public void deleteCategoria(@PathVariable String id) {
        categoriaRepository.deleteById(id);
    }
}
