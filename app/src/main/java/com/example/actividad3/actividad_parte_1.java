package com.example.actividad3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class actividad_parte_1 extends AppCompatActivity {
    Button boton;
    EditText InputText;
    TextView EditView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_actividad_parte1);
        boton=findViewById(R.id.button);
        boton.setOnClickListener(view -> {
            InputText = findViewById(R.id.editText);
            String textString = InputText.getText().toString();
            EditView = findViewById(R.id.textView);
            EditView.setText(textString);
            Toast.makeText(getApplicationContext(), textString, Toast.LENGTH_SHORT).show();
        });
    }

}