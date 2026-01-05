package com.stacks.stockspanproblem;

public class StockSpanProblem {
	
    public static void main(String[] args) {

        int[] prices = {100, 80, 60, 70, 60, 75, 85};

        int[] span = StockSpanCalculator.calculateSpan(prices);

        System.out.println("Stock Spans:");
        for (int value : span) {
            System.out.print(value + " ");
        }
    }
}
