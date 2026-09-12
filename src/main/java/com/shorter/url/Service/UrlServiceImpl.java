package com.shorter.url.Service;

import com.shorter.url.entity.Urls;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public interface UrlServiceImpl{
    String createShortUrl(String url);

    String getOriginalUrl(String shortUrl);

    List<Urls> listAllUrls();

    List<Urls> getUrlsByAccessCount(int accessCount);

    void deleteUrl(UUID id);

    void deleteUrl(String shortUrl);

    void updateUrl(String shortUrl,String newUrl);

    void updateUrl(UUID id,String newUrl);
}