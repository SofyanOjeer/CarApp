package com.example.carapp;

import android.content.Intent;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

public class MenuActivity extends AppCompatActivity {

    Button btSaisieVehicule;
    Button btListeVehicule;
    Button btSaisieIntervention;
    Button btListeIntervention;
    Button btSaisieProprietaire;
    Button btListeProprietaire;
    ImageButton btQuit;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        btSaisieVehicule = (Button) findViewById(R.id.button1);
        btListeVehicule = (Button) findViewById(R.id.button2);
        btSaisieIntervention = (Button) findViewById(R.id.button3);
        btListeIntervention = (Button) findViewById(R.id.button4);
        btSaisieProprietaire = (Button) findViewById(R.id.button5);
        btListeProprietaire = (Button) findViewById(R.id.button6);
        btQuit = (ImageButton) findViewById(R.id.imageButton);

        Intent intentSasieVehicule = new Intent(MenuActivity.this, SaisieVehiculeActivity.class);
        Intent intentSaisieProprietaire = new Intent(MenuActivity.this, SaisieProprietaireActivity.class);
        Intent intentSaisieIntervention = new Intent(MenuActivity.this, SaisieInterventionActivity.class);
        Intent intentListeVehicule = new Intent(MenuActivity.this, ListeVehiculeActivity.class);
        Intent intentListeProprietaire = new Intent(MenuActivity.this, ListeProprietaireActivity.class);
        Intent intentListeIntervention = new Intent(MenuActivity.this, ListeInterventionActivity.class);



        btSaisieVehicule.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                startActivity(intentSasieVehicule);

            }
        });

        btListeVehicule.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                startActivity(intentListeVehicule);

            }
        });


        btSaisieIntervention.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                startActivity(intentSaisieIntervention);

            }
        });

        btListeIntervention.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                startActivity(intentListeIntervention);

            }
        });

        btSaisieProprietaire.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                startActivity(intentSaisieProprietaire);

            }
        });

        btListeProprietaire.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                startActivity(intentListeProprietaire);

            }
        });

        btListeProprietaire.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                startActivity(intentListeProprietaire);

            }
        });

        btQuit.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                System.exit(0);

            }
        });
    }
}