package com.example.AppICT;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

/**
 * Created with IntelliJ IDEA.
 * User: kyra
 * Date: 19-12-12
 * Time: 14:42
 * To change this template use File | Settings | File Templates.
 */
public class Algemeen_Info extends Activity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.alle_studies);
    }

    public void iti(View v){
        Intent i = new Intent(this, ITI_Info.class);
        startActivity(i);
    }

    public void nid(View v)
    {
        Intent i = new Intent(this, NID_Info.class);
        startActivity(i);
    }

    public void im(View v)
    {
        Intent i = new Intent(this, IM_Info.class);
        startActivity(i);
    }
}