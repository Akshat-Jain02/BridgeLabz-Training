package com.reflection.dependencyinjection;

import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.Map;

public class SimpleDIContainer {

    private static final Map<Class<?>, Object> container = new HashMap<>();

    public static <T> T getBean(Class<T> clazz) {

        try {
            if (container.containsKey(clazz)) {
                return clazz.cast(container.get(clazz));
            }

            T instance = clazz.getDeclaredConstructor().newInstance();
            container.put(clazz, instance);

            for (Field field : clazz.getDeclaredFields()) {

                if (field.isAnnotationPresent(Inject.class)) {

                    Class<?> fieldType = field.getType();
                    Object dependency = getBean(fieldType);

                    field.setAccessible(true);
                    field.set(instance, dependency);
                }
            }

            return instance;

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
