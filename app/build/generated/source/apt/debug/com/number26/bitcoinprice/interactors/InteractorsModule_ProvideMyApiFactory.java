package com.number26.bitcoinprice.interactors;

import com.number26.bitcoinprice.api.BitCoinApi;
import dagger.internal.Factory;
import javax.annotation.Generated;
import javax.inject.Provider;
import retrofit.RestAdapter;

@Generated("dagger.internal.codegen.ComponentProcessor")
public final class InteractorsModule_ProvideMyApiFactory implements Factory<BitCoinApi> {
  private final InteractorsModule module;
  private final Provider<RestAdapter> restAdapterProvider;

  public InteractorsModule_ProvideMyApiFactory(InteractorsModule module, Provider<RestAdapter> restAdapterProvider) {  
    assert module != null;
    this.module = module;
    assert restAdapterProvider != null;
    this.restAdapterProvider = restAdapterProvider;
  }

  @Override
  public BitCoinApi get() {  
    BitCoinApi provided = module.provideMyApi(restAdapterProvider.get());
    if (provided == null) {
      throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
    return provided;
  }

  public static Factory<BitCoinApi> create(InteractorsModule module, Provider<RestAdapter> restAdapterProvider) {  
    return new InteractorsModule_ProvideMyApiFactory(module, restAdapterProvider);
  }
}

