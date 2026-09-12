package com.shorter.url.mapper;

import com.shorter.url.dto.UrlDto;
import com.shorter.url.entity.Urls;
import org.springframework.stereotype.Component;

import java.util.UUID;

@Component
public class UrlMapper{


    public UrlDto toDto(Urls entity){
         if(entity == null){
            return null;
        }
        return new UrlDto(
                entity.getId(),
                entity.getUrl(),
                entity.getShortUrl(),
                entity.getCreatedAt(),
                entity.getUpdatedAt(),
                entity.getAccessCount()
        );
    }

    public Urls toEntity(UrlDto dto){
        if(dto == null){
            return null;
        }
        return new Urls(
                dto.id(),
                dto.url(),
                dto.shortCode(),
                dto.createdAt(),
                dto.updatedAt(),
                dto.accessCount()
        );
    }



}
