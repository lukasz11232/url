package com.shorter.url.controller;


import com.shorter.url.Service.UrlService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/urls")
public class UrlController{
    private final UrlService urlService;
}
