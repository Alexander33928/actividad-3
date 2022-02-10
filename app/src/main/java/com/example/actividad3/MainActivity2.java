package com.example.actividad3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {
    private TextView d;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        d=(TextView) findViewById(R.id.mensaje);
        Bundle args = getIntent().getExtras();
        String nome= args.getString("chaveNome");
        d.setText(nome);
    }
}