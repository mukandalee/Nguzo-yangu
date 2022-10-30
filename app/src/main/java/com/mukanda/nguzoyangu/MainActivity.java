package com.mukanda.nguzoyangu;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    CardView cardTunatafakari,cardninakaza,cardAsili,cardnimerudi,cardharusi,cardHalleluya,cardNarejea,cardKwetu,cardDunia,cardKuteswa,cardKisha,cardmwokozi,cardroho,cardNakujia,cardLala,cardVita,cardKwisha,cardIkatetemeka,cardkifo,cardNenda;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        cardTunatafakari=findViewById(R.id.cardfin);
        cardninakaza=findViewById(R.id.cardfly);
        cardAsili=findViewById(R.id.cardbantam);
        cardnimerudi=findViewById(R.id.cardfeather);
        cardharusi=findViewById(R.id.cardlight);
        cardHalleluya=findViewById(R.id.cardwelter);
        cardNarejea=findViewById(R.id.cardmiddle);
        cardKwetu=findViewById(R.id.cardheavy);
        cardDunia=findViewById(R.id.carddunia);
        cardKuteswa=findViewById(R.id.cardkuteswa);
        cardKisha=findViewById(R.id.cardKisha);
        cardmwokozi=findViewById(R.id.cardmwokozi);
        cardroho=findViewById(R.id.cardroho);
        cardNakujia=findViewById(R.id.cardnakujia);
        cardLala=findViewById(R.id.cardlala);
        cardVita=findViewById(R.id.cardvita);
        cardKwisha=findViewById(R.id.cardkwisha);
        cardIkatetemeka=findViewById(R.id.cardIkatetemeka);
        cardkifo=findViewById(R.id.cardKifo);
        cardNenda=findViewById(R.id.cardNenda);
        cardTunatafakari.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this,Tunatafakari.class));
            }
        });
        cardninakaza.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this,NinakazaMwendo.class));
            }
        });
        cardAsili.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this,AsiliYetuNiMoja.class));
            }
        });
        cardnimerudi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this,NimerudiKwako.class));
            }
        });
        cardharusi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this,HarusiYaMwisho.class));
            }
        });
        cardHalleluya.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this,Halleluya.class));
            }
        });
        cardNarejea.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this,NarejeaKwako.class));
            }
        });
        cardKwetu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this,NaendaKwetu.class));
            }
        });
        cardDunia.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this,DunianiSioKwetu.class));
            }
        });
        cardKuteswa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this,KuteswaKwakeBwana.class));
            }
        });
        cardKisha.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this,KishaNikaona.class));
            }
        });
        cardmwokozi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this,MwokoziPokeaMoyoWangu.class));
            }
        }); cardroho.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this,RohoZaWaamin.class));
            }
        });
        cardNakujia.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this,NakujiaNiMwenyeDhambi.class));
            }
        });
        cardLala.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this,LalaMpenzi.class));
            }
        });
        cardVita.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this,NimevipigaVita.class));
            }
        });
        cardKwisha.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this,DuniaImekwisha.class));
            }
        });
        cardIkatetemeka.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this,IkatetemekaInchiYote.class));
            }
        });
        cardkifo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this,KifoChakeStephano.class));
            }
        });
        cardNenda.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this,NendaUpumzike.class));
            }
        });
    }
}