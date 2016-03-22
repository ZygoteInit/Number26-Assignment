package com.number26.bitcoinprice.interactors;

import com.number26.bitcoinprice.adapter.RestApiAdapter;
import com.number26.bitcoinprice.api.BitCoinApi;

import dagger.Module;
import dagger.Provides;
import retrofit.RestAdapter;

@Module
public class InteractorsModule {

    @Provides public FetchBitCoinRatesInteractor provideFindItemsInteractor(BitCoinApi bitCoinApi) {
        return new FetchBitCoinRatesInteractorImpl(bitCoinApi);
    }

    @Provides public BitCoinApi provideMyApi(RestAdapter restAdapter) {
        return restAdapter.create(BitCoinApi.class);
    }

    @Provides public RestAdapter provideRestAdapter() {
        return RestApiAdapter.getInstance();
    }

}
