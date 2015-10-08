package com.example.jason9075.androidplayground;

import android.annotation.SuppressLint;

public class Config {
    public static String LOGTAG = "AllpayMobileSDKDemo";

    public static int REQUEST_CODE = 1001;

    public static String MerchantID_test = "2000031";
    public static String PlatformID_test = "1000139";
    public static String PlatformMemberNo_test = "222222";
    public static String PlatformChargeFee_test = "1";
    public static String AppCode_test = "test_1234";
    public static String AppCode_PlatformID_test = "test_abcd";
    public static int TotalAmount_test = 100;
    public static String TradeDesc_test = "Allpay商城購物";
    public static String ItemName_test = "手機20元X2#隨身碟60元X1";


    @SuppressLint("SimpleDateFormat")
    public static String getMerchantTradeNo(){
        java.util.Date now = new java.util.Date();
        return new java.text.SimpleDateFormat("yyyyMMddHHmmssSSS").format(now);
    }

    @SuppressLint("SimpleDateFormat")
    public static String getMerchantTradeDate(){
        java.util.Date now = new java.util.Date();
        return new java.text.SimpleDateFormat("yyyy/MM/dd HH:mm:ss").format(now);
    }
}
