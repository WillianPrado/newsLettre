package com.br.sucessoemotivacao.newsLettrer.dto.request;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

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

    private String dataCaptura;
}
