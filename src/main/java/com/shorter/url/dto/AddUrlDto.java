package com.shorter.url.dto;

import com.fasterxml.jackson.annotation.JsonAlias;
import jakarta.validation.constraints.NotBlank;
import org.hibernate.validator.constraints.URL;

public record AddUrlDto(
        @NotBlank(message = "URL cannot be blank")
        @JsonAlias({"url", "originalUrl","link"})
        @URL(message = "Invalid URL format")
        String url
){
}
