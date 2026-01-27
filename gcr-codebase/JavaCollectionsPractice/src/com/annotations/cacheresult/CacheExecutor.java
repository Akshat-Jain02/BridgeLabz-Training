package com.annotations.cacheresult;

import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

public class CacheExecutor {

    private static final Map<String, Object> cache = new HashMap<>();

    public static Object execute(Object obj, String methodName, Object... args) {
        try {
            Method method = obj.getClass().getMethod(methodName, int.class);

            if (method.isAnnotationPresent(CacheResult.class)) {

                String cacheKey = generateKey(methodName, args);

                if (cache.containsKey(cacheKey)) {
                    System.out.println("Returning cached result");
                    return cache.get(cacheKey);
                }

                Object result = method.invoke(obj, args);
                cache.put(cacheKey, result);
                return result;
            }

            return method.invoke(obj, args);

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    private static String generateKey(String methodName, Object[] args) {
        StringBuilder key = new StringBuilder(methodName);
        for (Object arg : args) {
            key.append("_").append(arg);
        }
        return key.toString();
    }
}
