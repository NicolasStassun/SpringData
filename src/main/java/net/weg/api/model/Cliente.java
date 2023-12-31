package net.weg.api.model;

import jakarta.persistence.*;
import lombok.*;
import org.springframework.boot.autoconfigure.domain.EntityScan;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Set;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "usuario")

public class Cliente {
    @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
           private Integer id;
   @Column(name = "username", unique = true, nullable = false)
    private String usuario;
    private String senha;
    private Integer idade;
    @ManyToOne(cascade = CascadeType.PERSIST)
    private Carro carro;
    @OneToMany(mappedBy = "cliente")
    private Set<Seguro> seguros;


}
