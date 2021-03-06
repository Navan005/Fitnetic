package com.example.fitnetic;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class ForgotpasswordActivity extends AppCompatActivity {

    private Button joinNowButton, recoveryBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_forgotpassword);

        joinNowButton=(Button) findViewById(R.id.signup_btn);
        recoveryBtn=(Button) findViewById(R.id.recoveryBtn);

        recoveryBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast toast = Toast.makeText(getApplicationContext(),
                        "Temporary password sent to your email.",
                        Toast.LENGTH_SHORT);

                toast.show();
                //Intent intent=new Intent(ForgotpasswordActivity.this, LoginActivity.class);
                //startActivity(intent);
            }
        });

        joinNowButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(ForgotpasswordActivity.this, SignupActivity.class);
                startActivity(intent);
            }
        });
    }
}
