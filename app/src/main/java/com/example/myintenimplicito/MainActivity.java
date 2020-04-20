package com.example.myintenimplicito;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private View button;
    private final String VIAJE="Viajo desde la activity uno a la segunda";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button=(Button)findViewById(R.id.my_botton);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //se ingresa a segundo activity
                Intent i=new Intent(MainActivity.this,SecondActivity.class);
                i.putExtra("viajeKey",VIAJE);
                startActivity(i);
            }
        });
    }
}
