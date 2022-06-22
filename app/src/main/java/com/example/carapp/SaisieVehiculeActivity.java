package com.example.carapp;

import android.content.Intent;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

public class SaisieVehiculeActivity extends AppCompatActivity {

    EditText edImmatriculation;
    EditText edMarque;
    EditText edModele;
    EditText edCouleur;
    EditText edPuissance;
    EditText edCategorie;
    EditText edBoiteDeVitesse;
    EditText edAnnee;
    ImageButton btImage;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_saisie_vehicule);

        edImmatriculation = (EditText) findViewById(R.id.edImmatriculation);
        edMarque = (EditText) findViewById(R.id.edMarque);
        edModele = (EditText) findViewById(R.id.edModele);
        edCouleur = (EditText) findViewById(R.id.edCouleur);
        edPuissance = (EditText) findViewById(R.id.edPuissance);
        edCategorie = (EditText) findViewById(R.id.edCategorie);
        edBoiteDeVitesse = (EditText) findViewById(R.id.edBoiteDeVitesse);
        edAnnee = (EditText) findViewById(R.id.edAnnee);
        btImage = (ImageButton) findViewById(R.id.imageButton);



        btImage.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {


                String strImmatriculation = edImmatriculation.getText().toString();
                String strMarque = edMarque.getText().toString();
                String strModele = edModele.getText().toString();
                String strCouleur = edCouleur.getText().toString();
                String strPuissance = edPuissance.getText().toString();
                String strCategorie = edCategorie.getText().toString();
                String strBoiDeVitesse = edBoiteDeVitesse.getText().toString();
                String strAnnee = edAnnee.getText().toString();

                Intent intent = new Intent(SaisieVehiculeActivity.this, InfoVehiculeActivity.class);

                intent.putExtra("valueImmatriculation", strImmatriculation);
                intent.putExtra("valueMarque", strMarque);
                intent.putExtra("valueModele", strModele);
                intent.putExtra("valueCouleur", strCouleur);
                intent.putExtra("valuePuissance", strPuissance);
                intent.putExtra("valueCategorie", strCategorie);
                intent.putExtra("valueBoiteDeVitesse", strBoiDeVitesse);
                intent.putExtra("valueAnnee", strAnnee);
                startActivity(intent);
            }
        });



    }
}