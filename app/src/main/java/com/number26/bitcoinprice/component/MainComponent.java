package com.number26.bitcoinprice.component;

import com.number26.bitcoinprice.ActivityScope;
import com.number26.bitcoinprice.modules.MainModule;
import com.number26.bitcoinprice.ui.main.MainActivity;
import com.number26.bitcoinprice.ui.main.MainPresenter;

import dagger.Component;

@ActivityScope
@Component(
        dependencies = AppComponent.class,
        modules = MainModule.class
)
public interface MainComponent {
    void inject(MainActivity activity);
    MainPresenter getMainPresenter();
}