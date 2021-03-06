package com.example.fitnetic;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class BodyreportActivity extends AppCompatActivity {

    private Button calculate;
    private TextView statement,statement2;
    private EditText height,weight;
    private String h1,w1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bodyreport);

        calculate=(Button) findViewById(R.id.calculatebtn) ;
        statement=(TextView) findViewById(R.id.statement) ;
        statement2=(TextView) findViewById(R.id.statement2) ;
        height=(EditText) findViewById(R.id.height) ;
        weight=(EditText) findViewById(R.id.weight) ;

        calculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                h1 = height.getText().toString();
                w1 = weight.getText().toString();

                double number_height = Double.parseDouble(h1);
                double number_weight = Double.parseDouble(w1);

                if(number_height>0 && number_weight>0){
                    double bmi= (number_weight)/(number_height*number_height);
                    if(bmi<18.5){
                        statement.setText("Your Bmi is "+String.format("%.2f",bmi));
                        statement2.setText("you are underweight!");
                    }
                    else if(bmi<24.9){
                        statement.setText("Your Bmi is "+String.format("%.2f",bmi));
                        statement2.setText("you are normat weight. Congrats!");
                    }
                    else if(bmi<29.9){
                        statement.setText("Your Bmi is "+String.format("%.2f",bmi));
                        statement2.setText("you are Overweight!");
                    }
                    else if(bmi<34.9){
                        statement.setText("Your Bmi is "+String.format("%.2f",bmi));
                        statement2.setText("you come under Obese 1 section.");
                    }
                    else if(bmi<39.9){
                        statement.setText("Your Bmi is "+String.format("%.2f",bmi));
                        statement2.setText("you  come under Obese 2 category.");
                    }
                    else {
                        statement.setText("Your Bmi is "+String.format("%.2f",bmi));
                        statement2.setText(" Go see a doctor soon!");
                    }
                }
                else{
                    Toast.makeText(getBaseContext(), "You need Enter valid values" , Toast.LENGTH_SHORT ).show();
                }
            }
        });

    }
}