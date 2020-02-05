package com.pensievedesigns.animations;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {



    public void fade(View v) {

        ImageView stewie = findViewById(R.id.stewie);
        Button animate = findViewById(R.id.animate);

        stewie.animate()
                .translationXBy(1000f)
                .rotation(1800f)
                .scaleX(0.5f)
                .scaleY(0.5f)
                .setDuration(2000);

//        ImageView peter = findViewById(R.id.peter);
//        peter.animate().alpha(1f).setDuration(2000);

    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        ImageView stewie = findViewById(R.id.stewie);

        stewie.setTranslationX(-1000f);


    }
}
