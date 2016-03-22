package com.number26.bitcoinprice.interactors;

import com.number26.bitcoinprice.api.BitCoinApi;
import dagger.internal.Factory;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated("dagger.internal.codegen.ComponentProcessor")
public final class InteractorsModule_ProvideFindItemsInteractorFactory implements Factory<FetchBitCoinRatesInteractor> {
  private final InteractorsModule module;
  private final Provider<BitCoinApi> bitCoinApiProvider;

  public InteractorsModule_ProvideFindItemsInteractorFactory(InteractorsModule module, Provider<BitCoinApi> bitCoinApiProvider) {  
    assert module != null;
    this.module = module;
    assert bitCoinApiProvider != null;
    this.bitCoinApiProvider = bitCoinApiProvider;
  }

  @Override
  public FetchBitCoinRatesInteractor get() {  
    FetchBitCoinRatesInteractor provided = module.provideFindItemsInteractor(bitCoinApiProvider.get());
    if (provided == null) {
      throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
    return provided;
  }

  public static Factory<FetchBitCoinRatesInteractor> create(InteractorsModule module, Provider<BitCoinApi> bitCoinApiProvider) {  
    return new InteractorsModule_ProvideFindItemsInteractorFactory(module, bitCoinApiProvider);
  }
}

