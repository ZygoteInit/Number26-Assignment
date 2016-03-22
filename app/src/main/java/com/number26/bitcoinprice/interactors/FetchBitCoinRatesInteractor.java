package com.number26.bitcoinprice.interactors;

import com.number26.bitcoinprice.ui.main.OnFinishedListener;

public interface FetchBitCoinRatesInteractor {

    public void fetchRates(OnFinishedListener listener);
}
