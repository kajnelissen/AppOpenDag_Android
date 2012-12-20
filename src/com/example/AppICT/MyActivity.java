package com.example.AppICT;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MyActivity extends Activity {
    /**
     * Called when the activity is first created.
     */

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);

        Button btn_iti = (Button)findViewById(R.id.btn_iti);
        Button btn_contact = (Button)findViewById(R.id.btn_contact);
        Button btn_AlleStudies = (Button)findViewById(R.id.btn_AlleStudies);
        Button btn_dp = (Button)findViewById(R.id.btn_dp);
        Button btn_fg = (Button)findViewById(R.id.btn_fg);
        Button btn_im = (Button)findViewById(R.id.btn_im);
        Button btn_nid = (Button)findViewById(R.id.btn_nid);
        Button btn_nvg = (Button)findViewById(R.id.btn_nvg);
        Button btn_sw = (Button)findViewById(R.id.btn_sw);
    }

    public void alleStudies(View v)
    {
        Intent i = new Intent(this, Algemeen_Info.class);
        startActivity(i);
    }

    public void zuyd (View v)
    {
        Intent i = new Intent(this, Zuyd_Info.class);
        startActivity(i);
    }

        /*btn_iti.setOnClickListener(new View.OnClickListener() {
           public void onClick(View v) {

               Intent i = new Intent(v, ITI_Info.class);//Intent(R.layout.main, ITI_Info.class);// Intent(this, ITI_Info.class);
               startActivity(i);

                }});


        btn_nid.setOnClickListener(new View.OnClickListener() {
        public void onClick(View v) {

            Intent i = new Intent(this, NID_Info.class);
            startActivity(i);

        }});

        btn_im.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                Intent i = new Intent(this, IM_Info.class);
                startActivity(i);

            }});*/
    }


        //});

    //View.OnClickListener buttonClickListener = new View.OnClickListener(){
      //  public void onClick(View v)
        //{
          //    setContentView(R.layout.nid);
        //}


