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
public class Imagens {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private Long id_categoria;

    @Column(nullable = false)
    private String nome;

    @Column(nullable = false)
    private String url;

    @Column(nullable = false)
    private String dataUpload;
}