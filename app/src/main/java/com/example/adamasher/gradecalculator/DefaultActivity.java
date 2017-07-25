package com.example.adamasher.gradecalculator;

import android.content.Intent;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;


/**
 * Created by Adam Asher on 12/19/2016.
 */

public class DefaultActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void toLogin(View view) {
        startActivity(new Intent(this, IntermediateActivity.class));
    }
    public void toCalculator(View view){
        startActivity(new Intent(this, LoginActivity.class));
    }
}
