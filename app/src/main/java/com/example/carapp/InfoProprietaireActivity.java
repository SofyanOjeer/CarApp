package com.example.carapp;

import android.content.Intent;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

public class InfoProprietaireActivity extends AppCompatActivity {
    TextView tv1;
    TextView tv2;
    TextView tv3;
    TextView tv4;
    TextView tv5;
    TextView tv6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info_proprietaire);

            tv1 = (TextView) findViewById(R.id.tv1);
            tv2 = (TextView) findViewById(R.id.tv2);
            tv3 = (TextView) findViewById(R.id.tv3);
            tv4 = (TextView) findViewById(R.id.tv4);
            tv5 = (TextView) findViewById(R.id.tv5);
            tv6 = (TextView) findViewById(R.id.tv6);

            Intent intent = getIntent();

            String strId = intent.getStringExtra("valueId");
            String strNom = intent.getStringExtra("valueNom");
            String strPrenom = intent.getStringExtra("valuePrenom");
            String strEmail = intent.getStringExtra("valueEmail");
            String strTel = intent.getStringExtra("valueTel");
            String strAdresse = intent.getStringExtra("valueAdresse");

            tv1.setText("ID:\t" + strId );
            tv2.setText("Nom:\t" + strNom );
            tv3.setText("Prenom:\t" + strPrenom );
            tv4.setText("Email:\t" + strEmail );
            tv5.setText("Tel:\t" + strTel );
            tv6.setText("Adresse:\t" + strAdresse );
        }
    }