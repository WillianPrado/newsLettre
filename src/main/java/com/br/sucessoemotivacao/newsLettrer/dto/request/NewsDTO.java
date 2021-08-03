package com.br.sucessoemotivacao.newsLettrer.dto.request;

import com.br.sucessoemotivacao.newsLettrer.entities.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class NewsDTO {
    private Long id;

    @NotEmpty
    @Size(min = 2)
    private String titulo;

    @NotEmpty
    @Size(min = 2)
    private String conteudo;

    private String data_captura;

    private Long qtd_pessoas;

    @ManyToOne
    private FaixaEtarias faixaEtarias;

    @ManyToOne
    private Estados estados;

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
