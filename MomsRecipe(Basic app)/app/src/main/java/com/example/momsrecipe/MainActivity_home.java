package com.example.momsrecipe;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity_home extends AppCompatActivity {

    ImageView  image;
    TextView text;
    Handler handler;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_home);

        image = findViewById(R.id.main_image);
        text = findViewById(R.id.text_app);

        handler=new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent=new Intent(MainActivity_home.this,Gridview_recipe.class);
                startActivity(intent);
                finish();
            }
        },2000);


    }

}