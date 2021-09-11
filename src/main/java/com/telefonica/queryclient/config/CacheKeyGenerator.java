package com.telefonica.queryclient.config;

import org.springframework.cache.interceptor.KeyGenerator;
import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;

import java.lang.reflect.Method;

@Component("customKeyGenerator")
public class CacheKeyGenerator implements KeyGenerator {

    @Override
    public Object generate(final Object target, final Method method,
                           final Object... params) {
        return target.getClass().getSimpleName() + "_"
                + method.getName() + "_"
                + StringUtils.arrayToDelimitedString(params, "_");
    }

}
