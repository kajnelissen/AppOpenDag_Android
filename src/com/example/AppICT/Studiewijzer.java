package com.example.AppICT;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

/**
 * Created with IntelliJ IDEA.
 * User: kyra
 * Date: 9-1-13
 * Time: 11:47
 * To change this template use File | Settings | File Templates.
 */
public class Studiewijzer extends Activity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.studiewijzer);

        Button btn_home_sw = (Button)findViewById(R.id.btn_home_sw);
    }

    public void homeSW (View v)
    {
        Intent i = new Intent(this, MyActivity.class);
        startActivity(i);
    }
}