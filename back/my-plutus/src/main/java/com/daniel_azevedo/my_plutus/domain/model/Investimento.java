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
@Table(name = "investimento")
public class Investimento {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private Long id;

    private String nome;

    private BigDecimal valorInicial;

    private BigDecimal valorAtual;

    private LocalDate dataInicio;

    private LocalDate dataVencimento;

    @Enumerated(EnumType.STRING)
    private TipoInvestimento tipo;

    private BigDecimal rendimento;

    private String descricao;
}
