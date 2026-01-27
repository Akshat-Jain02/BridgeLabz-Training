package com.annotations.jsonfield;
import java.lang.reflect.Field;

public class JsonSerializer {

    public static String toJson(Object obj) {
        StringBuilder json = new StringBuilder();
        json.append("{");

        Field[] fields = obj.getClass().getDeclaredFields();
        boolean first = true;

        try {
            for (Field field : fields) {

                if (field.isAnnotationPresent(JsonField.class)) {

                    field.setAccessible(true);
                    JsonField annotation = field.getAnnotation(JsonField.class);
                    String key = annotation.name();
                    Object value = field.get(obj);

                    if (!first) {
                        json.append(", ");
                    }

                    json.append("\"").append(key).append("\": ");

                    if (value instanceof String) {
                        json.append("\"").append(value).append("\"");
                    } else {
                        json.append(value);
                    }

                    first = false;
                }
            }
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        }

        json.append("}");
        return json.toString();
    }
}
