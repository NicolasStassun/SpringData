package net.weg.api.repository;



import net.weg.api.model.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRepository extends JpaRepository<Cliente,Integer> {

}
