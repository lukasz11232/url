package com.shorter.url.dto;

import com.fasterxml.jackson.annotation.JsonAlias;
import jakarta.validation.constraints.NotBlank;

import java.util.UUID;

public record DeleteUrlByIdDto(
        @NotBlank(message = "ID cannot be blank")
        @JsonAlias({"id", "urlId", "identifier"})
        UUID id
){
}
