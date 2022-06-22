package com.example.carapp;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class InfoInterventionActivity extends AppCompatActivity {

    TextView tv1;
    TextView tv2;
    TextView tv3;
    TextView tv4;
    TextView tv5;
    TextView tv6;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info_vehicule);

        tv1 = (TextView) findViewById(R.id.tv1);
        tv2 = (TextView) findViewById(R.id.tv2);
        tv3 = (TextView) findViewById(R.id.tv3);
        tv4 = (TextView) findViewById(R.id.tv4);
        tv5 = (TextView) findViewById(R.id.tv5);
        tv6 = (TextView) findViewById(R.id.tv6);

        Intent intent = getIntent();

        String strNumero = intent.getStringExtra("valueNumero");
        String strDate = intent.getStringExtra("valueDate");
        String strType = intent.getStringExtra("valueType");
        String strDuree = intent.getStringExtra("valueDuree");
        String strResponsable = intent.getStringExtra("valueResponsable");
        String strMaintenance = intent.getStringExtra("valueMaintenance");

        tv1.setText("Numéro:\t" + strNumero );
        tv2.setText("Date d'intervention:\t" + strDate );
        tv3.setText("Type d'intervention:\t" + strType );
        tv4.setText("Durée d'intervention:\t" + strDuree );
        tv5.setText("Responsable:\t" + strResponsable );
        tv6.setText("Maintenance:\t" + strMaintenance );


    }

}