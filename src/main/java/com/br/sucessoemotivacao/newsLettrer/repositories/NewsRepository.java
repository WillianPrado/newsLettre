package com.br.sucessoemotivacao.newsLettrer.repositories;


import com.br.sucessoemotivacao.newsLettrer.entities.News;
import org.springframework.data.jpa.repository.JpaRepository;

public interface NewsRepository extends JpaRepository<News, Long> {
}
