package com.br.sucessoemotivacao.newsLettrer.dto.mapper;

import com.br.sucessoemotivacao.newsLettrer.dto.request.PersonDTO;
import com.br.sucessoemotivacao.newsLettrer.entities.Person;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface PersonMapper {

    @Mapping(target = "birthDate", source = "birthDate", dateFormat = "dd-MM-yyyy")
    Person toModel(PersonDTO dto);

    PersonDTO toDTO(Person dto);
}