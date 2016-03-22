package com.number26.bitcoinprice.interactors;

import com.number26.bitcoinprice.api.BitCoinApi;
import dagger.internal.Factory;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated("dagger.internal.codegen.ComponentProcessor")
public final class FetchBitCoinRatesInteractorImpl_Factory implements Factory<FetchBitCoinRatesInteractorImpl> {
  private final Provider<BitCoinApi> getBitCoinApiProvider;

  public FetchBitCoinRatesInteractorImpl_Factory(Provider<BitCoinApi> getBitCoinApiProvider) {  
    assert getBitCoinApiProvider != null;
    this.getBitCoinApiProvider = getBitCoinApiProvider;
  }

  @Override
  public FetchBitCoinRatesInteractorImpl get() {  
    return new FetchBitCoinRatesInteractorImpl(getBitCoinApiProvider.get());
  }

  public static Factory<FetchBitCoinRatesInteractorImpl> create(Provider<BitCoinApi> getBitCoinApiProvider) {  
    return new FetchBitCoinRatesInteractorImpl_Factory(getBitCoinApiProvider);
  }
}

