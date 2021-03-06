package com.example.fitnetic;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class ProductActivity extends AppCompatActivity {

    private ImageView chest,back,legs,buttocks,forearms,triceps,biceps,abs;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_product);

        chest=(ImageView) findViewById(R.id.chest);
        back=(ImageView) findViewById(R.id.back);
        legs=(ImageView) findViewById(R.id.legs);
        buttocks=(ImageView) findViewById(R.id.buttocks);
        forearms=(ImageView) findViewById(R.id.forearms);
        triceps=(ImageView) findViewById(R.id.triceps);
        biceps=(ImageView) findViewById(R.id.biceps);
        abs=(ImageView) findViewById(R.id.abs);

        chest.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(ProductActivity.this, ChestActivity.class);
                startActivity(intent);
            }
        });

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(ProductActivity.this, BackActivity.class);
                startActivity(intent);
            }
        });

        legs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(ProductActivity.this, LegsActivity.class);
                startActivity(intent);
            }
        });

        buttocks.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(ProductActivity.this, ButtockActivity.class);
                startActivity(intent);
            }
        });

        forearms.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(ProductActivity.this, ForearmsActivity.class);
                startActivity(intent);
            }
        });


        triceps.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(ProductActivity.this, TricepsActivity.class);
                startActivity(intent);
            }
        });

        biceps.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(ProductActivity.this, BicepActivity.class);
                startActivity(intent);
            }
        });

        abs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(ProductActivity.this, AbsActivity.class);
                startActivity(intent);
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            Intent intent=new Intent(ProductActivity.this,SettingsActivity.class);
            startActivity(intent);
            return true;
        }

        if (id == R.id.action_bmi) {
            Intent intent=new Intent(ProductActivity.this,BodyreportActivity.class);
            startActivity(intent);
            return true;
        }

        if (id == R.id.action_contact) {
            Intent intent=new Intent(ProductActivity.this,ContactActivity.class);
            startActivity(intent);
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}


