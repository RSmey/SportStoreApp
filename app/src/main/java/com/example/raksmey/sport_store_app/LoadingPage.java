package com.example.raksmey.sport_store_app;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

public class LoadingPage extends AppCompatActivity {

    private static int splashInterval=300;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_loading);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent i = new Intent(LoadingPage.this, MainActivity.class);
                startActivity(i);

                this.finish();
            }

            private void finish() {
                setContentView(R.layout.activity_login);
            }
        },splashInterval);
    }
}
