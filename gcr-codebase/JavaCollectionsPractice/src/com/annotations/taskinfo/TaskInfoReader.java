package com.annotations.taskinfo;

import java.lang.reflect.Method;

public class TaskInfoReader {

    public static void main(String[] args) throws Exception {

        Class<TaskManager> clazz = TaskManager.class;

        Method method = clazz.getDeclaredMethod("completeTask");

        if (method.isAnnotationPresent(TaskInfo.class)) {

            TaskInfo taskInfo = method.getAnnotation(TaskInfo.class);

            System.out.println("Priority: " + taskInfo.priority());
            System.out.println("Assigned To: " + taskInfo.assignedTo());
        }
    }
}
