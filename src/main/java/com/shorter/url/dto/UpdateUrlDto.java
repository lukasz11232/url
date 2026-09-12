package com.shorter.url.dto;

import jakarta.validation.constraints.NotBlank;
import org.hibernate.validator.constraints.URL;

public record UpdateUrlDto(
        @NotBlank(message = "URL cannot be empty")
        @URL(message = "Invalid URL format")
       String short_url
){

}
