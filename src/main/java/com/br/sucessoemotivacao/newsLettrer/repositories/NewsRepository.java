package com.br.sucessoemotivacao.newsLettrer.repositories;


import com.br.sucessoemotivacao.newsLettrer.entities.News;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface NewsRepository extends JpaRepository<News, Long> {
    List<News> findByTituloContaining(String titulo);
    Optional<News> findByTitulo(String titulo);
}
