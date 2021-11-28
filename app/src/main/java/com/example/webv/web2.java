package com.example.webv;

import androidx.appcompat.app.AppCompatActivity;
import android.annotation.SuppressLint;
import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;
public class web2 extends AppCompatActivity {
    WebView webView;
    @SuppressLint("SetJavaScriptEnabled")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_web2);
        webView=findViewById(R.id.wV);
        String got=getIntent().getStringExtra("keyURl");
        if (got.equals("google")){
            String url="https:https://www.google.com/";
            webView.setWebViewClient(new WebViewClient());
            webView.getSettings().setJavaScriptEnabled(true);
            webView.loadUrl(url);
        }
        else if (got.equals("facebook")){
            String url="https://www.facebook.com/";
            webView.setWebViewClient(new WebViewClient());
            webView.getSettings().setJavaScriptEnabled(true);
            webView.loadUrl(url);
        }
        else if(got.equals("pin")){
            String url="https://www.pinterest.com";
            webView.setWebViewClient(new WebViewClient());
            webView.getSettings().setJavaScriptEnabled(true);
            webView.loadUrl(url);
        }
        else if (got.equals("instagram")){
            String url="https://www.instagram.com/";
            webView.setWebViewClient(new WebViewClient());
            webView.getSettings().setJavaScriptEnabled(true);
            webView.loadUrl(url);
        }
        else if (got.equals("link")){
            String url="https://www.linkedin.com/";
            webView.setWebViewClient(new WebViewClient());
            webView.getSettings().setJavaScriptEnabled(true);
            webView.loadUrl(url);
        }
        else if (got.equals("tele")){
            String url="https://www.telegram.com/";
            webView.setWebViewClient(new WebViewClient());
            webView.getSettings().setJavaScriptEnabled(true);
            webView.loadUrl(url);
        }
        else if (got.equals("spotify")){
            String url="https://www.spotify.com/";
            webView.setWebViewClient(new WebViewClient());
            webView.getSettings().setJavaScriptEnabled(true);
            webView.loadUrl(url);
        }
        else if(got.equals("youtube")){
            String url="https://www.youtube.com/";
            webView.setWebViewClient(new WebViewClient());
            webView.getSettings().setJavaScriptEnabled(true);
            webView.loadUrl(url);
        }
        else if (got.equals("whatsapp")){
            String url="https://www.whatsapp.com/";
            webView.setWebViewClient(new WebViewClient());
            webView.getSettings().setJavaScriptEnabled(true);
            webView.loadUrl(url);
        }
        else if (got.equals("twitch")){
            String url="https://www.twitch.com/";
            webView.setWebViewClient(new WebViewClient());
            webView.getSettings().setJavaScriptEnabled(true);
            webView.loadUrl(url);
        }
        else if (got.equals("twitter")){
            String url="https://www.twitter.com/";
            webView.setWebViewClient(new WebViewClient());
            webView.getSettings().setJavaScriptEnabled(true);
            webView.loadUrl(url);
        }
        else if (got.equals("discord")){
            String url="https://www.discord.com/";
            webView.setWebViewClient(new WebViewClient());
            webView.getSettings().setJavaScriptEnabled(true);
            webView.loadUrl(url);
        }

    }
    @Override
    public void onBackPressed() {
        if(webView!= null && webView.canGoBack())
            webView.goBack();
        else
            super.onBackPressed();
    }

}