package com.telefonica.queryclient.config;

import org.springframework.cache.Cache;
import org.springframework.cache.CacheManager;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.cache.concurrent.ConcurrentMapCache;
import org.springframework.cache.support.SimpleCacheManager;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Arrays;

@Configuration
@EnableCaching
public class CacheConfig {

    @Bean
    public CacheManager cacheManager() {
        SimpleCacheManager cacheManager = new SimpleCacheManager();
        Cache ClientCache = new ConcurrentMapCache("findByTypeDocAndNumDoc");
       Cache ClientCache2 = new ConcurrentMapCache("findClientsByDate");
        cacheManager.setCaches(Arrays.asList(ClientCache,ClientCache2 ));
        return cacheManager;
    }
}
