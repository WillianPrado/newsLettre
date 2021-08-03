package com.br.sucessoemotivacao.newsLettrer.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class NewsNotFoundException extends Exception {

    public NewsNotFoundException(Long id) {
        super(String.format("News with ID %s not found!", id));
    }
}
