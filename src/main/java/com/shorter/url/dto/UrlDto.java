package com.shorter.url.dto;

import com.fasterxml.jackson.annotation.JsonInclude;

import java.time.Instant;
import java.util.UUID;

@JsonInclude(JsonInclude.Include.NON_NULL)//
public record UrlDto(
         UUID id,
         String url,
         String shortCode,
         Instant createdAt,
         Instant updatedAt,
         Integer accessCount
) {
}
