package com.example.powerbiembed

import android.annotation.SuppressLint
import android.os.Bundle
import android.webkit.WebView
import android.webkit.WebViewClient
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    @SuppressLint("SetJavaScriptEnabled")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val webView: WebView = findViewById(R.id.webViewPowerBi)

        webView.settings.javaScriptEnabled = true
        webView.settings.domStorageEnabled = true
        webView.webViewClient = WebViewClient()

        val powerBiUrl = "https://app.powerbi.com/view?r=eyJrIjoiNmUzMTgxNTgtZDlhNy00NzFkLThmZjQtYTE4ZTU3OGJhYjliIiwidCI6IjU1NzVkNjI3LTkzZTEtNGNhNy1hNDVkLTllMTA0MzYyZGRmZSIsImMiOjR9"
        webView.loadUrl(powerBiUrl)
    }

    override fun onBackPressed() {
        val webView: WebView = findViewById(R.id.webViewPowerBi)
        if (webView.canGoBack()) {
            webView.goBack()
        } else {
            super.onBackPressed()
        }
    }
}
