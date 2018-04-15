package com.example.ozgur.yksyedogrusaysal;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

/**
 * Created by ozgur on 14.04.2018.
 */

public class fizik extends Activity {
    Button FBTN;
    Button FBTN2;
    Button FBTN3;
    Button FBTN4;
    Button FBTN5;
    Button FBTN6;
    TextView FTXT;





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fizik);

        FBTN=(Button)findViewById(R.id.FBTN);
        FBTN2=(Button)findViewById(R.id.FBTN2);
        FBTN3=(Button)findViewById(R.id.FBTN3);
        FBTN4=(Button)findViewById(R.id.FBTN4);
        FBTN5=(Button)findViewById(R.id.FBTN5);
        FBTN6=(Button)findViewById(R.id.FBTN6);
        FTXT =(TextView)findViewById(R.id.FTXT);


        FBTN=(Button)findViewById(R.id.FBTN);
        FBTN.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                FTXT=(TextView)findViewById(R.id.FTXT);

                FTXT.setText(  "\tSarsıntı veya titreşim hareketinin bir ortam aracılığı ile itilmesine dalga hereketi denir.\n"+
                        "•\tDalgalar titreşim doğrultusuna göre ve taşıdığı enerjiye göre ikiye ayrılır onlarda kendi içinde 2 ye ayrılır .\n"+
                        "•\tDAHA DETAYLI ANLATIM İÇİN KONU ANLATIMLARINI DİNLEYİNİZ\n"

                );
            }
        });

        FBTN2=(Button)findViewById(R.id.FBTN2);
        FBTN2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FTXT=(TextView)findViewById(R.id.FTXT);
                FTXT.setText(  "\tFiziğin ışıkla ilgili olayları inceleyen bölümüdür.\n"+
                        "•\tIşığın niteiği,özellikleri,,ışıkla ilgili araçlar,görme meseleleri ve gözlük ,dürbün yapımı,fiziğin bu koluna aittir.\n"+
                        "•\tBuna göre optik üç kısma ayrılır Geometrik optik ,Fizik optik ,Kuvantum optiği\n"+
                        "•\tDAHA DETAYLI ANLATIM İÇİN KONU ANLATIMLARINI DİNLEYİNİZ\n"
                );
            }
        });



        FBTN3=(Button)findViewById(R.id.FBTN3);
        FBTN3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FTXT=(TextView)findViewById(R.id.FTXT);
                FTXT.setText("Enerjinin en basit tanımı 'Eenerjiiş yapma yeteneğidir.' enerji E harfi ile gösterilir .Skaler bir büyüklüktür.Enerji birimi deiş birimi gibi JOLUE(J)'dur. Günlük hayatta kullanılan diğer ir enerji birimi de kalori(KCAL)'dır "+
                        "•\tDAHA DETAYLI ANLATIM İÇİN KONU ANLATIMLARINI DİNLEYİNİZ\n");
            }
        });


        FBTN4=(Button)findViewById(R.id.FBTN4);
        FBTN4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FTXT=(TextView)findViewById(R.id.FTXT);
                FTXT.setText("Heisenberg belirsizlik ilkesi ve elektrononun bir dalga hareketi olduğu temeline dayanan kuantum kuramının bir şekli."+
                        "•\tDalga mekaniiği denklemlerin matematiksel özülerine dalga fonksşyonları denir.\n"+
                        "•\tDAHA DETAYLI ANLATIM İÇİN KONU ANLATIMLARINI DİNLEYİNİZ\n"
                );
            }
        });

        FBTN5=(Button)findViewById(R.id.FBTN5);
        FBTN5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FTXT=(TextView)findViewById(R.id.FTXT);
                FTXT.setText("•\tModern Fizik , klasik fizik ile tanımlanamayan olayları açıklamak üzere ortaya atılmış teorilerin tümüdür.\n"+
                        "•\tEinstein'ın özel görelilik kuramından , Max Planck 'ın kara cisim ışıması kuramına ;SChrödinger'in kedisinden, kuark ve bozonlara kadar herşey modern fizik adı altında toplnmıştır.\n"+
                        "•\tDAHA DETAYLI ANLATIM İÇİN KONU ANLATIMLARINI DİNLEYİNİZ\n"
                );
            }
        });

        FBTN6=(Button)findViewById(R.id.FBTN6);
        FBTN6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FTXT=(TextView)findViewById(R.id.FTXT);
                FTXT.setText(  "•\tHareket, bir cismin durağan bir noktaya göre durumunun ya da yerinin değişmesine denir.\n"+
                        "•\tKuvvet; Durmakta olan cismi hareket ettiren, hareket durumundaki cismi durduran,hızını veya yönünü  değiştiren ya da cisimlerin biçimini değiştiren etiye denir.\n"+
                        "•\tKuvvet fizik de F diye sembollenir.\n"+
                        "•\tHareket olması için kuvvet şart.\n"+
                        "•\tDAHA DETAYLI ANLATIM İÇİN KONU ANLATIMLARINI DİNLEYİNİZ\n"


                );
            }
        });



    }
}
