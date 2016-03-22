package com.number26.bitcoinprice.utils;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.text.format.DateFormat;

import java.util.Calendar;
import java.util.Locale;

/**
 * Created by mua on 3/21/2016.
 */
public class Utility {

    public static String convertTimeStampToDate(String timeStamp){

        Long timeStampL = Long.parseLong(timeStamp);
        Calendar cal = Calendar.getInstance(Locale.ENGLISH);
        cal.setTimeInMillis(timeStampL);
        String date = DateFormat.format("dd MMM", cal).toString();
        return date;
    }


    public static boolean isNetworkAvailable(Context context) {

        ConnectivityManager connectivityManager
                = (ConnectivityManager) context.getSystemService(Context.CONNECTIVITY_SERVICE);
        NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
        return activeNetworkInfo != null && activeNetworkInfo.isConnected();
    }
}
