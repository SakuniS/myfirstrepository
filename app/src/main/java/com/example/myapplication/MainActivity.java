package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;



public class MainActivity<Edittext> extends AppCompatActivity {

    Button bt;
    Edittext et;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnS=FindviewById(R.id.btnSend);
        etM=findViewById(R.id.etMessage);
    }

    public void sendMessage=(view v)
    {
        String message=tM.getText().toString();

        Intent i=newIntent(this,DisplayActivity.class);

        i.putExtra(name:"key",message);

        startActivity(i);
    }
}
