package com.example.jason9075.androidplayground;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

import com.allpay.tw.mobilesdk.CreateTrade;
import com.allpay.tw.mobilesdk.ENVIRONMENT;
import com.allpay.tw.mobilesdk.PAYMENTTYPE;
import com.allpay.tw.mobilesdk.PaymentActivity;


public class MainActivity extends Activity{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Intent intent = new Intent(MainActivity.this, PaymentActivity.class);
        PAYMENTTYPE paymentType = PAYMENTTYPE.ALL;

        CreateTrade oCreateTrade = new CreateTrade(
                Config.MerchantID_test,         //廠商編號
                Config.AppCode_test,            //App代碼
                Config.getMerchantTradeNo(),    //廠商交易編號
                Config.getMerchantTradeDate(),  //廠商交易時間
                Config.TotalAmount_test,        //交易金額
                Config.TradeDesc_test,          //交易描述
                Config.ItemName_test,           //商品名稱
                paymentType,                    //預設付款方式
                ENVIRONMENT.STAGE);             //介接環境 : STAGE為測試，OFFICIAL為正式

        intent.putExtra(PaymentActivity.EXTRA_PAYMENT, oCreateTrade);
        startActivityForResult(intent, Config.REQUEST_CODE);
    }

}
