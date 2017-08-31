package com.example.christiancarl.lim_labexercise_1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class FirstActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);
    }

    public void Compute(View view){
        String FinalGrade = "";

        Intent intent = new Intent(this, SecondActivity.class);
        EditText Quiz1Fld = (EditText) findViewById(R.id.Quiz1_Fld);
        EditText Quiz2Fld = (EditText) findViewById(R.id.Quiz2_Fld);
        EditText SeatworksFld = (EditText) findViewById(R.id.Seatworks_Fld);
        EditText LabExerFld = (EditText) findViewById(R.id.LabExer_Fld);
        EditText MajorExam = (EditText) findViewById(R.id.MajorExam_Fld);

        double q1 = Double.parseDouble(Quiz1Fld.getText().toString());
        double q2 = Double.parseDouble(Quiz2Fld.getText().toString());
        double seatworks = Double.parseDouble(SeatworksFld.getText().toString());
        double labExer = Double.parseDouble(LabExerFld.getText().toString());
        double majorExam = Double.parseDouble(MajorExam.getText().toString());

        double RA = ((q1 * .10) + (q2 * .10) + (seatworks * .10) + (labExer * .40) + (majorExam * .30));

        if(RA < 60){
            FinalGrade = "FAILED";
        }else if(RA <= 65 ){
            FinalGrade = "3.00";
        }else if(RA <= 70){
            FinalGrade = "2.75";
        }else if(RA <= 75 ){
            FinalGrade = "2.50";
        }else if(RA <= 80){
            FinalGrade = "2.25";
        }else if(RA <= 85){
            FinalGrade = "2.00";
        }else if(RA <= 90){
            FinalGrade = "1.75";
        }else if(RA <= 92){
            FinalGrade = "1.50";
        }else if(RA <= 94){
            FinalGrade = "1.25";
        }else if(RA <= 100){
            FinalGrade = "1.0";
        }

        String str_RA = Double.toString(RA);

        intent.putExtra("RA", "Your RA is : " + str_RA);
        intent.putExtra("FinalGrade", "Your Final Grade is: " + FinalGrade);

        startActivity(intent);
    }
}
