    package com.ian.apiusuarios.controller;
    
    import com.ian.apiusuarios.model.Usuario;
    import com.ian.apiusuarios.service.UsuarioService; // Importando o Service novo
    import jakarta.validation.Valid;
    import org.springframework.http.HttpStatus;
    import org.springframework.web.bind.annotation.*;
    
    import java.util.List;
    
    @RestController
    @RequestMapping("/usuarios")
    @CrossOrigin(origins = "*")
    public class UsuarioController {
    
        private final UsuarioService service; // Agora usamos o Service
    
        public UsuarioController(UsuarioService service) {
            this.service = service;
        }
    
        @GetMapping
        public List<Usuario> listar() {
            return service.listarTodos();
        }
    
        @PostMapping
        @ResponseStatus(HttpStatus.CREATED)
        public Usuario criar(@Valid @RequestBody Usuario usuario) {
            return service.salvar(usuario);
        }
    
        @PutMapping("/{id}")
        public Usuario atualizar(@PathVariable Long id, @RequestBody Usuario usuario) {
            return service.atualizar(id, usuario);
        }
    
        @DeleteMapping("/{id}")
        @ResponseStatus(HttpStatus.NO_CONTENT)
        public void deletar(@PathVariable Long id) {
            service.deletar(id);
        }
    }