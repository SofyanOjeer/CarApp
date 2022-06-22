package com.example.carapp;

import android.content.Intent;
import android.text.method.HideReturnsTransformationMethod;
import android.text.method.PasswordTransformationMethod;
import android.view.View;
import android.widget.*;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {


    TextView tvErrorLogin;
    EditText edIdentifiant;
    EditText edPassword;
    CheckBox cbShowPassword;
    Button btValider;
    Button btQuit;




    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //GUI
        tvErrorLogin = (TextView) findViewById(R.id.tv_error_login);
        edIdentifiant = (EditText) findViewById(R.id.ed_id);
        edPassword = (EditText) findViewById(R.id.ed_password);
        cbShowPassword = (CheckBox) findViewById(R.id.check_showPassword);
        btValider = (Button) findViewById(R.id.bt_valider);
        btQuit = (Button) findViewById(R.id.bt_quit);

        tvErrorLogin.setVisibility(View.INVISIBLE);

        Intent intentMenu = new Intent(MainActivity.this, MenuActivity.class);

        //edPassword.setTransformationMethod(PasswordTransformationMethod.getInstance());

        edPassword.setTransformationMethod(PasswordTransformationMethod.getInstance());

        cbShowPassword.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean isChecked) {
                if (isChecked) {
                    // show password
                    edPassword.setTransformationMethod(HideReturnsTransformationMethod.getInstance());
                } else {
                    // hide password
                    edPassword.setTransformationMethod(PasswordTransformationMethod.getInstance());
                }
            }
        });


        btValider.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String identifiant = "";
                String password = "";

                if (edIdentifiant.getText().toString().equals(identifiant) && edPassword.getText().toString().equals(password)) {

                    startActivity(intentMenu);

                } else {
                    tvErrorLogin.setVisibility(View.VISIBLE);
                }
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