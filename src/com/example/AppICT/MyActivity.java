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

        //button =(Button)findViewById(R.id.button1);
        //button.setOnClickListener(new View.OnClickListener() {
          //  public void onClick(View v) {

           // setContentView(R.layout.nid);

                Button button1 = (Button)findViewById(R.id.btn_iti);
                Button button2 = (Button)findViewById(R.id.btn_contact);
                Button button3 = (Button)findViewById(R.id.btn_dp);
                Button button4 = (Button)findViewById(R.id.btn_fg);
                Button button5 = (Button)findViewById(R.id.btn_im);
                Button button6 = (Button)findViewById(R.id.btn_nid);
                Button button7 = (Button)findViewById(R.id.btn_nvg);
                Button button8 = (Button)findViewById(R.id.btn_sw);
            }
        //});
    public void iti()
    {
        Intent i = new Intent(this, iti.class) ;
        startActivity(i);
    }

    //View.OnClickListener buttonClickListener = new View.OnClickListener(){
      //  public void onClick(View v)
        //{
          //    setContentView(R.layout.nid);
        //}
    };

