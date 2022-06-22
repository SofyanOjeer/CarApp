package com.example.carapp;

import android.content.Intent;
import android.provider.ContactsContract;
import android.provider.Telephony;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageButton;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

public class SaisieProprietaireActivity extends AppCompatActivity {

    EditText edId;
    EditText edNom;
    EditText edPrenom;
    EditText edEmail;
    EditText edTel;
    EditText edAdresse;
    ImageButton btImage;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_saisie_proprietaire);

        edId = (EditText) findViewById(R.id.edId);
        edNom = (EditText) findViewById(R.id.edNom);
        edPrenom = (EditText) findViewById(R.id.edPrenom);
        edEmail = (EditText) findViewById(R.id.edEmail);
        edTel = (EditText) findViewById(R.id.edTel);
        edAdresse = (EditText) findViewById(R.id.edAdresse);
        btImage = (ImageButton) findViewById(R.id.imageButton);


        btImage.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                String strId = edId.getText().toString();
                String strNom = edNom.getText().toString();
                String strPrenom = edPrenom.getText().toString();
                String strEmail = edEmail.getText().toString();
                String strTel = edTel.getText().toString();
                String strAdresse = edAdresse.getText().toString();

                Intent intent = new Intent(SaisieProprietaireActivity.this, InfoProprietaireActivity.class);

                intent.putExtra("valueId", strId);
                intent.putExtra("valueNom", strNom);
                intent.putExtra("valuePrenom", strPrenom);
                intent.putExtra("valueEmail", strEmail);
                intent.putExtra("valueTel", strTel);
                intent.putExtra("valueAdresse", strAdresse);
                startActivity(intent);


            }
        });
    }
}