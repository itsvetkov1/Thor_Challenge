package com.example.thorchallenge;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class WebViewActivity extends AppCompatActivity {

    private WebView webView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_web_view);

        webView = findViewById(R.id.webView);
        webView.setWebViewClient(new WebViewClient());

        // Enable JavaScript if necessary
        webView.getSettings().setJavaScriptEnabled(true);

        String fileUrl = getIntent().getStringExtra("fileUrl");
        if (fileUrl != null) {
            webView.loadUrl(fileUrl);
        }
        webView.clearCache(true);

    }
}
