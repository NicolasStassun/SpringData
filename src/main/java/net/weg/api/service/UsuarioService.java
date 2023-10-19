package net.weg.api.service;

import lombok.AllArgsConstructor;
import net.weg.api.model.Cliente;
import net.weg.api.repository.UsuarioRepository;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service
@AllArgsConstructor
public class UsuarioService {

    private UsuarioRepository usuarioRepository;

    public Cliente buscarUm(Integer id){
        return usuarioRepository.findById(id).get();
    }

    public Collection<Cliente> buscarTodos(){
       return usuarioRepository.findAll();
    }

    public void deletar(Integer id){
        usuarioRepository.deleteById(id);
    }

    public void salvar(Cliente cliente){
        usuarioRepository.save(cliente);
    }
}
