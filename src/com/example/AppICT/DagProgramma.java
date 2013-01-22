package com.example.AppICT;

import android.content.Intent;
import android.os.Bundle;
import android.app.Activity;
import android.view.View;
import android.webkit.WebView;
import android.widget.Button;

/**
 * Created with IntelliJ IDEA.
 * User: kyra
 * Date: 7-1-13
 * Time: 11:19
 * To change this template use File | Settings | File Templates.
 */
public class DagProgramma extends Activity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.dagprogramma);

        WebView webview = (WebView) findViewById(R.id.webView_dp);
        //webpagina zou nog gepubliceerd worden, dan kan het volgende gedaan worden:
        //webview.loadUrl();
    }

    public void home (View v)
    {
        Intent i = new Intent(this, MyActivity.class);
        startActivity(i);
    }
}
