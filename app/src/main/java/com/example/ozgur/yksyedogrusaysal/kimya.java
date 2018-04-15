package com.example.ozgur.yksyedogrusaysal;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

/**
 * Created by ozgur on 14.04.2018.
 */

public class kimya extends Activity {
    Button KBTN;
    Button KBTN2;
    Button KBTN3;
    Button KBTN4;
    Button KBTN5;
    Button KBTN6;
    TextView KTXT;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.kimya);

        KBTN=(Button)findViewById(R.id.KBTN);
        KBTN2=(Button)findViewById(R.id.KBNT2);
        KBTN3=(Button)findViewById(R.id.KBTN3);
        KBTN4=(Button)findViewById(R.id.KBTN4);
        KBTN5=(Button)findViewById(R.id.KBTN5);
        KBTN6=(Button)findViewById(R.id.KBTN6);
        KTXT=(TextView)findViewById(R.id.KTXT);





        KBTN = (Button) findViewById(R.id.KBTN);
        KBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                KTXT.setText("Maddenin sulu çözeltisinde H+ iyonu varsa madde asit, OH- iyonu varsa madde bazdır.Maddenin sulu çözeltisinde H+ iyonu varsa madde asit, OH- iyonu varsa madde bazdır.maddenin sulu çözeltisinde H+ iyonu varsa madde asit, OH- iyonu varsa madde bazdır."+
                        "Eğer turnusol kağıdı maddeye batırıldığında rengi kırmızıya dönüyorsa madde asit, maviye dönüyorsa madde bazdır."+
                        "Asite ve baz tepkimeye girerse tuz açığa çıkar.PH cetveli maddeni asidik mi bazik mi ve nötr mü olduğunu anlamamıza yarayan cetveldir .PH değeri 7' den küçükse madde asidik , ,ph değeri 7 den büyükse madde bazikdir ve ph değeri 7 ye eşitse madde nötrdür ."+
                        "\t DAHA DETAYLI BİR ANLATIM İÇİN KONU ANLATIM VİDEOMU İZLEYİNİZ. \n"



                );
            }
        });

        KBTN2=(Button)findViewById(R.id.KBNT2);
        KBTN2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                KTXT.setText("Bir maddde katı,sıvı ve gaz halinde bulunabilir .Hangi halde bulunacağı sıcaklık ve basınçla ilişikilidir .Madde genel olarak ,düşük sıcaklıklarda katı hali,yüksek sıcaklıklarda gaz hali tercih eder."+
                        "Gaz halde ki maddelerin molekülleri ,çok yüksek scaklıklarda atom haline dönüşür.bu şartlarda atomlar da bazı elektronlardan ayrılır ve iyonlar oluşur .Böylece moleküler atomlar, iyonlar ve elektronlardan oluşan özel bir fiziksel hal ortaya çıkar .Maddenin bu haline plazma denir. " +
                        "\t DAHA DETAYLI BİR ANLATIM İÇİN KONU ANLATIM VİDEOMU İZLEYİNİZ. \n"



                );

            }
        });

        KBTN3=(Button)findViewById(R.id.KBTN3);
        KBTN3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                KTXT.setText("1700'lü yıllarda , hassas tartımlardan sonra yapılan deneyler ve düzenli kayıt tutma geleneği ve farklı elementlere yapılan deneysel çalışmalar sonucu her kimyasal değişim için geçerli olan üç ayrı bilimsel kanun ortaya atıldı ;Kütlenin Korunum Kanunu , Sabit Oranlar Kanunu ve Katlı Oranlar Kanunu JHON DALTON 1803-1808 yılları arasında bu kanunları kullanarak her bir elementin kendine özgü atomlar olduğunu varsayarak atom teorisin geliştirdi."+
                        "Elementlerin atom numarasına göre , benzer özellik gösteren alt alta gelecek şekilde dizilmesiyle Modern Periyodik Sistem elde edilmiştir."+
                        "Periyodik talodaki her yatay satıra periyot ,her dikey sütuna grup adı verilir.Toplam 7 periyot vardır, periyotlar metalle başlar ,soy gazla sona erer.Ancak ilk periyot Ametalle başlar .Aynı gruptaki elementlerin fiziksel ve kimyasal özellikleri birbirineçok benzer lanlara aile denir."+
                        "\t DAHA DETAYLI BİR ANLATIM İÇİN KONU ANLATIM VİDEOMU İZLEYİNİZ. \n"
                );
            }
        });

        KBTN4=(Button)findViewById(R.id.KBTN4);
        KBTN4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                KTXT.setText("•\tKarbon kimyası orgnaik kimyayla aynı anlamı taşır.Karbon bileşiklerinin özelliklerini, tepkimelerini ve bu tepkimelerin uyduğu kural ,ilke ve yasaları inceleyen ve aratıran bilim dalıdır \n"+
                        "•\tDAHA DETAYLI ANLATIM İÇİN KONU ANLATIMLARINI DİNLEYİNİZ\n"


                );
            }
        });


        KBTN5=(Button)findViewById(R.id.KBTN5);
        KBTN5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                KTXT.setText("•\tKimyasal tepkimeler gerekleşirken ısı açığa çıkabilir veya ısı harcanabilir.\n"+
                        "•\tBu tepkimelerdeki ısı enerjisinin hesaplanması tepkime ile ilgili bilgi sahibi olmamız için gereklidir.\n"+
                        "•\tBir tepkime oluşurken alınan veya verilen ısı enerjisine tepkime ısısı denir.\n"+
                        "•\tDAHA DETAYLI ANLATIM İÇİN KONU ANLATIMLARINI DİNLEYİNİZ\n");
            }
        });
        KBTN6=(Button)findViewById(R.id.KBTN6);
        KBTN6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                KTXT.setText("•\tMaddenin elektrik enerjisi ile etkileşimi sonucu ortaya çıkan kimyasal dönüşümler ile fiziksel değişiklei ve kimyasal enerjinin elektrik enerjisine çevrilmesini inceleyen bilim dalına elektrokimya denir. \n"+
                        "•\tDAHA DETAYLI ANLATIM İÇİN KONU ANLATIMLARINI DİNLEYİNİZ\n");
            }
        });


    }
}

