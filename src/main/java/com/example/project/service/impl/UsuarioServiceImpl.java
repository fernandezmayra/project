
package com.example.project.service.impl;

import com.example.project.model.Usuario;
import com.example.project.repository.IUsuarioRepository;
import com.example.project.service.IUsuarioService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UsuarioServiceImpl implements IUsuarioService{

    @Autowired
    IUsuarioRepository repo;
    
    @Override
    public List<Usuario> listar() {
        return repo.findAll();
    }

    @Override
    public Usuario registrar(Usuario usuario) {
        return repo.save(usuario);
    }

    @Override
    public Usuario actualizar(Usuario usuario) {
         return repo.save(usuario);
    }

    @Override
    public void eliminar(int id) {
        repo.deleteById(id);
    }

    @Override
    public Usuario buscar(int id) {
        return repo.findById(id).orElse(null);
    }
    
}
