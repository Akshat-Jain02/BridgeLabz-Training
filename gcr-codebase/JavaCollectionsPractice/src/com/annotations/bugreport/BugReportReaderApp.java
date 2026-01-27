package com.annotations.bugreport;
import java.lang.reflect.Method;

public class BugReportReaderApp {

    public static void main(String[] args) throws Exception {

        Method method =
                BugTracker.class.getDeclaredMethod("processData");

        BugReport[] bugReports =
                method.getAnnotationsByType(BugReport.class);

        for (BugReport bugReport : bugReports) {
            System.out.println("Bug: " + bugReport.description());
        }
    }
}
