package com.example.AppICT;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;

/**
 * Created with IntelliJ IDEA.
 * User: Kyra
 * Date: 16-12-12
 * Time: 19:32
 * To change this template use File | Settings | File Templates.
 */

public class ITI_Info extends Activity {


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.iti);

        Button btn_home_iti = (Button)findViewById(R.id.btn_home_iti);
    }

    public void homeITI (View v)
    {
        Intent i = new Intent(this, MyActivity.class);
        startActivity(i);
    }

}
