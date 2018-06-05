package com.biansemao.demo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

import com.biansemao.widget.ThermometerView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private ThermometerView thermometerTv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        thermometerTv = findViewById(R.id.tv_thermometer);

        findViewById(R.id.btn_anim).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                thermometerTv.setValueAndStartAnim(getRandomValue());
            }
        });
        findViewById(R.id.btn_operate).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                thermometerTv.setCurValue(getRandomValue());
            }
        });
    }

    private float getRandomValue(){
        float value = new Random().nextFloat() * 7 + 35;
        Log.i("MainActivity", "current value: " + value);
        return value;
    }

}
