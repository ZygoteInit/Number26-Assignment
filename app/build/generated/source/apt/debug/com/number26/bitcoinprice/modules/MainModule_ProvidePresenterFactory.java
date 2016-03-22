package com.number26.bitcoinprice.modules;

import com.number26.bitcoinprice.interactors.FetchBitCoinRatesInteractor;
import com.number26.bitcoinprice.ui.main.MainPresenter;
import com.number26.bitcoinprice.ui.main.MainView;
import dagger.internal.Factory;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated("dagger.internal.codegen.ComponentProcessor")
public final class MainModule_ProvidePresenterFactory implements Factory<MainPresenter> {
  private final MainModule module;
  private final Provider<MainView> mainViewProvider;
  private final Provider<FetchBitCoinRatesInteractor> fetchBitCoinRatesInteractorProvider;

  public MainModule_ProvidePresenterFactory(MainModule module, Provider<MainView> mainViewProvider, Provider<FetchBitCoinRatesInteractor> fetchBitCoinRatesInteractorProvider) {  
    assert module != null;
    this.module = module;
    assert mainViewProvider != null;
    this.mainViewProvider = mainViewProvider;
    assert fetchBitCoinRatesInteractorProvider != null;
    this.fetchBitCoinRatesInteractorProvider = fetchBitCoinRatesInteractorProvider;
  }

  @Override
  public MainPresenter get() {  
    MainPresenter provided = module.providePresenter(mainViewProvider.get(), fetchBitCoinRatesInteractorProvider.get());
    if (provided == null) {
      throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
    return provided;
  }

  public static Factory<MainPresenter> create(MainModule module, Provider<MainView> mainViewProvider, Provider<FetchBitCoinRatesInteractor> fetchBitCoinRatesInteractorProvider) {  
    return new MainModule_ProvidePresenterFactory(module, mainViewProvider, fetchBitCoinRatesInteractorProvider);
  }
}

