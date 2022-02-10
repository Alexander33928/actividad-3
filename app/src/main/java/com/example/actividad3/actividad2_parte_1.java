package com.example.actividad3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class actividad2_parte_1 extends AppCompatActivity {
    private Button b;
    private TextView a;
    private static final int REQUEST_CODE= 222;
    public static final String MESSAGE="Mensaje";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_actividad2_parte1);
        a=(TextView) findViewById(R.id.recibe);
        b=(Button) findViewById(R.id.boton);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivityForResult(new Intent(getApplicationContext(), Describer_usuario.class), REQUEST_CODE);
            }
        });
    }
    @Override
    protected  void onActivityResult(int requestCode,int resultCode,Intent data){
        super.onActivityResult(requestCode,resultCode,data);
        if(requestCode == REQUEST_CODE){
            if(resultCode ==RESULT_OK){
                Log.d("TAG1","result_ok");
                a.setText(data.getStringExtra(MESSAGE));
            }else if (resultCode==RESULT_CANCELED){
                Log.d("TAG1","result_canceled");
                a.setText("Se ha Cancelado");
            }
        }
    }
}