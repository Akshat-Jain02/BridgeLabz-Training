package com.annotations.roleallowed;

public class RoleBasedAccessApp {

    public static void main(String[] args) {

        AdminService service = new AdminService();

        UserContext.setRole("USER");
        AccessController.invokeMethod(service, "deleteUser");

        UserContext.setRole("ADMIN");
        AccessController.invokeMethod(service, "deleteUser");

        AccessController.invokeMethod(service, "viewUser");
    }
}
