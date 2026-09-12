package com.shorter.url.Service;

import com.shorter.url.entity.Urls;

import java.util.List;
import java.util.UUID;

public class UrlService implements UrlServiceImpl{
    @Override
    public String createShortUrl(String url){
        return "";
    }

    @Override
    public String getOriginalUrl(String shortUrl){
        return "";
    }

    @Override
    public List<Urls> listAllUrls(){
        return List.of();
    }

    @Override
    public List<Urls> getUrlsByAccessCount(int accessCount){
        return List.of();
    }

    @Override
    public void deleteUrl(UUID id){

    }

    @Override
    public void deleteUrl(String shortUrl){

    }

    @Override
    public void updateUrl(String shortUrl,String newUrl){

    }

    @Override
    public void updateUrl(UUID id,String newUrl){

    }
}
