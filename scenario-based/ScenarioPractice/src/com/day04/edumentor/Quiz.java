package com.day04.edumentor;

class Quiz {

    private String[] questions;          
    private final int[] correctAnswers; 
    private int score;
    private String difficulty;

    public Quiz(String difficulty) {
        this.difficulty = difficulty;

        if (difficulty.equalsIgnoreCase("easy")) {
            questions = new String[]{"2+2?", "5-3?"};
            correctAnswers = new int[]{4, 2};
        } else {
            questions = new String[]{"10*2?", "20/4?"};
            correctAnswers = new int[]{20, 5};
        }
    }

    public void evaluateQuiz(int[] userAnswers) {
        score = 0;

        for (int i = 0; i < correctAnswers.length; i++) {
            if (userAnswers[i] == correctAnswers[i]) {
                score++;   // operator used
            }
        }
    }

    public int getPercentage() {
        return (score * 100) / correctAnswers.length;
    }
}
