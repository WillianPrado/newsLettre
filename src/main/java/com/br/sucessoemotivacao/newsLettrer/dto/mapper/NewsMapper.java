package com.br.sucessoemotivacao.newsLettrer.dto.mapper;

import com.br.sucessoemotivacao.newsLettrer.dto.request.NewsDTO;
import com.br.sucessoemotivacao.newsLettrer.entities.News;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface NewsMapper {

    @Mapping(target = "dataCaptura", source = "dataCaptura", dateFormat = "dd-MM-yyyy")
    News toModel(NewsDTO dto);

    NewsDTO toDTO(News dto);
}
