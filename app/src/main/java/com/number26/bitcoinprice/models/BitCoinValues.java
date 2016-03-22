package com.number26.bitcoinprice.models;

import android.util.Log;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by mua on 3/21/2016.
 */
public class BitCoinValues {

    @SerializedName("values")
    @Expose
    List<BitCoinModel> values;

    HashMap<String,String> dateAndValues = new HashMap<>();

    public List<String> getRateDate(){

        initializeHashMap();

        List<String> dateLegendString = new ArrayList<>();

       for(Map.Entry<String,String> entry : dateAndValues.entrySet()){

            dateLegendString.add(entry.getKey());
        }

        return dateLegendString;
    }

    public List<Float> getBitCoinUsdValues(){

        initializeHashMap();
        List<Float> bitCoinUSDVals = new ArrayList<>();

        for(Map.Entry<String,String> entry : dateAndValues.entrySet()){

            bitCoinUSDVals.add(Float.parseFloat(entry.getValue()));

        }

        return bitCoinUSDVals;
    }


    public void initializeHashMap(){

        if(!(dateAndValues.size()>0)) {

            for (int i=0;i<values.size();i++) {
                Log.d("Date String is ",values.get(i).getX());
                if (!dateAndValues.containsKey(values.get(i).getX())) {
                    dateAndValues.put(values.get(i).getX(), values.get(i).getY());
                }
            }
        }
    }

}
