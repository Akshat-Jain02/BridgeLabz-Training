package com.stacks.stockspanproblem;

class StockSpanCalculator {

    public static int[] calculateSpan(int[] prices) {
    	
        int n = prices.length;
        int[] span = new int[n];

        Stack indexStack = new Stack(n);

        // First day span is always 1
        span[0] = 1;
        indexStack.push(0);

        for (int currentDay = 1; currentDay < n; currentDay++) {

            while (!indexStack.isEmpty()
                    && prices[indexStack.peek()] <= prices[currentDay]) {
                indexStack.pop();
            }

            span[currentDay] = indexStack.isEmpty()
                    ? currentDay + 1
                    : currentDay - indexStack.peek();

            indexStack.push(currentDay);
        }

        return span;
    }
}
