package com.example.ozgur.yksyedogrusaysal;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

/**
 * Created by ozgur on 14.04.2018.
 */


    public class biyoloji extends Activity {
        Button BTNB1;
        Button BTNB2;
        Button BTNB3;
        Button BTNB4;
        TextView TXT1;

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.biyoloji);
            BTNB1 = (Button) findViewById(R.id.BTNB1);
            BTNB2= (Button) findViewById(R.id.BNTB2);
            BTNB3= (Button) findViewById(R.id.BTNB3);
            BTNB4 = (Button) findViewById(R.id.BTNB4);
            TXT1 = (TextView) findViewById(R.id.TXT1);

            BTNB1 = (Button) findViewById(R.id.BTNB1);
            BTNB1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    TXT1 = (TextView) findViewById(R.id.TXT1);
                    TXT1.setText("Bitkiler organik maddelerle beslenmektedir. Tüm bitkiler kendi besinlerini kendileri üretirler. Bu organik maddeleri, üretmek için gerçekleştirdikleri işlemede “FOTOSENTEZ” adı verilir."+
                            "Fotosentez, bitkileri diğer canlılardan ayıran en önemli özelliktir. Fotosentez işlemi, bitkilerin yapraklarında bulunan “klorofil” adını verdiğimiz yeşil pigmentlerdir. Klorofil, bitkilerin güneş enerjisini emmesinde çok önemli rol oynamaktadır. Çünkü, fotosentez olayının başlangıcı için, güneş enerjisine ihtiyaç duyulur.\n"+
                            "Bitki hücrelerini, insan ve hayvan hücrelerinden ayıran en büyük özellik ise, hücrelerin güneş enerjisini direk olarak kullanabilen yapıda olmasıdır. Bu hücreler sayesinde, bitkiler güneş enerjisini, besin enerjisine çevirirler ve kendi bünyelerinde depolarlar.\n"+

                            "\t DAHA DETAYLI BİR ANLATIM İÇİN KONU ANLATIM VİDEOMU İZLEYİNİZ. \n"


                    );
                }
            });

            BTNB2=(Button)findViewById(R.id.BNTB2);
            BTNB2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    TXT1 = (TextView) findViewById(R.id.TXT1);
                    TXT1.setText("Hücre canlıların yapısal ve işlevsel özelliklere sahip en küçük ve temel birimidr.Her canlı bir ya da daha fazla hücreden meydana gelir.Genellikle hemen her hücre temel olarak aynı yapıdadır.Ancak bulundukları doku ve buna bağlı olarak fonksiyonların açısından bazı farklı özelliklere sahip olabilmektediler."+
                            "Hücreler çıplak gözle görülmezler sadece bir mikroskop aracılığıyla görülebilirler.Hücler aşağıdaki bölümlerden oluşurlar;" +

                            "•\tÇEKİRDEK \n"+
                            "•\t HÜCRE ZARI \n"+
                            "•\t SİTOPLAZMA \n"+
                            "•\tENDOPLAZMİK RETİKULUM\n"+
                            "•\tGOLGİ   AYGITI \n"+
                            "•\tLİZOZOM\n"+
                            "•\tMİTOKONDRİ \n"+
                            "•\tKLOROPLAST\n"+
                            "•\tSENTROZOM \n" +
                            "\t DAHA DETAYLI BİR ANLATIM İÇİN KONU ANLATIM VİDEOMU İZLEYİNİZ. \n"
                    );

                }
            });

            BTNB3=(Button)findViewById(R.id.BTNB3);
            BTNB3.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    TXT1 = (TextView) findViewById(R.id.TXT1);
                    TXT1.setText("Bir kimyasal tepkimeye sebe olan ve onu hızlandıran,çoğunlukla Protein yapısında olan organik maddeye ENZİM denir."+
                            "Canlı hücrelerde gerçekleşen yıkım ve yapım tepkimlelerinin hepsine metabolizma denir.Kimyasal tepkimenin başlayabilmesi ve devam etmesi için tepkimeye girecek moleküllerin aktivasyon enerjisi denilen enerji engelini aşması gerekir"+
                            "Aktivasyon enerjisi ,bir kimyasal tepkimenin başlayabilmesi için geekli olan en düşük enerji miktarıdır.Aktivasyon enerjisi engelinin aşılması katalizör kullanılmasıyla sağlanır. "+
                            "Kimyasal tepkimeye girecek moleküller hareket halindedir ve birbirleri ilr çarpışmaktadır.Moleküllerin ısıtılması ile hareket enerjileri yükseltilir.Böylece moleküller birbirleri ile daha sık çarpışarak tepkimeye girmeleri kolaylaşır."+
                            "\t DAHA DETAYLI BİR ANLATIM İÇİN KONU ANLATIM VİDEOMU İZLEYİNİZ. \n"


                    );
                }
            });

            BTNB4=(Button)findViewById(R.id.BTNB4);
            BTNB4.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    TXT1 = (TextView) findViewById(R.id.TXT1);
                    TXT1.setText("Cinsiyete bağlı kalıtım eşey(cinsiyet) kromozoları tarafından taşınan özelliklerin nesilden nesile aktarılmasıdır.İnsanda kromozomlar otozom ve gonozom kromozomlar olmak üzere iki gruba ayrılır."+
                            "Otozom (Vücut hücreleri) 44 kromozom , 2 gonozom (cinsiyet) X ve Y kromozomları cinsiyeti belirler.X ve Y kromozomu  erkekte vadır, kadınlarda ise sadece X kromozomu bulunur ."+
                            "Kromozom eksiklerinden dolayı çeşitli hastalıklar vardır. 21 kromozom down sendromu , 13 kromozom da patou sendromu , 18 kromozom da edwards sendromu gibi hastalıklar vardır."+
                            "\t DAHA DETAYLI BİR ANLATIM İÇİN KONU ANLATIM VİDEOMU İZLEYİNİZ. \n"

                    );
                }
            });






        }
    }
