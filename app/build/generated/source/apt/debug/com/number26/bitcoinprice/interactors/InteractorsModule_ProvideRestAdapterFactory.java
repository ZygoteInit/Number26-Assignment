package com.number26.bitcoinprice.interactors;

import dagger.internal.Factory;
import javax.annotation.Generated;
import retrofit.RestAdapter;

@Generated("dagger.internal.codegen.ComponentProcessor")
public final class InteractorsModule_ProvideRestAdapterFactory implements Factory<RestAdapter> {
  private final InteractorsModule module;

  public InteractorsModule_ProvideRestAdapterFactory(InteractorsModule module) {  
    assert module != null;
    this.module = module;
  }

  @Override
  public RestAdapter get() {  
    RestAdapter provided = module.provideRestAdapter();
    if (provided == null) {
      throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
    return provided;
  }

  public static Factory<RestAdapter> create(InteractorsModule module) {  
    return new InteractorsModule_ProvideRestAdapterFactory(module);
  }
}

