package com.example.carapp;

import android.content.Intent;
import android.util.Log;
import android.widget.EditText;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

public class InfoVehiculeActivity extends AppCompatActivity {

    TextView tv1;
    TextView tv2;
    TextView tv3;
    TextView tv4;
    TextView tv5;
    TextView tv6;
    TextView tv7;
    TextView tv8;


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
        tv7 = (TextView) findViewById(R.id.tv7);
        tv8 = (TextView) findViewById(R.id.tv8);

        Intent intent = getIntent();

        String strImmatriculation = intent.getStringExtra("valueImmatriculation");
        String strMarque = intent.getStringExtra("valueMarque");
        String strModele = intent.getStringExtra("valueModele");
        String strCouleur = intent.getStringExtra("valueCouleur");
        String strPuissance = intent.getStringExtra("valuePuissance");
        String strCategorie = intent.getStringExtra("valueCategorie");
        String strBoiteDeVitesse = intent.getStringExtra("valueBoiteDeVitesse");
        String strAnnee = intent.getStringExtra("valueAnnee");

        tv1.setText("Immatriculation:\t" + strImmatriculation );
        tv2.setText("Marque:\t" + strMarque );
        tv3.setText("Modèle:\t" + strModele );
        tv4.setText("Couleur:\t" + strCouleur );
        tv5.setText("Puissance:\t" + strPuissance );
        tv6.setText("Catégorie:\t" + strCategorie );
        tv7.setText("Boite de vitesse:\t" + strBoiteDeVitesse );
        tv8.setText("Année:\t" + strAnnee );



    }

}