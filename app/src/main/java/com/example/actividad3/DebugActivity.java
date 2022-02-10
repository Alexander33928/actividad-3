package com.example.actividad3;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;

public class DebugActivity extends Activity {
    protected static  final String TAG = "filtro";
    protected void  onCreate(Bundle icicle){
        super.onCreate(icicle);
        Log.i(TAG,"onCreate Llamado");
    }
    protected void  onRestart(){
        super.onRestart();
        Log.i(TAG,"onRestart Llamado");
    }
    protected void  onResume(){
        super.onResume();
        Log.i(TAG,"onResume Llamado");
    }
    protected void  onPause(){
        super.onPause();
        Log.i(TAG,"onPause Llamado");
    }
    protected void  onSaveInstanceState(Bundle outState){
        super.onSaveInstanceState(outState);
        Log.i(TAG,"outState Llamado");
    }
    protected void  onStop(){
        super.onStop();
        Log.i(TAG,"onStop Llamado");
    }
    protected void  onDestroy(){
        super.onDestroy();
        Log.i(TAG,"onDestroy Llamado");
    }
}

