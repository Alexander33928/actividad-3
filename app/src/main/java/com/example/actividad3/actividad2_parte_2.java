package com.example.actividad3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class actividad2_parte_2 extends DebugActivity implements View.OnClickListener {
    private EditText a;
    private EditText b;
    private Button c;
    private String nome="";
    private String señha="";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_actividad2_parte2);
        a=(EditText) findViewById(R.id.usuario);
        b=(EditText) findViewById(R.id.contraseña);
        c=(Button) findViewById(R.id.boton);
        if (savedInstanceState!=null){
            nome=savedInstanceState.getString("chavenome");
            a.setText(nome);
            señha=savedInstanceState.getString("chaveseñha");
            b.setText(señha);
        }else{
            nome=nome;
            señha=señha;
        }
        a.setText(nome);
        b.setText(señha);

        c.setOnClickListener(this);

    }
    protected void onSaveInstanceState(Bundle dados){
        super.onSaveInstanceState(dados);
        dados.putString("chavenome",nome);
        dados.putString("chaveseñha",señha);
    }

    @Override
    public void onClick(View view) {
        String usuario=a.getText().toString();
        String contraseña=b.getText().toString();
        if (usuario.equals("Victor") && contraseña.equals("12345678")){
            Intent intent=new Intent(this,MainActivity2.class);
            Bundle params = new Bundle();
            params.putString("chaveNome",usuario);
            intent.putExtras(params);
            startActivity(intent);
        }else{
            Toast.makeText(actividad2_parte_2.this, "Usuario y Constraseña Son Incorrectos", Toast.LENGTH_SHORT).show();
        }
    }
}