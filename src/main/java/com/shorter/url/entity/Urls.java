package com.shorter.url.entity;

import jakarta.persistence.*;
import lombok.*;

import java.time.Instant;
import java.util.Objects;
import java.util.UUID;

@Builder
@NoArgsConstructor
@AllArgsConstructor


@Getter
@Setter


@Entity
@Table(name = "urls")
public class Urls{
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    @Column(name = "url", nullable = false)
    private String url;

    @Column(name = "short_url",nullable = false, length = 50,unique = true)
    private String shortUrl;

    @Column(name = "created_at")
    private Instant createdAt;

    @Column(name = "updated_at")
    private Instant updatedAt;

    @Column(name = "access_count")
    @Builder.Default
    private Integer accessCount = 0;

    @PrePersist
   protected void onCreate(){
        createdAt = Instant.now();
        updatedAt = Instant.now();
        if(accessCount == null){
            accessCount = 0;
        }
    }
    @PreUpdate
    protected void onUpdate() {
        this.updatedAt = Instant.now();
    }



    @Override
    public boolean equals(Object o){
        if (o == null || getClass() != o.getClass()) return false;

        Urls urls = (Urls) o;
        return Objects.equals(id,urls.id) && Objects.equals(url,urls.url) && Objects.equals(shortUrl,urls.shortUrl) && Objects.equals(createdAt,urls.createdAt) && Objects.equals(updatedAt,urls.updatedAt) && Objects.equals(accessCount,urls.accessCount);
    }

    @Override
    public int hashCode(){
        int result = Objects.hashCode(id);
        return result;
    }

    @Override
    public String toString(){
        return "urls{" +
                "id=" + id +
                ", url='" + url + '\'' +
                ", shortUrl='" + shortUrl + '\'' +
                ", createdAt=" + createdAt +
                ", updatedAt=" + updatedAt +
                ", accessCount=" + accessCount +
                '}';
    }
}
