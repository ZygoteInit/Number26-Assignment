package com.number26.bitcoinprice.interactors;

import com.number26.bitcoinprice.api.BitCoinApi;
import com.number26.bitcoinprice.models.BitCoinValues;
import com.number26.bitcoinprice.ui.main.OnFinishedListener;

import javax.inject.Inject;
import retrofit.Callback;
import retrofit.RetrofitError;
import retrofit.client.Response;

public class FetchBitCoinRatesInteractorImpl implements FetchBitCoinRatesInteractor {

    BitCoinApi getBitCoinApi;

    @Inject public FetchBitCoinRatesInteractorImpl(BitCoinApi getBitCoinApi) {
        this.getBitCoinApi = getBitCoinApi;
    }

    @Override public void fetchRates(final OnFinishedListener listener) {


        getBitCoinApi.getBitCoinRates(new Callback<BitCoinValues>() {

            @Override
            public void success(BitCoinValues bitCoinBitCoinValues, Response response) {

                listener.onFinished(bitCoinBitCoinValues);
            }

            @Override
            public void failure(RetrofitError retrofitError) {

                retrofitError.printStackTrace();
            }
        });

    }
}
