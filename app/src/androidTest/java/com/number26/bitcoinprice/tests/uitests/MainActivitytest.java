package com.number26.bitcoinprice.tests.uitests;

import android.app.Activity;
import android.test.ActivityInstrumentationTestCase2;
import android.test.AndroidTestCase;
import android.widget.Button;
import android.widget.LinearLayout;

import com.escorps.retrodagger.R;
import com.number26.bitcoinprice.ui.main.MainActivity;

/**
 * Created by mua on 3/22/2016.
 */
public class MainActivitytest extends ActivityInstrumentationTestCase2<MainActivity> {

    public MainActivitytest(Class<MainActivity> activityClass){
        super(activityClass);
    }

    public void testPreconditions() {

        //region Arrange
        Activity mActivity = getActivity();
        Button btnBar = (Button) mActivity.findViewById(R.id.btnbar);
        Button btnLine = (Button) mActivity.findViewById(R.id.btnLine);
        LinearLayout graphView = (LinearLayout) mActivity.findViewById(R.id.viewLayout);
        //endregion

        //Assert
        assertNotNull("mTestActivity is null", mActivity);
        assertNotNull("btnBar is null", btnBar);
        assertNotNull("btnLine is null", btnLine);
        assertNotNull("graphView is null", graphView);
    }
}
