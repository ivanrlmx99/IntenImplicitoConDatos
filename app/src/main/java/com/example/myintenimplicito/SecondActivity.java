package com.example.myintenimplicito;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

public class SecondActivity extends AppCompatActivity {
    private TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        textView=(TextView)findViewById(R.id.text_view);
        Bundle bundle=getIntent().getExtras();

        if(bundle!=null){
            String greeter=bundle.getString("viajeKey");
            Toast.makeText(SecondActivity.this,greeter,Toast.LENGTH_LONG).show();
            textView.setText(greeter);
        }else{
            Toast.makeText(SecondActivity.this,"Is it empety",Toast.LENGTH_LONG).show();
        }

    }
}
