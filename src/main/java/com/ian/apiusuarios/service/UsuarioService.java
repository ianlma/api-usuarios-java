package com.ian.apiusuarios.service;

import com.ian.apiusuarios.model.Usuario;
import java.util.List;

public interface UsuarioService {
    List<Usuario> listarTodos();
    Usuario salvar(Usuario usuario);
    Usuario atualizar(Long id, Usuario usuario);
    void deletar(Long id);
}