package com.bolsadeideas.springboot.backend.apirest.models.dao;

import com.bolsadeideas.springboot.backend.apirest.models.entity.Usuario;
import org.springframework.data.repository.CrudRepository;

public interface IUsuarioDao extends CrudRepository<Usuario, Long> {

    public Usuario findByUsername(String username);

    /*
    @Query("SELECT u FROM Usuario u WHERE u.username=?1")
    public Usuario findByUsuario(String usuario);

     */

}
