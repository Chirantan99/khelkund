package com.appacitive.khelkund.activities.navigationdrawer;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Window;
import android.webkit.WebView;

import com.appacitive.khelkund.R;

import butterknife.ButterKnife;
import butterknife.InjectView;

public class TermsAndPolicyActivity extends ActionBarActivity {

    @InjectView(R.id.web_howtoplay)
    public WebView mWebView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_terms_and_policy);
        ButterKnife.inject(this);

        mWebView.getSettings().setJavaScriptEnabled(true);
        mWebView.setClickable(true);
        String url = "http://www.khelkund.com/ipl/terms.aspx";
        mWebView.loadUrl(url);
        mWebView.setBackgroundColor(Color.TRANSPARENT);
    }
}

