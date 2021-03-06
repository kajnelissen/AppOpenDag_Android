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

        //initialisatie van de buttons
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

    //deze methode roept algemene zuyd informatie aan
    public void zuyd (View v)
    {
        Intent i = new Intent(this, Zuyd_Info.class);
        startActivity(i);
    }

    //deze methode roept contact pagina aan
    public void Contact (View v)
    {
        Intent i = new Intent(this, Zuyd_Info.class);
        startActivity(i);
    }

    //deze methode roept dagprogramma aan
    public void dagProgramma (View v)
    {
        Intent i = new Intent(this, DagProgramma.class);
        startActivity(i);
    }

    //deze methode roept de studiewijzer aan
    public void studiewijzer (View v)
    {
        Intent i = new Intent(this, SurveyActivity.class);
        startActivity(i);
    }

    //deze methode roept de fotogallerij aan
    public void Fotogallerij(View v)
    {
        Intent i = new Intent(this, Foto_Gallerij.class);
        startActivity(i);
    }

    //deze methode roept de qr scanner aan
    public void QRscanner(View v)
    {
        Intent i = new Intent(this, QRScanner.class);
        startActivity(i);
    }
    }





