package com.day04.edumentor;

public class EduMentor {

    public static void main(String[] args) {

        Learner learner1 = new Learner("Akshat", "akshat@gmail.com", 101, 100, "full-time");
        Learner learner2 = new Learner("Rahul", "rahul@gmail.com", 102, 85, "short");

        learner1.generateCertificate();
        learner2.generateCertificate();

        Quiz quiz = new Quiz("easy");
        int[] answers = {4, 2};

        quiz.evaluateQuiz(answers);
        System.out.println("Quiz Percentage: " + quiz.getPercentage() + "%");
    }
}
