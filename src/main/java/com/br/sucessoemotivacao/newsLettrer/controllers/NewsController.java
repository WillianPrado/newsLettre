package com.br.sucessoemotivacao.newsLettrer.controllers;

import com.br.sucessoemotivacao.newsLettrer.dto.request.NewsDTO;
import com.br.sucessoemotivacao.newsLettrer.dto.request.PersonDTO;
import com.br.sucessoemotivacao.newsLettrer.dto.response.MessageResponseDTO;
import com.br.sucessoemotivacao.newsLettrer.exception.NewsNotFoundException;
import com.br.sucessoemotivacao.newsLettrer.exception.PersonNotFoundException;
import com.br.sucessoemotivacao.newsLettrer.services.NewService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/api/v1/news")
@AllArgsConstructor(onConstructor = @__(@Autowired))
public class NewsController {
    private final NewService newService;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    
    public MessageResponseDTO create(@RequestBody @Valid NewsDTO newsDTO) {
        return newService.create(newsDTO);
    }

    @GetMapping
    public List<NewsDTO> listAll() {
        return newService.listAll();
    }

    @GetMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    public NewsDTO findById(@PathVariable Long id) throws NewsNotFoundException {
        return newService.findById(id);
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void delete(@PathVariable Long id) throws NewsNotFoundException {
        newService.delete(id);
    }
}
