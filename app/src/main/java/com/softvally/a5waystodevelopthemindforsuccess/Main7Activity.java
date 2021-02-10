package com.softvally.a5waystodevelopthemindforsuccess;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;

public class Main7Activity extends AppCompatActivity {
    private WebView webView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main7);

        webView = findViewById(R.id.webviewId);
        //   webView.loadUrl("file:///android_asset/cap.html");

        webView.loadUrl("file:///android_asset/Main/t1p6.html");

        this.setTitle("Be Careful");


        WebSettings webSettings = webView.getSettings();

        webSettings.setJavaScriptEnabled(true);


    }
}