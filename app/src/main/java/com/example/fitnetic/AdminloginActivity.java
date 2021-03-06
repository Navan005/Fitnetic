package com.example.fitnetic;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class AdminloginActivity extends AppCompatActivity {

    private Button joinNowButton, loginButton;
    private TextView userlogin, forgotPassword;
    private EditText uname,pssword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_adminlogin);

        joinNowButton=(Button) findViewById(R.id.signup_btn);
        loginButton=(Button) findViewById(R.id.login_btn);
        userlogin=(TextView) findViewById(R.id.user_login);
        forgotPassword=(TextView) findViewById(R.id.forget_Password);
        uname=(EditText) findViewById(R.id.login_uname);
        pssword=(EditText) findViewById(R.id.login_password);

        loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String gmailstr=uname.getText().toString();
                String passwordstr=pssword.getText().toString();
                String user="admin@gmail.com";
                String pass="123456";


                if((gmailstr.equals(user) && (passwordstr.equals(pass)))){
                    Intent intent = new Intent(AdminloginActivity.this, UpdateActivity.class);
                    startActivity(intent);
                }
                else{
                    Toast.makeText(getBaseContext(), "Username or password invalid" , Toast.LENGTH_SHORT ).show();
                }
            }
        });

        joinNowButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(AdminloginActivity.this, SignupActivity.class);
                startActivity(intent);
            }
        });

        userlogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(AdminloginActivity.this, LoginActivity.class);
                startActivity(intent);
            }
        });

        forgotPassword.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(AdminloginActivity.this, ForgotpasswordActivity.class);
                startActivity(intent);
            }
        });
    }
}
