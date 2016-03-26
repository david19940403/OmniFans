package com.example.ovnifans.omnifans;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;

public class Registro extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registro);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
        Button registrobut=(Button) findViewById(R.id.RegistroButton);
        registrobut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
              Intent nuevacuenta=new Intent(getApplicationContext(),newacountActivity.class);
                startActivity(nuevacuenta);
            }
        });
        Button loginbut= (Button) findViewById(R.id.Loginbutton);
        loginbut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent Loginactiv=new Intent(getApplicationContext(),LoginActivity.class);
                startActivity(Loginactiv);
            }
        });
    }

}
