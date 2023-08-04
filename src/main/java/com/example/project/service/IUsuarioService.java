
package com.example.project.service;

import com.example.project.model.Usuario;
import java.util.List;


public interface IUsuarioService {
    
    List<Usuario> listar();
    Usuario registrar(Usuario usuario);
    Usuario actualizar(Usuario usuario);
    void eliminar(int id);
    Usuario buscar(int id);
    
}
