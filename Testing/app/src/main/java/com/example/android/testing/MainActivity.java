package com.example.android.testing;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText etFood, etPortion; // objek
    Intent intent;
    String restaurant, menu;
    int portion;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        etFood = (EditText)findViewById(R.id.et_food);
        etPortion = (EditText)findViewById(R.id.et_portion);
        intent = new Intent(this,Review.class);
    }

    public void onEatbus(View view) {
        menu = etFood.getText().toString();
        restaurant = "Eatbus";
        portion = Integer.parseInt(etPortion.getText().toString());
        int total = 50000 * portion;
        Log.d("TOTAL HARGA","Rp."+total);
        intent.putExtra("restaurant",restaurant);
        intent.putExtra("menu",menu);
        intent.putExtra("portion",portion);
        intent.putExtra("price",total);
        startActivity(intent);
    }

    public void onAbnormal(View view) {
        menu = etFood.getText().toString();
        restaurant = "Abnormal";
        portion = Integer.parseInt(etPortion.getText().toString());
        int total = 30000 * portion;
        Log.d("TOTAL HARGA","Rp."+total);
        intent.putExtra("restaurant",restaurant);
        intent.putExtra("menu",menu);
        intent.putExtra("portion",portion);
        intent.putExtra("price",total);
        startActivity(intent);
    }

}
