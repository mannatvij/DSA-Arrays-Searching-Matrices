public class buysellstocktotalprofit {
    public int profit(int []prices){
        int profit = 0;
        for(int i=1;i<prices.length;i++){
            if(prices[i]> prices[i-1]){
                profit += prices[i]-prices[i-1];
            }
        }
        return profit;
    }
    public static void main(String[] args) {
        int prices[]={4,8,9,2,1,12,6};
        buysellstocktotalprofit profit=new buysellstocktotalprofit();
        System.out.println(profit.profit(prices));
    }
}
