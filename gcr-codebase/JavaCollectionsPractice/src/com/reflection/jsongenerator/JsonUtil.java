package com.reflection.jsongenerator;
import java.lang.reflect.Field;

public class JsonUtil {

    public static String toJson(Object obj) {

        if (obj == null) return "null";

        Class<?> clazz = obj.getClass();
        Field[] fields = clazz.getDeclaredFields();

        StringBuilder json = new StringBuilder();
        json.append("{");

        for (int i = 0; i < fields.length; i++) {
            try {
                Field field = fields[i];
                field.setAccessible(true);

                json.append("\"")
                    .append(field.getName())
                    .append("\":");

                Object value = field.get(obj);

                if (value instanceof String) {
                    json.append("\"").append(value).append("\"");
                } else {
                    json.append(value);
                }

                if (i < fields.length - 1) {
                    json.append(", ");
                }

            } catch (IllegalAccessException e) {
                throw new RuntimeException(e);
            }
        }

        json.append("}");
        return json.toString();
    }
}
