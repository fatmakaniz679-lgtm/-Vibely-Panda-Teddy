package com.vibely.pandateddy

import android.app.Activity
import android.os.Bundle
import android.webkit.WebChromeClient
import android.webkit.WebView
import android.webkit.WebViewClient

class MainActivity : Activity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val web = WebView(this)
        web.settings.javaScriptEnabled = true
        web.settings.domStorageEnabled = true
        web.webViewClient = WebViewClient()
        web.webChromeClient = WebChromeClient()
        web.setBackgroundColor(android.graphics.Color.rgb(255, 247, 250))
        setContentView(web)
        web.loadUrl("file:///android_asset/index.html")
    }
    @Deprecated("Deprecated in Android")
    override fun onBackPressed() {
        val view = (window.decorView.findViewById(android.R.id.content) as? android.view.ViewGroup)
        val web = view?.getChildAt(0) as? WebView
        if (web?.canGoBack() == true) web.goBack() else super.onBackPressed()
    }
}
