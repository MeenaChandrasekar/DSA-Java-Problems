package InterviewQuestionJava;

public class BestTimetoBuyandSellStock {
	//max profit ?
	    /*public int maxProfit(int[] prices) {
	        int min_price = prices[0];
	        int maxprof = 0;

	        for(int i=0;i<prices.length;i++){
	            maxprof = Math.max(maxprof,prices[i]-min_price);
	            min_price = Math.min(prices[i],min_price);
	        }
	        return maxprof;
	    }
	}*/
	  int maxProfit(int[] prices) {

	    // at the beginning the minimum price is the first price
	    int buy_price = prices[0];

	    // at the beginning the minimum  profit is zero
	    int profit = 0;

	    for (int i = 1; i < prices.length; i++) {

	      // if the current price is less update the buy_price
	                 //New price=1, buy price=7 , need to update
	                 //O(n)time complex, O(1)-space
	    	if (prices[i] < buy_price) {
	        buy_price = prices[i];
	      }
	      else {
	        // else check if we can get a better profit
	        int current_profit = prices[i] - buy_price;
	        profit = Math.max(current_profit, profit);
	      }
	    }

	    return profit;
	  }

	}