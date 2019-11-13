package com.example.desmous;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
    @Override
    protected void onResume() {
        super.onResume();

        Toast.makeText(this,
                "aplicacion iniciada",
                Toast.LENGTH_LONG).show();

    }
    @Override
    protected void onStop(){
        super.onStop();
        Toast.makeText(this,
                "aplicacion stopeada",
                Toast.LENGTH_LONG).show();
    }

}

