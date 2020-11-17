package com.example.fragmento;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
Button botonIzquerdo;
Button botonDerecho;
Button botonInferior;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        botonIzquerdo= findViewById(R.id.botonIzquerdo);
        botonDerecho= findViewById(R.id.botonDerecho);
        botonInferior=findViewById(R.id.botonInferior);
        init();
    }

    private void init(){
        botonIzquerdo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                LeftFragment leftFrag = LeftFragment.newInstance("","");
                getSupportFragmentManager().beginTransaction().add(R.id.frameIzquierdo, leftFrag).commit();
            }
        });
        botonDerecho.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                RightFragment rightFrag= RightFragment.newInstance("","");
                getSupportFragmentManager().beginTransaction().add(R.id.frameDerecho, rightFrag).commit();
            }
        });
        botonInferior.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                BelowFragment belowFrag= BelowFragment.newInstance("","");
                getSupportFragmentManager().beginTransaction().add(R.id.frameInferior, belowFrag).commit();
            }
        });
    }
}