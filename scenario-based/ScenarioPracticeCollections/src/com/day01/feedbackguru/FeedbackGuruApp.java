package com.day01.feedbackguru;
import java.util.List;
import java.util.Map;

public class FeedbackGuruApp {

    public static void main(String[] args) {

        
        String serviceFeedbackFolder = "feedback/service";
        String productFeedbackFolder = "feedback/product";

        
        String serviceType = "Service";
        String productType = "Product";

        FeedbackProcessor<String> processor = new FeedbackProcessor<>();

        // Read feedback from service folder
        List<Feedback<String>> serviceFeedback = processor.readFeedbackFiles(serviceFeedbackFolder, serviceType);

        // Read feedback from product folder
        List<Feedback<String>> productFeedback = processor.readFeedbackFiles(productFeedbackFolder, productType);

        // Combine all feedbacks
        List<Feedback<String>> allFeedback = serviceFeedback;
        allFeedback.addAll(productFeedback);

        // Categorize feedback
        Map<String, List<Feedback<String>>> categorizedFeedback = processor.categorizeFeedback(allFeedback);

        // Print categorized feedback
        processor.printCategorizedFeedback(categorizedFeedback);
    }
}
