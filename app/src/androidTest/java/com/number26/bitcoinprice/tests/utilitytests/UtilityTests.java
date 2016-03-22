package com.number26.bitcoinprice.tests.utilitytests;

import android.test.AndroidTestCase;
import android.text.format.DateFormat;

import com.number26.bitcoinprice.utils.Utility;

import java.util.Calendar;
import java.util.Locale;

/**
 * Created by mua on 3/22/2016.
 */
public class UtilityTests extends AndroidTestCase {

    public void testCurrentTimeStampRefersToCurrentDate(){

        //Arrange
        long currTimeStamp = System.currentTimeMillis();

        Calendar cal = Calendar.getInstance(Locale.ENGLISH);
        String date = DateFormat.format("dd MMM", cal.getTimeInMillis()).toString();
        //endregion


        //Act
        String convertedDate = Utility.convertTimeStampToDate(String.valueOf(currTimeStamp));

        //Assert
        assertEquals("Date is not correctly converted from timestamp",date,convertedDate);

    }

    public void testNetworkAvailableShoulReturnTrue(){

        //Arrange
        boolean isConnected = false;

        //Act

        isConnected = Utility.isNetworkAvailable(mContext);

        //Assert
        assertTrue("Network isnt available", isConnected);

    }
}
