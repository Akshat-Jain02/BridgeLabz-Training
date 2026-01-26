package com.reflection.objectmapper;

import java.lang.reflect.Field;
import java.util.Map;

public class ObjectMapper {

    public static <T> T toObject(Class<T> clazz, Map<String, Object> properties) {

        try {
            T obj = clazz.getDeclaredConstructor().newInstance();

            for (Map.Entry<String, Object> entry : properties.entrySet()) {

                Field field = clazz.getDeclaredField(entry.getKey());
                field.setAccessible(true);
                field.set(obj, entry.getValue());
            }

            return obj;

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
