package com.example.a.targileavia;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;

import java.util.Random;
public class MainActivity extends AppCompatActivity {
    ImageButton ib;
    ImageView iv;
    int num;
    Random rnd=new Random();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        iv= (ImageView)  findViewById(R.id.iv);
        ib= (ImageButton) findViewById(R.id.ib);
    }

    public void cli(View view) {
        num=rnd.nextInt(3)+1;
        switch (num){
            case 1: ib.setImageResource(R.drawable.e1png);
                iv.setImageResource(R.drawable.button1); break;
            case 2: ib.setImageResource(R.drawable.e3);
                iv.setImageResource(R.drawable.nutton2); break;
            case 3: ib.setImageResource(R.drawable.e4);
                iv.setImageResource(R.drawable.button3); break;
        }
    }
}

