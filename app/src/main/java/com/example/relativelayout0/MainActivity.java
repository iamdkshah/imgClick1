package com.example.relativelayout0;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    Button btn;
    ImageView imgLion, imgTiger, imgSnake, imgBird;
    int counter = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn = findViewById(R.id.btn);
        imgLion = findViewById(R.id.imgLion);
        imgTiger = findViewById(R.id.imgTiger);
        imgSnake = findViewById(R.id.imgSnake);
        imgBird = findViewById(R.id.imgBird);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                counter++;

                if(counter==1){
                    imgLion.setVisibility(View.VISIBLE);
                    imgTiger.setVisibility(View.INVISIBLE);
                    imgSnake.setVisibility(View.INVISIBLE);
                    imgBird.setVisibility(View.INVISIBLE);

                }

                if(counter==2){
                    imgLion.setVisibility(View.INVISIBLE);
                    imgTiger.setVisibility(View.VISIBLE);
                    imgSnake.setVisibility(View.INVISIBLE);
                    imgBird.setVisibility(View.INVISIBLE);
                }

                if(counter==3){
                    imgLion.setVisibility(View.INVISIBLE);
                    imgTiger.setVisibility(View.INVISIBLE);
                    imgSnake.setVisibility(View.VISIBLE);
                    imgBird.setVisibility(View.INVISIBLE);
                }

                if(counter==4){
                    imgLion.setVisibility(View.INVISIBLE);
                    imgTiger.setVisibility(View.INVISIBLE);
                    imgSnake.setVisibility(View.INVISIBLE);
                    imgBird.setVisibility(View.VISIBLE);
                    counter=0;
                }
            }
        });
    }
}
