package com.annotations.todo;

public class FeatureService {

    @Todo(
        task = "Implement user authentication",
        assignedTo = "Akshat",
        priority = "HIGH"
    )
    public void loginFeature() {
    }

    @Todo(
        task = "Add input validation",
        assignedTo = "Ravi"
    )
    public void validationFeature() {
    }

    @Todo(
        task = "Optimize database queries",
        assignedTo = "Neha",
        priority = "LOW"
    )
    public void optimizationFeature() {
    }
}
