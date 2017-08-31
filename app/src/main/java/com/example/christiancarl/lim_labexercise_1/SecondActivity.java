package com.example.christiancarl.lim_labexercise_1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        Intent intent = getIntent();
        String RA = intent.getStringExtra("RA");
        String FinalGrade = intent.getStringExtra("FinalGrade");

        TextView ra = (TextView) findViewById(R.id.RA);
        ra.setText(RA);

        TextView finalGrade = (TextView) findViewById(R.id.FinalGrade);
        finalGrade.setText(FinalGrade);
    }

    public void Return(View view){
        Intent intent = new Intent(this, FirstActivity.class);
        startActivity(intent);
    }
}
