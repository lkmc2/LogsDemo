package com.linchange.logsdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.linchange.library.Logs;

@SuppressWarnings("AccessStaticViaInstance")
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Logs.t(this);
        Logs.t(this).i("haha");
        Logs.t(this).v("I dont like you");
        Logs.t(this).e("I dont like you");
        Logs.t(this).w("I dont like you");
        Logs.t(this).d("I dont like you");

        Logs.t("haha").i("123");
        Logs.t("good").w("123");
        Logs.t("haha").e("123");
        Logs.t("haha").i("123");
        Logs.t("haha").d("123");

        Logs.t("never");
        Logs.i("123");
        Logs.w("123");
        Logs.e("123");
        Logs.i("123");
        Logs.d("123");
    }
}
