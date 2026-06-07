package day1;

public class BestTimeBuySell {
    public static void main(String[] args) {
        // int[] stocks = {7,1,5,3,6,4};
        int[] stocks = {90,40,20,10,4};
        if(stocks.length<2) return;
        int cBuy = stocks[0], cSell = stocks[1];
        int mPro = cSell - cBuy;
        for(int curr=1;curr<stocks.length;curr++){
            int cPro = stocks[curr] - cBuy;
            if(cPro>mPro){
                mPro = cPro;
                cSell = stocks[curr];
            }
            if(stocks[curr]<cBuy) cBuy = stocks[curr];
        }
        System.out.println((cSell-mPro)+" "+cSell);
    }
}
