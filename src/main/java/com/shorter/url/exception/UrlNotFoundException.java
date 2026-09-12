package com.shorter.url.exception;

import org.springframework.http.HttpStatus;

import java.util.UUID;

public class UrlNotFoundException extends RuntimeException{
    public UrlNotFoundException(String url ) {
        super("URL Not Found: " + url);
    }
}
