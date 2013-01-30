package com.example.AppICT;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
import java.io.File;
import android.os.Environment;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.view.Gravity;
import android.view.ViewGroup.LayoutParams;
import android.widget.LinearLayout;
import android.widget.Toast;


/**
 * Created with IntelliJ IDEA.
 * User: kyra
 * Date: 11-1-13
 * Time: 16:16
 * To change this template use File | Settings | File Templates.
 */
//deze class werkt nog niet, zit een fout in het maken van de horizontalscrollview
public class Foto_Gallerij extends Activity {

   @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.foto_gallerij);  //starten van scherm

       scroll = (HorizontalScrollView)findViewById(R.id.horizontalScrollView);
        imageview = new ImageView(getApplicationContext());
        imageview.setImageResource(R.drawable.afdeling);

       scroll.addView(imageview);
       //ImageView image = new ImageView(getApplicationContext());
       //image.setImageResource(R.drawable.zuydlogoict);//.equals(R.drawable.zuydlogoict);

       //scroll.addView(image, 2);
   }
    ImageView imageview;
    HorizontalScrollView scroll;

    public void click(View v)
    {
        scroll.setId(1);
    }

    /*@Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.foto_gallerij);  //starten van scherm

        //Button btn_home = (Button)findViewById(R.id.btn_home);
        HorizontalScrollView scroll = (HorizontalScrollView)findViewById(R.id.horizontalScrollView);

        ImageView imageview = new ImageView(getApplicationContext());
         //imageview.setImageResource(R.drawable.afdeling);

         scroll.addView(imageview);
        String ExternalStorageDirectoryPath = Environment
                .getExternalStorageDirectory()
                .getAbsolutePath();

        String targetPath = ExternalStorageDirectoryPath + "/drawable/";

        Toast.makeText(getApplicationContext(), targetPath, Toast.LENGTH_LONG).show();
        File targetDirector = new File(targetPath);

        File[] files = targetDirector.listFiles();
        for (File file : files){
            scroll.addView(insertPhoto(file.getAbsolutePath()));
        }
    }


    View insertPhoto(String path){
        Bitmap bm = decodeSampledBitmapFromUri(path, 200, 220);

        LinearLayout layout = new LinearLayout(getApplicationContext());
        layout.setLayoutParams(new LayoutParams(250, 250));
        layout.setGravity(Gravity.CENTER);

        ImageView imageView = new ImageView(getApplicationContext());
        imageView.setLayoutParams(new LayoutParams(220, 220));
        imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        imageView.setImageBitmap(bm);

        layout.addView(imageView);
        return layout;
    }

    public Bitmap decodeSampledBitmapFromUri(String path, int reqWidth, int reqHeight) {
        Bitmap bm = null;

        // First decode with inJustDecodeBounds=true to check dimensions
        final BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        BitmapFactory.decodeFile(path, options);

        // Calculate inSampleSize
        options.inSampleSize = calculateInSampleSize(options, reqWidth, reqHeight);

        // Decode bitmap with inSampleSize set
        options.inJustDecodeBounds = false;
        bm = BitmapFactory.decodeFile(path, options);

        return bm;
    }

    public int calculateInSampleSize(

            BitmapFactory.Options options, int reqWidth, int reqHeight) {
        // Raw height and width of image
        final int height = options.outHeight;
        final int width = options.outWidth;
        int inSampleSize = 1;

        if (height > reqHeight || width > reqWidth) {
            if (width > height) {
                inSampleSize = Math.round((float)height / (float)reqHeight);
            } else {
                inSampleSize = Math.round((float)width / (float)reqWidth);
            }
        }

        return inSampleSize;
    } */
}
