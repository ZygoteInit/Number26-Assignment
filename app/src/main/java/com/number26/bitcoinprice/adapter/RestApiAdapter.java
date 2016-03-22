package com.number26.bitcoinprice.adapter;

import com.number26.bitcoinprice.utils.Constants;

import retrofit.RestAdapter;

public class RestApiAdapter {
    
    private static RestAdapter sharedInstance = null;

    public static RestAdapter getInstance() {
        if (sharedInstance == null){

            sharedInstance = new RestAdapter.Builder()
                    .setEndpoint(Constants.URL)
                    .build();
        }

        return sharedInstance;
    }
}
