package com.number26.bitcoinprice.models;

import com.number26.bitcoinprice.utils.Utility;

/**
 * Created by mua on 3/21/2016.
 */
public class BitCoinModel {

    public String x;//this is the timestamp
    public String y;//this is the USD value of bitcoin

    public String getX() {
        String date = Utility.convertTimeStampToDate(x);
        return  date;
    }

    public void setX(String x) {
       this.x = x;
    }

    public String getY() {
        return y;
    }

    public void setY(String y) {
        this.y = y;
    }


}
