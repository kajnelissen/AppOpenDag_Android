package com.example.AppICT;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MyActivity extends Activity {
    /**
     * Called when the activity is first created.
     */

    private Button button;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);

        button =(Button)findViewById(R.id.button1);

        button.setOnClickListener(buttonClickListener);
        //button.setOnLongClickListener(buttonLongClickListener);
    }

    View.OnClickListener buttonClickListener = new View.OnClickListener(){
        public void onClick(View v)
        {
              setContentView(R.layout.nid);
        }
    };
}
