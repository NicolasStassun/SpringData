package net.weg.api.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@Table(name = "tb_plano")

public class Seguro {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private Double valor;
    private String nome;
    private String descricao;
    private Double valorFranquia;
    @ManyToMany
    private Seguradora seguradora;
    @OneToOne
    private Carro carro;
    @ManyToOne
    private Cliente cliente;

}
