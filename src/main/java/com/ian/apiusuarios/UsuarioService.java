package com.ian.apiusuarios.service;

import com.ian.apiusuarios.model.Usuario;
import java.util.List;

public interface UsuarioService {
    List<Usuario> listarTodos();
    Usuario salvar(Usuario usuario);
    Usuario atualizar(Long id, Usuario usuario);
    void deletar(Long id);
}

package com.ian.apiusuarios.service;

import com.ian.apiusuarios.model.Usuario;
import com.ian.apiusuarios.repository.UsuarioRepository;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class UsuarioServiceImpl implements UsuarioService {

    private final UsuarioRepository repository;
    public UsuarioServiceImpl(UsuarioRepository repository) {
        this.repository = repository;
    }

    @Override
    public List<Usuario> listarTodos() {
        return repository.findAll();
    }

    @Override
    public Usuario salvar(Usuario usuario) {
        return repository.save(usuario);
    }

    @Override
    public Usuario atualizar(Long id, Usuario dadosNovos) {
        return repository.findById(id)
                .map(usuarioExistente -> {
                    usuarioExistente.setNome(dadosNovos.getNome());
                    usuarioExistente.setEmail(dadosNovos.getEmail());
                    return repository.save(usuarioExistente);
                }).orElseThrow(() -> new RuntimeException("Usuário não encontrado com id: " + id));
    }

    @Override
    public void deletar(Long id) {
        repository.deleteById(id);
    }
}
