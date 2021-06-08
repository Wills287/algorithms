package com.wills.algorithms.calculate;

import org.springframework.stereotype.Component;

@Component
public class StockPriceRunner {

    /**
     * Calculate the best profit given an array of stock prices with a single buy and a single sell. The buy must occur
     * before the sell.
     *
     * @param array Array of prices.
     * @return Maximum profit.
     */
    public int calculateProfit(int[] array) {
        if (array.length < 2) {
            return 0;
        }

        int profit = array[1] - array[0];
        if (array.length == 2) {
            return profit;
        }

        int minimum = Integer.MAX_VALUE;

        for (int x : array) {
            if ((x - minimum) > profit) {
                profit = x - minimum;
            } else if (x < minimum) {
                minimum = x;
            }
        }
        return profit;
    }
}
