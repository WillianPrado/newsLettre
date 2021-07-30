package com.br.sucessoemotivacao.newsLettrer.dto.request;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
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

    private Long id_estado;

    private Long id_faixa_etaria;

    private Long id_genero;

    private Long id_etinia;

    private Long id_tipo_de_caso;

    private Long id_capital;

    private Long id_imagem;

    private Long qtd_pessoas;
}
