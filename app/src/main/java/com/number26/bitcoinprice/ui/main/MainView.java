package com.number26.bitcoinprice.ui.main;

import com.number26.bitcoinprice.models.BitCoinValues;

public interface MainView {

    public void showProgress();

    public void hideProgress();

    public void setItems(BitCoinValues bitCoinBitCoinValues);

}
