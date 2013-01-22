package com.example.AppICT;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.widget.Button;

/**
 * Created with IntelliJ IDEA.
 * User: kyra
 * Date: 16-12-12
 * Time: 23:01
 * To change this template use File | Settings | File Templates.
 */
public class IM_Info  extends Activity {


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.im);

        WebView webview = (WebView) findViewById(R.id.webView_im);
        //webpagina zou nog gepubliceerd worden, dan kan het volgende gedaan worden:
        //webview.loadUrl();
    }

    public void homeIM (View v)
    {
        Intent i = new Intent(this, MyActivity.class);
        startActivity(i);
    }

}
