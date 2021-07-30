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
    private Long id_estado;

    @Column(nullable = false)
    private Long id_faixa_etaria;

    @Column(nullable = false)
    private Long id_genero;

    @Column(nullable = false)
    private Long id_etinia;

    @Column(nullable = false)
    private Long id_tipo_de_caso;

    @Column(nullable = false)
    private Long id_capital;

    @Column(nullable = false)
    private Long id_imagem;

    @Column(nullable = false)
    private Long qtd_pessoas;

}