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

public class SaisieInterventionActivity extends AppCompatActivity {

    EditText edNumero;
    EditText edDate;
    EditText edType;
    EditText edDuree;
    EditText edResponsable;
    EditText edMaintenance;
    ImageButton btImage;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_saisie_intervention);

        edNumero = (EditText) findViewById(R.id.ed1);
        edDate = (EditText) findViewById(R.id.ed2);
        edType = (EditText) findViewById(R.id.ed3);
        edDuree = (EditText) findViewById(R.id.ed4);
        edResponsable = (EditText) findViewById(R.id.ed5);
        edMaintenance = (EditText) findViewById(R.id.ed6);
        btImage = (ImageButton) findViewById(R.id.imageButton);


        btImage.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {


                String strNumero = edNumero.getText().toString();
                String strDate = edDate.getText().toString();
                String strType = edType.getText().toString();
                String strDuree = edDuree.getText().toString();
                String strResponsable = edResponsable.getText().toString();
                String strMaintenance = edMaintenance.getText().toString();

                Intent intent = new Intent(SaisieInterventionActivity.this, InfoInterventionActivity.class);

                intent.putExtra("valueNumero", strNumero);
                intent.putExtra("valueDate", strDate);
                intent.putExtra("valueType", strType);
                intent.putExtra("valueDuree", strDuree);
                intent.putExtra("valueResponsable", strResponsable);
                intent.putExtra("valueMaintenance", strMaintenance);
                startActivity(intent);
            }
        });
    }
}