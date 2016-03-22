package com.number26.bitcoinprice.ui.common;

import android.app.Activity;
import android.os.Bundle;

import com.number26.bitcoinprice.App;
import com.number26.bitcoinprice.component.AppComponent;

public abstract class BaseActivity extends Activity {

    @Override protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setupComponent((AppComponent) App.get(this).component());
    }


    protected abstract void setupComponent(AppComponent appComponent);
}
