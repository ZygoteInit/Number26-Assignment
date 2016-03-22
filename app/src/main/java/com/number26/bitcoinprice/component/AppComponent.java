package com.number26.bitcoinprice.component;

import com.number26.bitcoinprice.App;
import com.number26.bitcoinprice.interactors.FetchBitCoinRatesInteractor;
import com.number26.bitcoinprice.interactors.InteractorsModule;
import com.number26.bitcoinprice.modules.AppModule;

import javax.inject.Singleton;

import dagger.Component;

@Singleton
@Component(
        modules = {
                AppModule.class,
                InteractorsModule.class
        }
)
public interface AppComponent {
    void inject(App app);


    FetchBitCoinRatesInteractor getFindItemsInteractor();
}