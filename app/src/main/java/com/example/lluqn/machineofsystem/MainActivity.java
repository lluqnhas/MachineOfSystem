package com.example.lluqn.machineofsystem;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText login, senha;
    Button bt_entrar;
    TextView add_membro;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        login = findViewById(R.id.login);
        senha = findViewById(R.id.login);

        bt_entrar = findViewById(R.id.bt_entrar);
        bt_entrar.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        //evento do click
                    }
                });

        add_membro = findViewById(R.id.add_membro);
        add_membro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, Main2Activity.class));
            }
        });
    }
}
