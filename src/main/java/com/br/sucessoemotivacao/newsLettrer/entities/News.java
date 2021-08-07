package com.br.sucessoemotivacao.newsLettrer.entities;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor

public class News {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String titulo;

    @Column(nullable = false)
    private String conteudo;

    private String data_captura;

    @Column(nullable = false)
    private Long qtd_pessoas;

    @ManyToOne
    private Estados estados;

    @ManyToOne
    private FaixaEtarias faixaEtarias;

    @ManyToOne
    private Generos generos;

    @ManyToOne
    private Etinias etinias;

    @ManyToOne
    private TipoDeCasos tipoDeCasos;

    @ManyToOne
    private Capitais capitais;

    @ManyToOne
    private Imagens imagens;


}