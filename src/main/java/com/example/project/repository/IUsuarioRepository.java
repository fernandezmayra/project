
package com.example.project.repository;

import com.example.project.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;


public interface IUsuarioRepository extends JpaRepository<Usuario, Integer>{
    
}
