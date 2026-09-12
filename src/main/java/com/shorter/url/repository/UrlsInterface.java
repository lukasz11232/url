package com.shorter.url.repository;

import com.shorter.url.entity.Urls;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface UrlsInterface extends JpaRepository<Urls, UUID>{

    Urls findByShortUrl(String shortUrl);

    boolean existsByShortUrl(String shortUrl);
    boolean existsByUrl(String url);
}
