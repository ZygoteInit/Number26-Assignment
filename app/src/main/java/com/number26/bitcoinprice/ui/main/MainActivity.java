package com.number26.bitcoinprice.ui.main;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.Toast;

import com.escorps.retrodagger.R;
import com.number26.bitcoinprice.component.DaggerMainComponent;
import com.number26.bitcoinprice.component.AppComponent;
import com.number26.bitcoinprice.models.BitCoinValues;
import com.number26.bitcoinprice.modules.MainModule;
import com.number26.bitcoinprice.ui.common.BaseActivity;
import com.number26.bitcoinprice.ui.customview.MyGraphyView;
import com.number26.bitcoinprice.utils.Constants;
import com.number26.bitcoinprice.utils.Utility;

import javax.inject.Inject;
import butterknife.ButterKnife;
import butterknife.InjectView;
import butterknife.OnClick;

public class MainActivity extends BaseActivity implements MainView {

    @Inject
    MainPresenter presenter;

    @InjectView(R.id.progress)
    ProgressBar progressBar;

    @InjectView(R.id.viewLayout)
    LinearLayout mygraphyView;

    @InjectView(R.id.btnbar)
    Button btnBarChart;

    @InjectView(R.id.btnLine)
    Button btnLineChart;


    BitCoinValues bitCoinValues;

    MyGraphyView graphView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.inject(this);
    }

    @Override
    protected void setupComponent(AppComponent appComponent) {

        DaggerMainComponent.builder()
                .appComponent(appComponent)
                .mainModule(new MainModule(this))
                .build()
                .inject(this);
    }

    @Override protected void onResume() {
        super.onResume();

        if(Utility.isNetworkAvailable(this)) {
            presenter.onResume();
        }
        else{
            Toast.makeText(MainActivity.this,"Check your internet Connect",Toast.LENGTH_LONG).show();
        }
    }

    @Override public void showProgress() {

        progressBar.setVisibility(View.VISIBLE);
        btnBarChart.setVisibility(View.GONE);
        btnLineChart.setVisibility(View.GONE);
        mygraphyView.setVisibility(View.GONE);
    }

    @Override public void hideProgress() {

        progressBar.setVisibility(View.INVISIBLE);
        btnLineChart.setVisibility(View.VISIBLE);
        btnBarChart.setVisibility(View.VISIBLE);
        mygraphyView.setVisibility(View.VISIBLE);
    }

    @Override public void setItems(BitCoinValues bitCoinBitCoinValues) {

        bitCoinValues = bitCoinBitCoinValues;

        graphView = new MyGraphyView(this, bitCoinValues.getBitCoinUsdValues(),
                "Market Price (USD) ", bitCoinValues.getRateDate(),
                Constants.verticalLegends, MyGraphyView.BAR);

        populateGraph();

    }


    public void populateGraph(){

        mygraphyView.removeAllViews();
        mygraphyView.addView(graphView);
        // setContentView(graphView);
    }


    @OnClick(R.id.btnLine)
    public void lineGraph(){

        graphView = new MyGraphyView(this, bitCoinValues.getBitCoinUsdValues(),
                "Market Price (USD) ", bitCoinValues.getRateDate(),
                Constants.verticalLegends, MyGraphyView.LINE);

        populateGraph();

    }

    @OnClick(R.id.btnbar)
    public void barGraph(){

        graphView = new MyGraphyView(this, bitCoinValues.getBitCoinUsdValues(),
                "Market Price (USD) ", bitCoinValues.getRateDate(),
                Constants.verticalLegends, MyGraphyView.BAR);

        populateGraph();

    }

}
