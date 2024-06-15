package com.daniel_azevedo.my_plutus.domain.model;

import jakarta.persistence.*;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@Entity
@Getter
@Setter
@NoArgsConstructor
@Table(name = "usuario")
public class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private Long id;

    private String nome;
    private String sobrenome;
    private String email;
    private String rg;
    private String cpf;
    private LocalDate dataNascimento;
    private LocalDate dataCadastro;
    private String senha;
    private String telefone;
    private String endereco;


}
