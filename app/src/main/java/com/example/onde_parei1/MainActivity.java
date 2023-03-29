package com.example.onde_parei1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        System.out.println("1. onCreate");
    }

    @Override
    public void onClick(View view) {

        TextView t = (TextView) findViewById(R.id.txtCarro);
        String s;
        switch(view.getId()) {
            case R.id.btnCarro:
                s="capturar local do carro";
                break;
            default:
                s="não entendi sua seleção";
        }
    }
}