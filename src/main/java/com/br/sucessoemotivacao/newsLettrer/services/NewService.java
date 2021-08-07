package com.br.sucessoemotivacao.newsLettrer.services;

import com.br.sucessoemotivacao.newsLettrer.dto.mapper.NewsMapper;
import com.br.sucessoemotivacao.newsLettrer.dto.request.NewsDTO;
import com.br.sucessoemotivacao.newsLettrer.dto.request.PersonDTO;
import com.br.sucessoemotivacao.newsLettrer.dto.response.MessageResponseDTO;
import com.br.sucessoemotivacao.newsLettrer.entities.News;
import com.br.sucessoemotivacao.newsLettrer.entities.Person;
import com.br.sucessoemotivacao.newsLettrer.exception.NewsNotFoundException;
import com.br.sucessoemotivacao.newsLettrer.exception.PersonNotFoundException;
import com.br.sucessoemotivacao.newsLettrer.repositories.NewsRepository;
import lombok.AllArgsConstructor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;


@Service
@AllArgsConstructor(onConstructor = @__(@Autowired))
public class NewService {
    private final NewsRepository newsRepository;
    private final NewsMapper newsMapper;


    public MessageResponseDTO create(NewsDTO newsDTO) {
        News news = newsMapper.toModel(newsDTO);
        News savedNews = newsRepository.save(news);

        MessageResponseDTO messageResponse = createMessageResponse("Person successfully created with ID ", savedNews.getId());

        return messageResponse;
    }

    public List<NewsDTO> listAll() {
        List<News> news = newsRepository.findAll();
        return news.stream()
                .map(newsMapper::toDTO)
                .collect(Collectors.toList());
    }

    public NewsDTO findById(Long id) throws NewsNotFoundException {
        News news = newsRepository.findById(id)
                .orElseThrow(() -> new NewsNotFoundException(id));

        return newsMapper.toDTO(news);
    }

    public void delete(Long id) throws NewsNotFoundException {
        newsRepository.findById(id)
                .orElseThrow(() -> new NewsNotFoundException(id));

        newsRepository.deleteById(id);
    }

    private MessageResponseDTO createMessageResponse(String s, Long id2) {
        return MessageResponseDTO.builder()
                .message(s + id2)
                .build();
    }
}
