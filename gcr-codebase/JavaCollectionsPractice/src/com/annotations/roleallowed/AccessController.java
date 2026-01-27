package com.annotations.roleallowed;
import java.lang.reflect.Method;

public class AccessController {

    public static void invokeMethod(Object obj, String methodName) {
        try {
            Method method = obj.getClass().getMethod(methodName);

            if (method.isAnnotationPresent(RoleAllowed.class)) {
                RoleAllowed roleAllowed = method.getAnnotation(RoleAllowed.class);
                String requiredRole = roleAllowed.value();

                if (!requiredRole.equals(UserContext.getRole())) {
                    System.out.println("Access Denied!");
                    return;
                }
            }

            method.invoke(obj);

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
