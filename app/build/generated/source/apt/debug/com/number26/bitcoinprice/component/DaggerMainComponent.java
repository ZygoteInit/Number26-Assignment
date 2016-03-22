package com.number26.bitcoinprice.component;

import com.number26.bitcoinprice.interactors.FetchBitCoinRatesInteractor;
import com.number26.bitcoinprice.modules.MainModule;
import com.number26.bitcoinprice.modules.MainModule_ProvidePresenterFactory;
import com.number26.bitcoinprice.modules.MainModule_ProvideViewFactory;
import com.number26.bitcoinprice.ui.main.MainActivity;
import com.number26.bitcoinprice.ui.main.MainActivity_MembersInjector;
import com.number26.bitcoinprice.ui.main.MainPresenter;
import com.number26.bitcoinprice.ui.main.MainView;
import dagger.MembersInjector;
import dagger.internal.Factory;
import dagger.internal.MembersInjectors;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated("dagger.internal.codegen.ComponentProcessor")
public final class DaggerMainComponent implements MainComponent {
  private Provider<MainView> provideViewProvider;
  private Provider<FetchBitCoinRatesInteractor> getFindItemsInteractorProvider;
  private Provider<MainPresenter> providePresenterProvider;
  private MembersInjector<MainActivity> mainActivityMembersInjector;

  private DaggerMainComponent(Builder builder) {  
    assert builder != null;
    initialize(builder);
  }

  public static Builder builder() {  
    return new Builder();
  }

  private void initialize(final Builder builder) {  
    this.provideViewProvider = MainModule_ProvideViewFactory.create(builder.mainModule);
    this.getFindItemsInteractorProvider = new Factory<FetchBitCoinRatesInteractor>() {
      @Override public FetchBitCoinRatesInteractor get() {
        FetchBitCoinRatesInteractor provided = builder.appComponent.getFindItemsInteractor();
        if (provided == null) {
          throw new NullPointerException("Cannot return null from a non-@Nullable component method");
        }
        return provided;
      }
    };
    this.providePresenterProvider = MainModule_ProvidePresenterFactory.create(builder.mainModule, provideViewProvider, getFindItemsInteractorProvider);
    this.mainActivityMembersInjector = MainActivity_MembersInjector.create((MembersInjector) MembersInjectors.noOp(), providePresenterProvider);
  }

  @Override
  public void inject(MainActivity activity) {  
    mainActivityMembersInjector.injectMembers(activity);
  }

  @Override
  public MainPresenter getMainPresenter() {  
    return providePresenterProvider.get();
  }

  public static final class Builder {
    private MainModule mainModule;
    private AppComponent appComponent;
  
    private Builder() {  
    }
  
    public MainComponent build() {  
      if (mainModule == null) {
        throw new IllegalStateException("mainModule must be set");
      }
      if (appComponent == null) {
        throw new IllegalStateException("appComponent must be set");
      }
      return new DaggerMainComponent(this);
    }
  
    public Builder mainModule(MainModule mainModule) {  
      if (mainModule == null) {
        throw new NullPointerException("mainModule");
      }
      this.mainModule = mainModule;
      return this;
    }
  
    public Builder appComponent(AppComponent appComponent) {  
      if (appComponent == null) {
        throw new NullPointerException("appComponent");
      }
      this.appComponent = appComponent;
      return this;
    }
  }
}

