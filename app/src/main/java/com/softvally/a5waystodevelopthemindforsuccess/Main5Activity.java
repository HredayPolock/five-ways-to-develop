package com.softvally.a5waystodevelopthemindforsuccess;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;

public class Main5Activity extends AppCompatActivity {
    private WebView webView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main5);

        webView = findViewById(R.id.webviewId);
        //   webView.loadUrl("file:///android_asset/cap.html");

        webView.loadUrl("file:///android_asset/Main/t1p4.html");

        this.setTitle("Set Better Goals");


        WebSettings webSettings = webView.getSettings();

        webSettings.setJavaScriptEnabled(true);


    }
}