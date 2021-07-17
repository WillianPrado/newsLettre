package com.br.sucessoemotivacao.newsLettrer.repositories;

import com.br.sucessoemotivacao.newsLettrer.entities.Person;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonRepository extends JpaRepository<Person, Long> {
}
