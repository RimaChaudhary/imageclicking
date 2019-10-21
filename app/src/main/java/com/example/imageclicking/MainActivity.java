package com.example.imageclicking;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.ButtonBarLayout;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    Button click;
    ImageView I1, I2, I3, I4;
    int counter = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        I1 = findViewById(R.id.imageView2);
        I2 = findViewById(R.id.imageView3);
        I3 = findViewById(R.id.imageView4);
        I4 = findViewById(R.id.imageView5);
        click = findViewById(R.id.Click);
        click.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {

            if (counter > 3) {
                counter = 0;
            }

            if (counter == 0) {
                I1.setImageResource(R.drawable.flower1);
                I2.setImageResource(R.drawable.ic_launcher_background);
                I3.setImageResource(R.drawable.ic_launcher_background);
                I4.setImageResource(R.drawable.ic_launcher_background);
            }

            if (counter == 1) {
                I1.setImageResource(R.drawable.ic_launcher_background);
                I2.setImageResource(R.drawable.flower2);
                I3.setImageResource(R.drawable.ic_launcher_background);
                I4.setImageResource(R.drawable.ic_launcher_background);
            }

            if (counter == 2) {
                I1.setImageResource(R.drawable.ic_launcher_background);
                I2.setImageResource(R.drawable.ic_launcher_background);
                I3.setImageResource(R.drawable.flower3);
                I4.setImageResource(R.drawable.ic_launcher_background);
            }

            if (counter == 3) {
                I1.setImageResource(R.drawable.ic_launcher_background);
                I2.setImageResource(R.drawable.ic_launcher_background);
                I3.setImageResource(R.drawable.ic_launcher_background);
                I4.setImageResource(R.drawable.flower4);
            }
            counter++;
        }
    }








