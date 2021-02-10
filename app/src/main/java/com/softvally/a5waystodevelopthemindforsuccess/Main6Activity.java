package com.softvally.a5waystodevelopthemindforsuccess;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;

public class Main6Activity extends AppCompatActivity {
    private WebView webView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main6);

        webView = findViewById(R.id.webviewId);
        //   webView.loadUrl("file:///android_asset/cap.html");

        webView.loadUrl("file:///android_asset/Main/t1p5.html");

        this.setTitle("Embrace Positivity");


        WebSettings webSettings = webView.getSettings();

        webSettings.setJavaScriptEnabled(true);


    }
}