package com.number26.bitcoinprice.modules;


import com.number26.bitcoinprice.interactors.FetchBitCoinRatesInteractor;
import com.number26.bitcoinprice.ui.main.MainPresenter;
import com.number26.bitcoinprice.ui.main.MainPresenterImpl;
import com.number26.bitcoinprice.ui.main.MainView;

import dagger.Module;
import dagger.Provides;

@Module
public class MainModule {

    private MainView view;

    public MainModule(MainView view) {
        this.view = view;
    }

    @Provides public MainView provideView() {
        return view;
    }

    @Provides
    public MainPresenter providePresenter(MainView mainView, FetchBitCoinRatesInteractor fetchBitCoinRatesInteractor) {
        return new MainPresenterImpl(mainView, fetchBitCoinRatesInteractor);
    }

//    @Provides
//    public RecyclerViewAdapter provideRecyclerViewAdapter (){
//        return new RecyclerViewAdapter();
//    }
}
