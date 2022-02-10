package com.example.actividad3;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu,menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()){
            case R.id.actividad1_parte_1:
                Intent i = new Intent(this,actividad_parte_1.class);
                startActivity(i);
                break;
            case R.id.actividad1_parte_2:
                Intent a = new Intent(this,actividad_parte_2.class);
                startActivity(a);
                break;
            case R.id.actividad2_parte_1:
                Intent b = new Intent(this, actividad2_parte_1.class);
                startActivity(b);
                break;
            case R.id.actividad2_parte_2:
                Intent c = new Intent(this,actividad2_parte_2.class);
                startActivity(c);
                break;
        }
        return super.onOptionsItemSelected(item);
    }
}