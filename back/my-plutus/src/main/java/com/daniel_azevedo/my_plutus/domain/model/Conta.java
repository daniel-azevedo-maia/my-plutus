package com.daniel_azevedo.my_plutus.domain.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDate;

@Entity
@Getter
@Setter
@NoArgsConstructor
@Table(name = "conta")
public class Conta {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private Long id;

    private String banco;

    private String numAgencia; // Número da agência

    private String numConta; // Número da conta

    @Enumerated(EnumType.STRING)
    private TipoConta tipo; // Tipo de conta (CORRENTE, POUPANCA, INVESTIMENTO)

    private BigDecimal saldo; // Saldo da conta

    private LocalDate dataAbertura; // Data de abertura da conta


}
