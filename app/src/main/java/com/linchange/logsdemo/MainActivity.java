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

        Logs.i("When all those shadows almost killed your light");
        Logs.w("I remember you said, \"Don't leave me here alone\"");
        Logs.e("But all that's dead and gone and passed tonight");
        Logs.i("Just close your eyes, the sun is going down");
        Logs.d("You'll be alright, no one can hurt you now");

        Logs.t(this).i("Come morning light, you and I'll be safe and sound");
        Logs.t(this).v("Don't you dare look out your window darling");
        Logs.t(this).e("The war outside our door keeps raging on");
        Logs.t(this).w("Hold onto this lullaby");
        Logs.t(this).d("Even when the music's gone");

        Logs.t("safe").i("Just close your eyes");
        Logs.t("and").w("You'll be alright");
        Logs.t("sound").e("Come morning light");
        Logs.t("taylor").i("You and I'll be safe and sound");
        Logs.t("swift").d("No one can hurt you now");

    }
}
