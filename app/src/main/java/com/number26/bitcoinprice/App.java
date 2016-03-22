package com.number26.bitcoinprice;

import android.app.Application;
import android.content.Context;

import com.number26.bitcoinprice.component.DaggerAppComponent;
import com.number26.bitcoinprice.component.AppComponent;
import com.number26.bitcoinprice.modules.AppModule;

import javax.inject.Inject;

public class App extends Application {

    private AppComponent component;

//    @Inject
//    AnalyticsManager analyticsManager;

    @Override public void onCreate() {
        super.onCreate();
        setupGraph();
       // analyticsManager.registerAppEnter();
    }

    private void setupGraph() {
        component = DaggerAppComponent.builder()
                .appModule(new AppModule(this))
                .build();
        component.inject(this);
    }

    public AppComponent component() {
        return component;
    }

    public static App get(Context context) {
        return (App) context.getApplicationContext();
    }
}
