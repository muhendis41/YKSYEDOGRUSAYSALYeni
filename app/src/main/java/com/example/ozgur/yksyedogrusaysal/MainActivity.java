package com.example.ozgur.yksyedogrusaysal;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class MainActivity extends Activity {
            Button BTN1;
            Button BTN2;
            Button BTN3;
            Button BTN4;
            Button BTN5;


            @Override
            protected void onCreate(Bundle savedInstanceState) {
                super.onCreate(savedInstanceState);
                setContentView(R.layout.activity_main);
                BTN1=(Button)findViewById(R.id.BTN1);
                BTN2=(Button)findViewById(R.id.FBTN2);
                BTN3=(Button)findViewById(R.id.FBTN3);
                BTN4=(Button)findViewById(R.id.FBTN4);
                BTN5=(Button)findViewById(R.id.FBTN5);






                BTN1= (Button)findViewById(R.id.BTN1);
                BTN1.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent yeni=new Intent(MainActivity.this,matematik.class);
                        startActivity(yeni);
                    }
                });


                BTN2=(Button)findViewById(R.id.FBTN2);
                BTN2.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent yeni2=new Intent(MainActivity.this,biyoloji.class);
                        startActivity(yeni2);


                    }
                });
                BTN3=(Button)findViewById(R.id.FBTN3);
                BTN3.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent yeni3=new Intent(MainActivity.this,fizik.class);
                        startActivity(yeni3);


                    }
                });

                BTN4=(Button)findViewById(R.id.FBTN4);
                BTN4.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent yeni4= new Intent(MainActivity.this,kimya.class);
                        startActivity(yeni4);
                    }
                });

                BTN5=(Button)findViewById(R.id.FBTN5);
                BTN5.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent yeni5= new Intent(MainActivity.this,hakkimda.class);
                        startActivity(yeni5);
                    }









                });

            }
        }

