package com.number26.bitcoinprice.component;

import com.number26.bitcoinprice.App;
import com.number26.bitcoinprice.api.BitCoinApi;
import com.number26.bitcoinprice.interactors.FetchBitCoinRatesInteractor;
import com.number26.bitcoinprice.interactors.InteractorsModule;
import com.number26.bitcoinprice.interactors.InteractorsModule_ProvideFindItemsInteractorFactory;
import com.number26.bitcoinprice.interactors.InteractorsModule_ProvideMyApiFactory;
import com.number26.bitcoinprice.interactors.InteractorsModule_ProvideRestAdapterFactory;
import com.number26.bitcoinprice.modules.AppModule;
import dagger.internal.MembersInjectors;
import javax.annotation.Generated;
import javax.inject.Provider;
import retrofit.RestAdapter;

@Generated("dagger.internal.codegen.ComponentProcessor")
public final class DaggerAppComponent implements AppComponent {
  private Provider<RestAdapter> provideRestAdapterProvider;
  private Provider<BitCoinApi> provideMyApiProvider;
  private Provider<FetchBitCoinRatesInteractor> provideFindItemsInteractorProvider;

  private DaggerAppComponent(Builder builder) {  
    assert builder != null;
    initialize(builder);
  }

  public static Builder builder() {  
    return new Builder();
  }

  private void initialize(final Builder builder) {  
    this.provideRestAdapterProvider = InteractorsModule_ProvideRestAdapterFactory.create(builder.interactorsModule);
    this.provideMyApiProvider = InteractorsModule_ProvideMyApiFactory.create(builder.interactorsModule, provideRestAdapterProvider);
    this.provideFindItemsInteractorProvider = InteractorsModule_ProvideFindItemsInteractorFactory.create(builder.interactorsModule, provideMyApiProvider);
  }

  @Override
  public void inject(App app) {  
    MembersInjectors.noOp().injectMembers(app);
  }

  @Override
  public FetchBitCoinRatesInteractor getFindItemsInteractor() {  
    return provideFindItemsInteractorProvider.get();
  }

  public static final class Builder {
    private AppModule appModule;
    private InteractorsModule interactorsModule;
  
    private Builder() {  
    }
  
    public AppComponent build() {  
      if (appModule == null) {
        throw new IllegalStateException("appModule must be set");
      }
      if (interactorsModule == null) {
        this.interactorsModule = new InteractorsModule();
      }
      return new DaggerAppComponent(this);
    }
  
    public Builder appModule(AppModule appModule) {  
      if (appModule == null) {
        throw new NullPointerException("appModule");
      }
      this.appModule = appModule;
      return this;
    }
  
    public Builder interactorsModule(InteractorsModule interactorsModule) {  
      if (interactorsModule == null) {
        throw new NullPointerException("interactorsModule");
      }
      this.interactorsModule = interactorsModule;
      return this;
    }
  }
}

