package com.number26.bitcoinprice.ui.main;

import com.number26.bitcoinprice.interactors.FetchBitCoinRatesInteractor;
import com.number26.bitcoinprice.models.BitCoinValues;

public class MainPresenterImpl implements MainPresenter, OnFinishedListener {

    private MainView mainView;
    private FetchBitCoinRatesInteractor fetchBitCoinRatesInteractor;

    public MainPresenterImpl(MainView mainView, FetchBitCoinRatesInteractor fetchBitCoinRatesInteractor) {
        this.mainView = mainView;
        this.fetchBitCoinRatesInteractor = fetchBitCoinRatesInteractor;
    }

    @Override public void onResume() {
        mainView.showProgress();
        fetchBitCoinRatesInteractor.fetchRates(this);
    }

    @Override public void onFinished(BitCoinValues bitCoinBitCoinValues) {
        mainView.hideProgress();
        mainView.setItems(bitCoinBitCoinValues);
    }
}
