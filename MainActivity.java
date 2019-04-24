package com.meuapp.helloworld;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import static com.meuapp.helloworld.R.id.id_txt_message;

public class MainActivity extends AppCompatActivity {

    //  creat components
    TextView MyTxt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //Setanndo a referencia ao botão da view
        setContentView(R.layout.activity_main);

        MyTxt.setText("Inicializou");
    }
}
