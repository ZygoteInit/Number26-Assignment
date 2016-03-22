package com.number26.bitcoinprice.api;


import com.number26.bitcoinprice.models.BitCoinValues;

import retrofit.Callback;
import retrofit.http.GET;
import retrofit.http.Headers;

public interface BitCoinApi {

    @Headers({
            "Content-type: application/json"
    })

    @GET("/market-price?timespan=all&format=json")
    public void getBitCoinRates(Callback<BitCoinValues> callback);

}
