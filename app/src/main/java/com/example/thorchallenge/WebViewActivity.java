package com.example.thorchallenge;

import android.os.Bundle;
import android.webkit.WebView;
import androidx.appcompat.app.AppCompatActivity;

public class WebViewActivity extends AppCompatActivity {

    private WebView webView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Set the layout for this activity
        setContentView(R.layout.activity_webview);

        // Find the WebView component in the layout
        webView = findViewById(R.id.webview);

        // Get the URL of the HTML file to display
        String url = getIntent().getStringExtra("url");

        // Load the HTML file into the WebView
        webView.loadUrl(url);
    }
}
