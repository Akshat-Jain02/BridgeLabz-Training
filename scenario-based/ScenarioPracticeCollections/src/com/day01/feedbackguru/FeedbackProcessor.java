package com.day01.feedbackguru;

import java.io.*;
import java.util.*;
import java.util.regex.*;

public class FeedbackProcessor<T> {

    private static final Pattern RATING_PATTERN = Pattern.compile("\\b(\\d{1,2})/10\\b");

    public List<Feedback<T>> readFeedbackFiles(String folderPath, T feedbackType) {
        List<Feedback<T>> feedbackList = new ArrayList<>();

        File folder = new File(folderPath);
        if (!folder.exists() || !folder.isDirectory()) {
            System.out.println("Invalid folder path: " + folderPath);
            return feedbackList;
        }

        File[] files = folder.listFiles((dir, name) -> name.toLowerCase().endsWith(".txt"));
        if (files == null) return feedbackList;

        for (File file : files) {
            try (BufferedReader br = new BufferedReader(new FileReader(file))) {
                String line;
                while ((line = br.readLine()) != null) {
                    try {
                        Matcher matcher = RATING_PATTERN.matcher(line);
                        int rating = 0;
                        if (matcher.find()) {
                            rating = Integer.parseInt(matcher.group(1));
                        } else {
                            throw new IllegalArgumentException("No rating found");
                        }
                        feedbackList.add(new Feedback<>(feedbackType, line, rating));
                    } catch (Exception e) {
                        System.out.println("Skipping invalid line in " + file.getName() + ": " + line);
                    }
                }
            } catch (IOException e) {
                System.out.println("Error reading file: " + file.getName());
            }
        }
        return feedbackList;
    }

    public Map<String, List<Feedback<T>>> categorizeFeedback(List<Feedback<T>> feedbackList) {
        Map<String, List<Feedback<T>>> categorized = new HashMap<>();
        categorized.put("Positive", new ArrayList<>());
        categorized.put("Neutral", new ArrayList<>());
        categorized.put("Negative", new ArrayList<>());

        for (Feedback<T> feedback : feedbackList) {
            int rating = feedback.getRating();
            if (rating >= 8) {
                categorized.get("Positive").add(feedback);
            } else if (rating >= 5) {
                categorized.get("Neutral").add(feedback);
            } else {
                categorized.get("Negative").add(feedback);
            }
        }
        return categorized;
    }

    public void printCategorizedFeedback(Map<String, List<Feedback<T>>> categorized) {
        for (String category : Arrays.asList("Positive", "Neutral", "Negative")) {
            System.out.println("\n" + category + " Feedback:");
            List<Feedback<T>> list = categorized.get(category);
            if (list.isEmpty()) {
                System.out.println("None");
            } else {
                for (Feedback<T> f : list) {
                    System.out.println(f);
                }
            }
        }
    }
}
