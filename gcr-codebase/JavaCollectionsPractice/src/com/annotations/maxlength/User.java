package com.annotations.maxlength;
import java.lang.reflect.Field;

public class User {

    @MaxLength(10)
    private String username;

    public User(String username) {
        validateMaxLength(username);
        this.username = username;
    }

    private void validateMaxLength(String value) {
        try {
            Field field = this.getClass().getDeclaredField("username");

            if (field.isAnnotationPresent(MaxLength.class)) {
                MaxLength maxLength = field.getAnnotation(MaxLength.class);

                if (value != null && value.length() > maxLength.value()) {
                    throw new IllegalArgumentException(
                        "username length exceeds maximum of " + maxLength.value()
                    );
                }
            }
        } catch (NoSuchFieldException e) {
            throw new RuntimeException(e);
        }
    }

    public String getUsername() {
        return username;
    }
}
