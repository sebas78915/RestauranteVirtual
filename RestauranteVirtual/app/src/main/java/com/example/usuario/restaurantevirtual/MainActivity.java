package com.example.usuario.restaurantevirtual;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    public Button carta;

    public void init(){
        carta=(Button)findViewById(R.id.BtnCarta);
        carta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent try = new Intent(MainActivity.this, Main2Activity.class);
                startActivity(try);
            }
        });
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        init();


    }
}
