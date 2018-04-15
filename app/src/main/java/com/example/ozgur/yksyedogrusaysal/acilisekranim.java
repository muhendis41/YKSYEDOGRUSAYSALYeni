package com.example.ozgur.yksyedogrusaysal;

import android.app.Activity;
import android.content.Intent;
import android.media.Image;
import android.os.Bundle;
import android.widget.ImageView;

/**
 * Created by ozgur on 14.04.2018.
 */

public class acilisekranim extends Activity {
    ImageView image;


    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.acilisekranim);



        image=(ImageView)findViewById(R.id.image);
        image.setImageResource(R.drawable.tasarim);
        Thread timerThread = new Thread(){
            public void run(){
                try{
                    sleep(4000);
                }catch(InterruptedException e){
                    e.printStackTrace();
                }finally{
                    Intent intent = new Intent(acilisekranim.this,MainActivity.class);
                    startActivity(intent);
                }
            }
        };
        timerThread.start();
    }

    @Override
    protected void onPause() {
        // TODO Auto-generated method stub
        super.onPause();
        finish();
    }




}
