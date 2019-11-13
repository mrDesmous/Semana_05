package com.example.desmous;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.provider.Settings;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

        private Button btnProducts;
        private  Button btnAboutUs;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main); //Enlazamos Activity + Layout

        btnProducts = (Button) findViewById(R.id.btnEnter);
        btnAboutUs = (Button) findViewById(R.id.btnAboutUs);

        btnProducts.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               // Log.i(Settings.INFO,"Products");
                Intent i = new Intent(MainActivity.this,ProductListActivity.class);
                startActivity(i);
            }
        });


        btnAboutUs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Log.i(Settings.INFO, "About us");
                Intent i = new Intent(MainActivity.this,AboutUsActivity.class);
                startActivity(i);
            }
        });
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

